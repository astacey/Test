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
	// Failure Risk Score Commentary - Not storing history to begin with, so this relates to the current score
	private ArrayList<DnBScoreCommentary> failureRiskScoreCommentary;
	// Credit Delinquency Score Commentary - Not storing history to begin with, so this relates to the current score
	private ArrayList<DnBScoreCommentary> creditDelinquencyScoreCommentary;	
	// Failure Risk Score Override - Not storing history to begin with, so this relates to the current score
	private DnBScoreOverride failureRiskScoreOverride;
	// Credit Delinquency Score Override - Not storing history to begin with, so this relates to the current score
	private DnBScoreOverride creditDelinquencyScoreOverride;
	// Main\Primary address of the company ( according to D&B ! )
	private Address mainAddress;
	// Used to grade the automated matching of a company to a D&B company
	// An alpha character 'MatchGrade' is assigned to each of the 11* components of the record
	// Business Name, Street #, Street Name, City, State, Mailing Address, telephone, Post Code, Density, Uniqueness, SIC
	// A - The element is a very close or exact match		
	// B - The element is a close match		
	// F - This element does not match		
	// Z - This element was not used in the match analysis		
	private String matchGrade;
	// Used to grade the automated matching of a company to a D&B company
	// 0 - 10. 0 or null - no match. 1-3 Low Confidence, 4-6 Medium, 7 - 10 High.
	private String matchConfidenceCode;
	
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
		this.failureRiskScoreCommentary=new ArrayList<DnBScoreCommentary>();
		this.creditDelinquencyScoreCommentary=new ArrayList<DnBScoreCommentary>();
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
			thisData += "\nD&B Failure Risk (Financial Stress) Score National Percentile : " + String.valueOf(failureRiskNationalPercentileHistory.getCurrent().getValue());
		if(failureRiskScoreCommentary.size()>0)
		{
			thisData += "\nFailure Risk Score Commentary :";
			for(DnBScoreCommentary comment : failureRiskScoreCommentary)
			{
				thisData += "\n\t" + comment.getCode() + " : " + comment.getDescription();
			}
		}
		if( failureRiskScoreOverride!=null)
			thisData += "\nFailure Risk Score Override: " + failureRiskScoreOverride.getCode() + " : " + failureRiskScoreOverride.getDescription();
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
		if(creditDelinquencyScoreCommentary.size()>0)
		{
			thisData += "\nCredit Delinquency Score Commentary :";
			for(DnBScoreCommentary comment : creditDelinquencyScoreCommentary)
			{
				thisData += "\n\t" + comment.getCode() + " : " + comment.getDescription();
			}
		}
		if( creditDelinquencyScoreOverride!=null)
			thisData += "\nCredit Delinquency Score Override: " + creditDelinquencyScoreOverride.getCode() + " : " + creditDelinquencyScoreOverride.getDescription();
		
		thisData += "\nOut of Business Indicator : " + outOfBusiness;
		thisData += "\nPrimary SIC Code : " + primarySicCode;
		
		if(mainAddress!=null)
			thisData += "\nAddress : " + mainAddress.toString();
		
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

	public ArrayList<DnBScoreCommentary> getFailureRiskScoreCommentary() {
		return failureRiskScoreCommentary;
	}

	public ArrayList<DnBScoreCommentary> getCreditDelinquencyScoreCommentary() {
		return creditDelinquencyScoreCommentary;
	}

	public DnBScoreOverride getFailureRiskScoreOverride() {
		return failureRiskScoreOverride;
	}

	public void setFailureRiskScoreOverride(
			DnBScoreOverride failureRiskScoreOverride) {
		this.failureRiskScoreOverride = failureRiskScoreOverride;
	}

	public DnBScoreOverride getCreditDelinquencyScoreOverride() {
		return creditDelinquencyScoreOverride;
	}

	public void setCreditDelinquencyScoreOverride(
			DnBScoreOverride creditDelinquencyScoreOverride) {
		this.creditDelinquencyScoreOverride = creditDelinquencyScoreOverride;
	}

	public Address getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(Address mainAddress) {
		this.mainAddress = mainAddress;
	}

	public String getMatchGrade() {
		return matchGrade;
	}

	public void setMatchGrade(String matchGrade) {
		this.matchGrade = matchGrade;
	}

	public String getMatchConfidenceCode() {
		return matchConfidenceCode;
	}

	public void setMatchConfidenceCode(String matchConfidenceCode) {
		this.matchConfidenceCode = matchConfidenceCode;
	}
}
