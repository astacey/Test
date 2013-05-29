package Domain;

public enum CompanyType 
{
	UNKNOWN("U", "Unknown", "Unknown"), SUPPLIER("A", "Suppliers", "Supplier"), PARTNER("B", "Partners", "Partner"), CUSTOMER("C", "Customers", "Customer");
	private String description;
	private String singularDescription;
	private String id;
	
	
	private CompanyType (String id, String description, String singularDescription)
	{
		this.description = description;
		this.singularDescription = singularDescription;
		this.id = id;
	}
	
	public String getDescription()
	{
		return description;
	}

	public String getId()
	{
		return id;
	}

	public String getSingularDescription() 
	{
		return singularDescription;
	}
	
	public static CompanyType getCompanyTypeFromDescription(String description)
	{
		for(CompanyType c : CompanyType.values())
		{
			// match description or singular version
			if(c.getDescription().equalsIgnoreCase(description) || c.getSingularDescription().equalsIgnoreCase(description))
				return c;
		}
		return CompanyType.UNKNOWN; // Default - good idea ?
	}
	

	public static CompanyType getCompanyTypeFromId(String id)
	{
		for(CompanyType c : CompanyType.values())
		{
			if(c.getId().equalsIgnoreCase(id))
				return c;
		}
		return CompanyType.UNKNOWN; // Default - good idea ?
	}
}
