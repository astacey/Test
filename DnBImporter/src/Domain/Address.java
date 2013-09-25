package Domain;

import java.util.ArrayList;

public class Address 
{
	private String postCode="";
	private ArrayList<String> addressLines;
	private String town="";
	private String county="";
	private Country country;
	
	public Address()
	{
		this.addressLines = new ArrayList<String>();
	}
	
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public ArrayList<String> getAddressLines() {
		return addressLines;
	}

	public String getAddressLine1() {
		if(this.addressLines.size()==0)
			return "";
		return addressLines.get(0);
	}

	public String getAddressLine2() {
		if(this.addressLines.size()>=2)
			return addressLines.get(1);
		return "";
	}

	public String getAddressLine3() {
		if(this.addressLines.size()>=3)
			return addressLines.get(2);
		return "";
	}

	public String getAddressLine4() {
		if(this.addressLines.size()>=4)
			return addressLines.get(3);
		return "";
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	@Override
	public String toString() 
	{
		String address = "";
		for(String s : addressLines)
			address += s + System.getProperty("line.separator");
		if(town!=null)
			address += town + System.getProperty("line.separator");
		if(county!=null)
			address += county + System.getProperty("line.separator");
		if(country!=null)
			address += country.getDescription() + System.getProperty("line.separator");
		if(postCode!=null)
			address += postCode + System.getProperty("line.separator");
		return address;
	}
}
