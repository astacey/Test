package Domain;

public enum RegistrationStatus 
{
	UNREGISTERED(""), PENDING("PENDING"), FAILED("FAILED"), ACTIVE("ACTIVE"), CANCELLED("CANCELLED");
	private String description;
	
	private RegistrationStatus (String description)
	{
		this.description = description;
	}
	
	// Possibly just use valueOf ???
	public static RegistrationStatus fromString(String description)
	{
		for(RegistrationStatus s : RegistrationStatus.values())
		{
			if(s.getDescription().equalsIgnoreCase(description))
				return s;
		}
		return RegistrationStatus.UNREGISTERED;
	}
	
	public String getDescription()
	{
		return description;
	}
}
