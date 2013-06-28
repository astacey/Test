package ApplicationUI;

import org.junit.Test;

import WebServiceClients.TokenServiceClient;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;


public class TestExperianClient {

	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/BusinessTarget.svc";
	private static final String XMLNS_WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	private static final String XSD_WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	
	public void test()
	{
		System.setProperty("javax.net.ssl.keyStoreType", "jks");
		System.setProperty("javax.net.ssl.keyStore", "/home/astacey/Experian/UNITUnit4U01U.jks");
		System.setProperty("javax.net.ssl.keyStorePassword", "Caste11");
		//System.setProperty("javax.net.debug","all");
		
		String token = TokenServiceClient.getInstance().getEncodedToken();
		
		try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            
            //createSOAPRequest("TESTING");
            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(token), serviceUrl);

            // Process the SOAP Response
            printSOAPResponse(soapResponse);

            soapConnection.close();
        } 
		catch (Exception e) 
		{
            System.err.println("Error occurred while sending SOAP Request to Server");
            e.printStackTrace();
        }
		
	}
	
	private SOAPMessage createSOAPRequest(String token) throws Exception 
	{
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("wsse", XSD_WSSE);
        envelope.addNamespaceDeclaration("wsu", XMLNS_WSU);
        
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement bti = soapBody.addChildElement("BusinessTargetInput", "ns3", "http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter");
        bti.addNamespaceDeclaration("", "http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes");
        bti.addNamespaceDeclaration("ns2", "http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes");
        
        SOAPElement searchType = bti.addChildElement("SearchType", "ns3");
        SOAPElement sc = searchType.addChildElement("SearchCorporates");
        sc.addTextNode("Y");
        SOAPElement ed = searchType.addChildElement("ExcludeDissolved");
        ed.addTextNode("Y");
        SOAPElement snc = searchType.addChildElement("SearchNonCorps");
        snc.addTextNode("Y");
        SOAPElement details = bti.addChildElement("BusinessDetails", "ns3");
        SOAPElement name = details.addChildElement("BusinessName");
        name.addTextNode("Unit4 Business Software");
        
        SOAPHeader head = envelope.getHeader();
        SOAPElement security = head.addChildElement("Security", "wsse");
        SOAPElement bst = security.addChildElement("BinarySecurityToken", "wsse");
        bst.addAttribute(new QName("ValueType"), "ExperianWASP");
        bst.addAttribute(new QName("EncodingType"), "wsse:Base64Binary");

        bst.addAttribute(new QName("wsu:Id"), "SecurityToken");
        
        bst.addTextNode(token);

       MimeHeaders headers = soapMessage.getMimeHeaders();
       headers.addHeader("SOAPAction", "http://services.experian.com/experian/wbsv/generic/bi/Experian.UK.BI.Services.Core.IServices/CallBusinessTarget");
        
        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message = ");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }
	
   private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.print("\nResponse SOAP Message = ");
        StreamResult result = new StreamResult(System.out);
        transformer.transform(sourceContent, result);
    }
}
