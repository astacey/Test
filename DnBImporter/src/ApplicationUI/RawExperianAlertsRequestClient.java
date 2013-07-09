package ApplicationUI;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

public class RawExperianAlertsRequestClient extends RawExperianClient
{
		
	@Override
	protected void addBody(SOAPBody soapBody) throws SOAPException 
	{
        SOAPElement main = soapBody.addChildElement("AlertsMessageInput", "", "http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest");

		SOAPElement bti = main.addChildElement("Paging", "", "http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest");
        SOAPElement firstTime = bti.addChildElement("FirstTimeFlag", "", "http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes");
        firstTime.addTextNode("Y");
        addStringElement(bti, "EndOfDataFlag", "Y");
        
        SOAPElement messages = main.addChildElement("Messages", "", "http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest");
        addStringElement(messages, "MessageType", "A");
        
        addStringElement(messages, "AdverseLegalMessages", "Y");
        addStringElement(messages, "AccountsMessages", "Y");
        addStringElement(messages, "GeneralMessages", "Y");
        addStringElement(messages, "CCJMessages", "Y");
        addStringElement(messages, "PaymentMessages", "Y");
        addStringElement(messages, "CommercialDelphiMessages", "Y");
        addStringElement(messages, "ExpiryMessages", "Y");
	
		SOAPElement loadedSince = messages.addChildElement("LoadedSince", "", "http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes");
		addStringElement(loadedSince, "CCYY", "2013","http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes");
		addStringElement(loadedSince, "MM", "07", "http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes");
		addStringElement(loadedSince, "DD", "01", "http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes");
		
	}

	@Override
	protected String getAction()
	{
		return "http://services.experian.com/experian/wbsv/generic/bi/Experian.UK.BI.Services.Core.IServices/RequestAlert";
	}
	
	@Override
	protected String getServiceURL() 
	{
		return "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/AlertsRequest.svc";
	}

	private void addStringElement(SOAPElement parent, String tagName, String value) throws SOAPException
	{
		addStringElement(parent, tagName, value, "http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes");
	}
	
	private void addStringElement(SOAPElement parent, String tagName, String value, String namespace) throws SOAPException
	{
		SOAPElement endOfData = parent.addChildElement(tagName, "", namespace);
        endOfData.addTextNode(value);
	}
}
