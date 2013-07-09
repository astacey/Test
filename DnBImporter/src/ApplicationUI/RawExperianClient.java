package ApplicationUI;

import java.io.StringWriter;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import WebServiceClients.TokenServiceClient;

public abstract class RawExperianClient
{
	private static final String XMLNS_WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	private static final String XSD_WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	protected String[] params;
	
	public String getXml(String param)
	{
		return getXml(new String[]{param});
	}
	
	public String getXml(String[] params)
	{
		this.params=params;
		
		String result = "";
		
		try
		{
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            
            //createSOAPRequest("TESTING");
            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), getServiceURL());

            // Process the SOAP Response
            result = getSOAPResponse(soapResponse);

            soapConnection.close();
        } 
		catch (Exception e) 
		{
            System.err.println("Error occurred while sending SOAP Request to Server");
            e.printStackTrace();
        }
		return result;
	}
	
	protected abstract String getServiceURL();
	protected abstract void addBody(SOAPBody soapBody) throws SOAPException;
	protected abstract String getAction();
	
	private SOAPMessage createSOAPRequest() throws Exception 
	{
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("wsse", XSD_WSSE);
        envelope.addNamespaceDeclaration("wsu", XMLNS_WSU);
        
        // SOAP Body
        addBody(envelope.getBody());
        
        addHeader(envelope);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", getAction());
        
        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message = ");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }
	
	private String getSOAPResponse(SOAPMessage soapResponse) throws Exception 
	{
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
       
        StringWriter sw = new StringWriter();
        StreamResult result = new StreamResult(sw);
        transformer.transform( sourceContent, result);
        return sw.toString();
    }
	
	private void addHeader(SOAPEnvelope envelope)
	{
		try
		{
			String token = TokenServiceClient.getInstance().getEncodedToken();
	
			SOAPHeader head = envelope.getHeader();
	        SOAPElement security = head.addChildElement("Security", "wsse");
	        SOAPElement bst = security.addChildElement("BinarySecurityToken", "wsse");
	        bst.addAttribute(new QName("ValueType"), "ExperianWASP");
	        bst.addAttribute(new QName("EncodingType"), "wsse:Base64Binary");
	        bst.addAttribute(new QName("wsu:Id"), "SecurityToken");
	        
	        bst.addTextNode(token);
		}
		catch(SOAPException soape)
		{
			System.out.println(soape.getMessage());
		}
	}
}
