package DnBFullReportFetcher;

import java.util.ArrayList;

import DnBXmlMappers.DnBLookUpMapper;
import Domain.DnBLookupResult;
import WebServiceClients.LookUpClient;

public class DnBDunsSearch 
{
	private String username;
	private String password;
		
	public DnBDunsSearch(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public String lookupDuns(String companyName, String postCode, String address, String companyRegNo)
	{
		LookUpClient client = new LookUpClient(username, password);
		
		String lookupresult = client.performLookUp(companyName, postCode, address, companyRegNo);
		DnBLookUpMapper mapper = new DnBLookUpMapper();

		String resulthtml = "";
		ArrayList<DnBLookupResult> results = mapper.getLookupResultsFromXml(lookupresult);
		if(results.size()==0)
			resulthtml = "<p>The search did not return any results.</p>";
		else
		{
			resulthtml = "<table>";
			for(DnBLookupResult result : results)
			{
				String thisHTML = getResultHTML(result);
				resulthtml += "<tr><td>" + thisHTML + "</td></tr>";
			}
			resulthtml += "</table>";
		}
		return resulthtml;
	}
	
	private String getResultHTML(DnBLookupResult result)
	{
		String html = "<table>"
			+"<tr><td>DUNS Number</td><td><a href='index.jsp?duns=" + result.getDunsNumber() + "'>" + result.getDunsNumber() + "</a></td><tr>"
			+"<tr><td>Name</td><td>" + result.getName() + "</td><tr>"
			+"<tr><td>Address</td><td>" + result.getAddressLine1() + "</td><tr>"
			+"<tr><td>Town</td><td>" + result.getTown() + "</td><tr>"
			+"<tr><td>Post Code</td><td>" + result.getPostCode() + "</td><tr>"
			+"</table>";
		return html;
	}
}
