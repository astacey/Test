package Domain;

// Experian has different data for public and limited companies, could be interesting !
public class ExperianData
{
	// Unique Id for the company
	private String id;
	// Company name ( as experian sees it )
	private String name;
	// Legal status of business returned from the Business Targeter search - ‘L’ = Limited; ‘N’ = Non Limited
	private ExperianLegalStatus legalStatus;
	// Delphi Score - the main score from experian. 0-100. 100 = good, 0 = Bad
	private IntegerDatedValueCollection delphiScores;
	// Industry Average Delphi Score - the main score from experian. 0-100. 100 = good, 0 = Bad
	private IntegerDatedValueCollection delphiScoresIndustryAverage;
	// Days beyond terms
	private IntegerDatedValueCollection daysBeyondTerms;
	// Days beyond terms Industry Average
	private IntegerDatedValueCollection daysBeyondTermsIndustryAverage;
	
	public ExperianData(String id, String name, ExperianLegalStatus legalStatus)
	{
		this.name=name;
		this.id=id;
		this.legalStatus=legalStatus;
		this.delphiScores = new IntegerDatedValueCollection();
		this.delphiScoresIndustryAverage=new IntegerDatedValueCollection();
		this.daysBeyondTerms = new IntegerDatedValueCollection();
		this.daysBeyondTermsIndustryAverage=new IntegerDatedValueCollection();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExperianLegalStatus getLegalStatus() {
		return legalStatus;
	}

	public void setLegalStatus(ExperianLegalStatus legalStatus) {
		this.legalStatus = legalStatus;
	}

	public IntegerDatedValueCollection getDelphiScores() {
		return delphiScores;
	}

	public IntegerDatedValueCollection getDelphiScoresIndustryAverage() {
		return delphiScoresIndustryAverage;
	}

	public IntegerDatedValueCollection getDaysBeyondTerms() {
		return daysBeyondTerms;
	}

	public IntegerDatedValueCollection getDaysBeyondTermsIndustryAverage() {
		return daysBeyondTermsIndustryAverage;
	}
	
}
