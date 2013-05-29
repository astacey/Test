package Domain;

import java.util.Date;

public class DnBRating implements Comparable<DnBRating>
{
	// Calculate from 2 inputs ?? or calculate the 2 fields that make up D&B rating ?
	/* 	D&B uses several different rating classifications. The most common (e.g., 4A3) D&B Rating is divided into two parts: financial strength and composite credit
		appraisal. Financial Strength reflects company size based on worth computed by D&B. The Composite Credit Appraisal is an overall evaluation of credit worthiness.
		It takes into account the financial condition but also several non-financial factors such as trade payment history, length of operation, employee numbers, legal
		structure, management experience and any adverse listings. In some countries, D&B will use other information in its databases to assign ER (size by employee range)
		to businesses within specific industries or "1R", "2R," etc. ratings for companies without current financial statements on file. The Rating Interpretation Tables contain
		specific rating definitions and interpretation tables for countries around the world
		*/
	private String rating;
	// Date the rating took effect
	private Date date;

	public DnBRating(String rating)
	{
		this(rating, new Date());
	}
	public DnBRating(String rating, Date date)
	{
		this.rating=rating;
		this.date=date;
	}
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	// Returns the Risk Indicator portion of the D&B Rating
	/*Risk Meaning Probability of failure 
		1 = Minimal, risk Proceed with transaction - offer extended terms if required
		2 = Low risk, Proceed with transaction
		3 = Slightly greater than average risk, Proceed with transaction but monitor closely  
		4 = Significant level of risk, Take suitable assurances before extending credit - e.g. personal guarantees
		- = Insufficient information, No public information or D&B proprietary information to assign a risk indicator available to assign a valid
	 */
	public int getRiskIndicator()
	{
		int risk = -1;
		
		try
		{
			risk = Integer.parseInt(rating.substring(rating.length()-1));
		}
		catch(Exception e)
		{}
		
		return risk;
	}
/* When I'm good and ready !!!
 * 
	public String getFinancialStrength()
	{	
		return null;
	}
	*/

	@Override
	public int compareTo(DnBRating dbRating) 
	{
		return this.date.compareTo(dbRating.getDate());
	}
}
