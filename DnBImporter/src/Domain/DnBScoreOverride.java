package Domain;

public enum DnBScoreOverride 
{
	CODE1("1", "Severe Negative Information"),CODE2("2", "Minimal Data"),CODE3("3", "New Business"),CODE4("4", "Out of Business"),CODE5("5", "Miscellaneous"),CODE6("6", "See Special Events"),CODE7("7", "Discontinued at this location"),CODE8("8", "Indication of Open Bankruptcy"),CODE9("9", "The subject is in financial distress: external administrator or receiver manager appointed, in liquidation, scheme of arrangement, out of business, mortgagee in possession, criminal investigation."),CODE10("10", "The subject of this report falls into an industry classification and/or legal structure that does not lend itself to risk scoring"),CODE11("11", "The subject is no longer in Financial Distress. However, until such time as deemed appropriate, a score will not be assigned."),CODE12("12", "The subject is a BRANCH of a FOREIGN company. Due to subject's current legal structure, Dun & Bradstreet is unable to assign a numerical score."),CODE13("13", "The subject is currently INOPERATIVE. Due to this status, D&B is unable to assign a numerical score."),CODE14("14", "The subject has been DEREGISTERED. Due to this status, a score has not been assigned."),CODE15("15", "The subject has a STRIKE OFF action in progress. Due to this status, D&B is unable to assign a numerical score."),CODE16("16", "Score is not available for the subject of this report."),CODE17("17", "At the time of this enquiry, D&B was unable to locate the subject of this report, therefore a risk score has not been assigned."),CODE18("18", "The subject's line of business is undetermined, therefore D&B is unable to assign a risk score (SIC absent, 0000 or 9999)."),CODE19("19", "A full investigation has not been undertaken by D&B on the subject of this report, therefore a risk score cannot be assigned. ");
	
	private String description;
	private String code;
	
	private DnBScoreOverride(String code, String description)
	{
		this.code=code;
		this.description=description;
	}
	
	public String getDescription()
	{
		return description;
	}

	public String getCode()
	{
		return code;
	}
	
	public static DnBScoreOverride getOverrideFromCode(String code)
	{
		for(DnBScoreOverride c : DnBScoreOverride.values())
		{
			if(c.getCode().equalsIgnoreCase(code))
				return c;
		}
		return null;
	}
}
