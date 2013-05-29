package Domain;

import java.util.Date;

public class DnBPaydex implements Comparable<DnBPaydex>
{
	// D&B PAYDEX
		/*
		 * 	The D&B payment score (D&B® Paydex®) is a score that assesses the payment performance of a business. Based on the trade experiences in D&B’s database, the score corresponds to an
			average days beyond terms or within terms enabling you to predict when your existing or potential customers are likely to pay. Derived from a dollar-weighted average of a company’s combined
			individual payment experiences, it ranges from 0 – 100 with higher scores representing businesses which pay their bills more promptly. The D&B® Paydex® Interpretation Tables contain interpretation
			tables for D&B’s payment score for specific countries.
		 */
		private int paydex;
		// D&B PAYDEX NORM
		// The industry median or average D&B® Paydex score for the subject’s Line of Business.
		private int paydexNorm;
		// effective date
		private Date date;
		
		public DnBPaydex(int paydex, int paydexNorm) { this(paydex, paydexNorm, new Date()); }
		
		public DnBPaydex(int paydex, int paydexNorm, Date date)
		{
			this.paydex=paydex;
			this.paydexNorm=paydexNorm;
			this.date=date;
		}
		
		public int getPaydex() {
			return paydex;
		}

		public void setPaydex(int paydex) {
			this.paydex = paydex;
		}

		public int getPaydexNorm() {
			return paydexNorm;
		}

		public void setPaydexNorm(int paydexNorm) {
			this.paydexNorm = paydexNorm;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		@Override
		public int compareTo(DnBPaydex paydexCompare) 
		{
			return this.date.compareTo(paydexCompare.getDate());
		}
}
