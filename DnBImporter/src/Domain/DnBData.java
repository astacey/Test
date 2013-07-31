package Domain;

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
	private DnBRatingCollection dbRatingHistory;
	// D&BFailure Risk Score History
	// D&B’s Failure Risk (Financial Stress) Scores predict the probability of severe financial distress or failure. Score Interpretation Tables contain specific definitions and interpretation tables for the countries in which D&B calculates Failure Risk or Financial Stress Scores.
	private IntegerDatedValueCollection failureRiskScoreHistory;
	// D&B Failure Risk (Financial Stress) Score National Percentile
	private IntegerDatedValueCollection failureRiskNationalPercentileHistory;
	// D&B PAYDEX
	/*
	 * 	The D&B payment score (D&B® Paydex®) is a score that assesses the payment performance of a business. Based on the trade experiences in D&B’s database, the score corresponds to an
		average days beyond terms or within terms enabling you to predict when your existing or potential customers are likely to pay. Derived from a dollar-weighted average of a company’s combined
		individual payment experiences, it ranges from 0 – 100 with higher scores representing businesses which pay their bills more promptly. The D&B® Paydex® Interpretation Tables contain interpretation
		tables for D&B’s payment score for specific countries.
	 */
	// D&B PAYDEX History
	private IntegerDatedValueCollection paydexScoreHistory;
	// D&B PAYDEX NORM
	// The industry median or average D&B® Paydex score for the subject’s Line of Business.
	private IntegerDatedValueCollection paydexNormHistory;
	// Primary SIC Code
	private int primarySicCode;
	// DnB Registration Details
	private DnBRegistration dnbRegistrationDetails;
	// DnB OutOfBusiness indicator
	private Boolean outOfBusiness;
	// MAXIMUM CREDIT RECOMMENDATION 
	//Maximum amount of credit recommended.  For Europe only.
	private MoneyDatedValueCollection maximumCreditRecommendationHistory;	
	// Credit Delinquency Score National Percentile
	/* The Credit (Delinquency) Score Percentile illustrates where a company falls among businesses in the D&B information base, 
	 * and is most effectively used by customers to rank order their portfolios from highest to lowest risk of delinquency.  
	 * The Percentile is based on a 1 – 100 scale, where a 1 represents businesses that have the highest probability of severe 
	 * delinquency, and a 100 which represents businesses with the lowest probability of severe delinquency.
	 */
	private IntegerDatedValueCollection creditDelinquencyNationalPercentileHistory;
	// CASH AND LIQUID ASSETS
	// Amount of Cash on hand and in banks and other liquid assets where available.
	private MoneyDatedValueCollection cashLiquidAssetsHistory;
	// Default Currency
	private Currency defaultCurrency;
	// Maximum Credit Recommendation Currency
	// Currency Code for credit recommendation amount if different than default
	private Currency maximumCreditRecommendationCurrency;
	
	public DnBData() { this(0);	}
	
	public DnBData(int dunsNumber)
	{
		//this.dunsNumber = dunsNumber;
		this.dbRatingHistory = new DnBRatingCollection();
		this.failureRiskScoreHistory = new IntegerDatedValueCollection();
		this.failureRiskNationalPercentileHistory = new IntegerDatedValueCollection();
		this.paydexScoreHistory = new IntegerDatedValueCollection();
		this.paydexNormHistory = new IntegerDatedValueCollection();
		this.dnbRegistrationDetails = new DnBRegistration(dunsNumber);
		this.maximumCreditRecommendationHistory = new MoneyDatedValueCollection();
		this.creditDelinquencyNationalPercentileHistory = new IntegerDatedValueCollection();
		this.cashLiquidAssetsHistory = new MoneyDatedValueCollection();
		this.outOfBusiness = false;
	}
	
	@Override
	public String toString() 
	{
		String thisData = "DUNS No : " + String.valueOf(getDunsNumber())
				+"\nName : " + name;
		if( getCurrentRating() != null )
			thisData += "\nD&B Rating : " + getCurrentRating().getRating() ;
		if( failureRiskScoreHistory.size()>0)
			thisData += "\nD&B Failure Risk (Financial Stress) Score : " + String.valueOf(failureRiskScoreHistory.getCurrent().getValue());
		if( failureRiskNationalPercentileHistory.size()>0)
			thisData += "\nD&B Failure Risk (Financial Stress) Score Ntional Percentile : " + String.valueOf(failureRiskNationalPercentileHistory.getCurrent().getValue());
		if( paydexScoreHistory.size()>0)
			thisData += "\nD&B PAYDEX : " + String.valueOf(paydexScoreHistory.getCurrent().getValue());
		if( paydexNormHistory.size()>0)
			thisData += "\nD&B PAYDEX Norm: " + String.valueOf(paydexNormHistory.getCurrent().getValue());
		if( maximumCreditRecommendationHistory.size()>0)
			thisData += "\nMaximum Credit Recommendation: " + String.valueOf(maximumCreditRecommendationHistory.getCurrent().getValue().getValue()) + " " + maximumCreditRecommendationHistory.getCurrent().getValue().getCurrency().getDescription();
		if( cashLiquidAssetsHistory.size()>0)
			thisData += "\nCash and Liquid Assets: " + String.valueOf(cashLiquidAssetsHistory.getCurrent().getValue().getValue()) + " " + cashLiquidAssetsHistory.getCurrent().getValue().getCurrency().getDescription();
		if( creditDelinquencyNationalPercentileHistory.size()>0)
			thisData += "\nCredit Delinquency National Percentile: " + String.valueOf(creditDelinquencyNationalPercentileHistory.getCurrent().getValue());
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

	public IntegerDatedValueCollection getFailureRiskScoreHistory() {
		return failureRiskScoreHistory;
	}

	public IntegerDatedValueCollection getFailureRiskPercentileHistory() {
		return failureRiskNationalPercentileHistory;
	}
	
	public IntegerDatedValueCollection getPaydexScoreHistory() {
		return paydexScoreHistory;
	}

	public IntegerDatedValueCollection getPaydexNormHistory() {
		return paydexNormHistory;
	}

	public DnBRatingCollection getDbratingHistory() {
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
	
	public DnBRegistration getRegistrationDetails() {
		return dnbRegistrationDetails;
	}

	public Boolean getOutOfBusiness() {
		return outOfBusiness;
	}

	public void setOutOfBusiness(Boolean outOfBusiness) {
		this.outOfBusiness = outOfBusiness;
	}
	
	public void setCommitted()
	{
		this.failureRiskNationalPercentileHistory.setCommitted();
		this.failureRiskScoreHistory.setCommitted();
		this.paydexNormHistory.setCommitted();
		this.paydexScoreHistory.setCommitted();
		this.dbRatingHistory.setCommitted();
		this.maximumCreditRecommendationHistory.setCommitted();
	}

	public MoneyDatedValueCollection getMaximumCreditRecommendation() {
		return maximumCreditRecommendationHistory;
	}

	public IntegerDatedValueCollection getCreditDelinquencyNationalPercentileHistory() {
		return creditDelinquencyNationalPercentileHistory;
	}

	public MoneyDatedValueCollection getCashLiquidAssetsHistory() {
		return cashLiquidAssetsHistory;
	}

	public Currency getDefaultCurrency() {
		return defaultCurrency;
	}

	public void setDefaultCurrency(Currency defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public Currency getMaximumCreditRecommendationCurrency() {
		if(maximumCreditRecommendationCurrency!=null)
			return maximumCreditRecommendationCurrency;
		return defaultCurrency;
	}

	public void setMaximumCreditRecommendationCurrency(
			Currency maximumCreditRecommendationCurrency) {
		this.maximumCreditRecommendationCurrency = maximumCreditRecommendationCurrency;
	}
}
