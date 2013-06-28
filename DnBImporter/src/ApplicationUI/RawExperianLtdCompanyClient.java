package ApplicationUI;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

public class RawExperianLtdCompanyClient extends RawExperianClient
{
		
	@Override
	protected void addBody(SOAPBody soapBody) throws SOAPException 
	{
        SOAPElement bti = soapBody.addChildElement("LtdCompanyRequest", "", "http://schema.uk.experian.com/experian/bi/limited/intr/v100/ltdbusinesssearch");
        SOAPElement regNo = bti.addChildElement("RegNumber");
        regNo.addTextNode(params[0]);
	}

	@Override
	protected String getAction()
	{
		return "http://services.experian.com/experian/wbsv/generic/bi/Experian.UK.BI.Services.Core.IServices/LimitedCompanyData";
	}
	
	@Override
	protected String getServiceURL() 
	{
		return "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/LtdCompanySearch.svc";
	}
}
