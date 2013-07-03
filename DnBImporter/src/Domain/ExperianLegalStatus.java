package Domain;

public enum ExperianLegalStatus 
{
	LIMITED("L","Limited"), NONLIMITED("N","Non Limited"), UNKNOWN("U", "Unknown");
	
	private String description;
	private String id;
	
	private ExperianLegalStatus(String id, String description)
	{
		this.description = description;
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
	
	public static ExperianLegalStatus getExperianLegalStatusFromId(String id)
	{
		for(ExperianLegalStatus s : ExperianLegalStatus.values())
		{
			if(s.getId().equalsIgnoreCase(id))
				return s;
		}
		return ExperianLegalStatus.UNKNOWN;
	}

	public static ExperianLegalStatus getExperianLegalStatusFromDescription(String description)
	{
		for(ExperianLegalStatus s : ExperianLegalStatus.values())
		{
			if(s.getDescription().equalsIgnoreCase(description))
				return s;
		}
		return ExperianLegalStatus.UNKNOWN;
	}
}
