package Domain;

import java.util.Date;

public class DnBFailureRisk implements Comparable<DnBFailureRisk>
{
		// D&B Failure Risk (Financial Stress) Score
		/*
		 * D&B’s Failure Risk (Financial Stress) Scores predict the probability of severe financial distress or failure. Score Interpretation Tables contain specific definitions and interpretation tables for the countries in which D&B calculates Failure Risk or Financial Stress Scores. 
		 */
		private int failureRisk;
		// D&B Failure Risk (Financial Stress) Score National Percentile
		private int failureRiskNationalPercentile;
		// Effective Date
		private Date date;
		
		public DnBFailureRisk(int failureRisk, int percentile) { this(failureRisk, percentile, new Date()); }

		public DnBFailureRisk(int failureRisk, int percentile, Date date)
		{
			this.failureRisk=failureRisk;
			this.failureRiskNationalPercentile=percentile;
			this.date=date;
		}

		public int getFailureRisk() {
			return failureRisk;
		}

		public void setFailureRisk(int failureRisk) {
			this.failureRisk = failureRisk;
		}

		public int getFailureRiskNationalPercentile() {
			return failureRiskNationalPercentile;
		}

		public void setFailureRiskNationalPercentile(int failureRiskNationalPercentile) {
			this.failureRiskNationalPercentile = failureRiskNationalPercentile;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		@Override
		public int compareTo(DnBFailureRisk failureRiskCompare) 
		{
			return this.date.compareTo(failureRiskCompare.getDate());
		}
}
