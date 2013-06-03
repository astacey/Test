package Domain;

import java.util.ArrayList;
import java.util.Collections;

public class DnBData 
{
	// Unique identifier for a company in the Dunn and Bradstreet world
	/*
	 *  The D&B® D-U-N-S® Number, which stands for Data Universal Numbering System, is a 9-digit non-indicative identification number (e.g., 75-000-0018) assigned by Dun &
		Bradstreet to each separate commercial entity in the Dun & Bradstreet database. In other words, each record is given a different number. For businesses with multiple
		locations, each location is assigned its own unique D&B® D-U-N-S® Number. This field is always populated and contains the D&B® D-U-N-S® number of the business
		that all other data elements in the record describe.
	 */
	// Primary Name
	private String name;
	//D&B Ratings
	private ArrayList<DnBRating> dbRatingHistory;
	// D&BFailure Risk History
	private ArrayList<DnBFailureRisk> failureRiskHistory;
	// D&B PAYDEX History
	private ArrayList<DnBPaydex> paydexHistory;
	// Primary SIC Code
	private int primarySicCode;
	// DnB Registration Details
	private DnBRegistration dnbRegistrationDetails;
	// DnB OutOfBusiness indicator
	private Boolean outOfBusiness;
	
	public DnBData() { this(0);	}
	
	public DnBData(int dunsNumber)
	{
		//this.dunsNumber = dunsNumber;
		this.dbRatingHistory = new ArrayList<DnBRating>();
		this.failureRiskHistory = new ArrayList<DnBFailureRisk>();
		this.paydexHistory = new ArrayList<DnBPaydex>();
		this.dnbRegistrationDetails = new DnBRegistration(dunsNumber);
		this.outOfBusiness = false;
	}
	
	@Override
	public String toString() 
	{
		String thisData = "DUNS No : " + String.valueOf(getDunsNumber())
				+"\nName : " + name;
		if( getCurrentRating() != null )
			thisData += "\nD&B Rating : " + getCurrentRating().getRating() ;
		if( getCurrentFailureRisk() != null)
			thisData += "\nD&B Failure Risk (Financial Stress) Score : " + String.valueOf(getCurrentFailureRisk().getFailureRisk())
					+"\nD&B Failure Risk (Financial Stress) Score Ntional Percentile : " + String.valueOf(getCurrentFailureRisk().getFailureRiskNationalPercentile());
		if( getCurrentPaydex() != null)
			thisData += "\nD&B PAYDEX : " + String.valueOf(getCurrentPaydex().getPaydex())
					+"\nD&B PAYDEX Norm: " + String.valueOf(getCurrentPaydex().getPaydexNorm());
		thisData += "\nPrimary SIC Code : " + primarySicCode;
		
		return thisData;
	}
	
	public int getDunsNumber() {
		return dnbRegistrationDetails.getDunsNo();
	}

	public void setDunsNumber(int dunsNumber) {
		dnbRegistrationDetails.setDunsNo(dunsNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrimarySicCode() {
		return primarySicCode;
	}

	public void setPrimarySicCode(int primarySicCode) {
		this.primarySicCode = primarySicCode;
	}

	public ArrayList<DnBRating> getDbratingHistory() {
		return dbRatingHistory;
	}
	
	public DnBRating getCurrentRating()
	{
		if(dbRatingHistory.size()>0)
		{
			Collections.sort(dbRatingHistory);
			return dbRatingHistory.get(dbRatingHistory.size()-1);
		}
		return null;
	}

	public ArrayList<DnBFailureRisk> getFailureRiskHistory() {
		return failureRiskHistory;
	}

	public DnBFailureRisk getCurrentFailureRisk()
	{
		if(failureRiskHistory.size()>0)
		{
			Collections.sort(failureRiskHistory);
			return failureRiskHistory.get(failureRiskHistory.size()-1);
		}
		return null;
	}

	public ArrayList<DnBPaydex> getPaydexHistory() {
		return paydexHistory;
	}
	
	public DnBPaydex getCurrentPaydex()
	{
		if(paydexHistory.size()>0)
		{
			Collections.sort(paydexHistory);
			return paydexHistory.get(paydexHistory.size()-1);
		}
		return null;
	}

	public DnBRegistration getRegistrationDetails() {
		return dnbRegistrationDetails;
	}

	public Boolean getOutOfBusiness() {
		return outOfBusiness;
	}

	public void setOutOfBusiness(Boolean outOfBusiness) {
		this.outOfBusiness = outOfBusiness;
	}
}
