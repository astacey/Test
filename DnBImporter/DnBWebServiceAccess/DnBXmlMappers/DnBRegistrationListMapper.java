package DnBXmlMappers;

import Application.XmlHelper;

public class DnBRegistrationListMapper 
{

	public String getResultTicket(String xml)
	{
		return XmlHelper.getStringFromXPath(xml, "//GLBLMNSVCMSGSRSV1/REGNLISTTRNRS/RSLT_TKT");
	}
}
