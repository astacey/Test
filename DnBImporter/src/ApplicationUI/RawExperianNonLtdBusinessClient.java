package ApplicationUI;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

public class RawExperianNonLtdBusinessClient extends RawExperianClient 
{
	@Override
	protected String getServiceURL() 
	{
		return "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/NonLtdBusinessSearch.svc";
	}

	@Override
	protected void addBody(SOAPBody soapBody) throws SOAPException 
	{
		SOAPElement bti = soapBody.addChildElement("NonLtdBusinessRequest", "", "http://schema.uk.experian.com/experian/bi/nonlimited/intr/v100/nonltdbusinesssearch");
        SOAPElement regNo = bti.addChildElement("NonLimitedKey");
        regNo.addTextNode(params[0]);
	}

	@Override
	protected String getAction() 
	{
		return "http://services.experian.com/experian/wbsv/generic/bi/Experian.UK.BI.Services.Core.IServices/NonLtdBusinessSearch";
	}

}
