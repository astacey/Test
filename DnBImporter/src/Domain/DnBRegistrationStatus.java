package Domain;

public enum DnBRegistrationStatus 
{
	UNREGISTERED(""), PENDING("PENDING"), FAILED("FAILED"), ACTIVE("ACTIVE"), CANCELLED("CANCELLED");
	private String description;
	
	private DnBRegistrationStatus (String description)
	{
		this.description = description;
	}
	
	// Possibly just use valueOf ???
	public static DnBRegistrationStatus fromString(String description)
	{
		for(DnBRegistrationStatus s : DnBRegistrationStatus.values())
		{
			if(s.getDescription().equalsIgnoreCase(description))
				return s;
		}
		return DnBRegistrationStatus.UNREGISTERED;
	}
	
	public String getDescription()
	{
		return description;
	}
}
