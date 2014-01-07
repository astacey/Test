package Domain;

public class DnBLookupResult 
{
	String name;
	String addressLine1;
	String postCode;
	String dunsNumber;
	String town;
	
	public String getName() {
		if(name==null)
			return "";
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		if(addressLine1==null)
			return "";
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getPostCode() {
		if(postCode==null)
			return "";
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getDunsNumber() {
		if(dunsNumber==null)
			return "";
		return dunsNumber;
	}
	public void setDunsNumber(String dunsNumber) {
		this.dunsNumber = dunsNumber;
	}
	public String getTown() {
		if(town==null)
			return "";
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}	
}
