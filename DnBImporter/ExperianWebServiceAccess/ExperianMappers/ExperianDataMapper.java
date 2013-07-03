package ExperianMappers;

import java.util.Calendar;
import java.util.Date;

import Application.XmlHelper;
import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.IntegerDatedValue;
import ExperianLtdCompanySearchWS.CCYYMM;
import ExperianLtdCompanySearchWS.CCYYMMDD;
import ExperianLtdCompanySearchWS.CompDebitMonthly;
import ExperianLtdCompanySearchWS.IndDebitMonthly;
import ExperianLtdCompanySearchWS.LtdCompanyData;
import ExperianLtdCompanySearchWS.ScoreHistory;
import ExperianLtdCompanySearchWS.SectorScore;
import ExperianNonLtdBusinessSearchWS.DebitMonthly;
import ExperianNonLtdBusinessSearchWS.NonLtdBusinessData;
import ExperianNonLtdBusinessSearchWS.NonLtdScoreHistory;

public class ExperianDataMapper 
{

	public ExperianData getExperianData(LtdCompanyData ltdCompanyData)
	{
		
		ExperianData experianData = new ExperianData(ltdCompanyData.getRegNumber(), ltdCompanyData.getCommercialName(), ExperianLegalStatus.LIMITED);
		
		// Commercial Delphi Scores
		if( ltdCompanyData.getCommercialDelphiHistory()!=null && ltdCompanyData.getCommercialDelphiHistory().getCompanyHistory()!=null)
		{
			for( ScoreHistory s : ltdCompanyData.getCommercialDelphiHistory().getCompanyHistory().getScoreHistory())
			{
				int score = XmlHelper.getIntegerFromXmlString(s.getCommDelphiScore());
				Date date = getCCYYMMDDDate(s.getScoreHistoryDate());
				experianData.getDelphiScores().add(new IntegerDatedValue(date, score));			
			}
		}
		// Commercial Delphi Industry Average Scores
		if( ltdCompanyData.getCommercialDelphiHistory()!=null && ltdCompanyData.getCommercialDelphiHistory().getSectorScore()!=null)
		{
			SectorScore sectorScore = ltdCompanyData.getCommercialDelphiHistory().getSectorScore();
			for( int i=0;i<sectorScore.getScoreHistoryDate().size();i++)
			{
				int industryAverageScore = XmlHelper.getIntegerFromXmlString(sectorScore.getIndHistoricalScore().getIndHistoricalAverageDelphiScore().get(i));
				Date date = getCCYYMMDDDate(sectorScore.getScoreHistoryDate().get(i));
				experianData.getDelphiScoresIndustryAverage().add(new IntegerDatedValue(date, industryAverageScore));
			}
		}
		// Payment Performance
		if( ltdCompanyData.getPaymentPerformance()!=null
				&& ltdCompanyData.getPaymentPerformance().getPaymentFull()!=null)
		{
			// DBT
			for( CompDebitMonthly monthlyData : ltdCompanyData.getPaymentPerformance().getPaymentFull().getCompanyDBTMonthly())
			{
				int days = monthlyData.getCompanyDBT();
				Date date = getCCYYMMDate(monthlyData.getCompanyExpMonth());
				experianData.getDaysBeyondTerms().add(new IntegerDatedValue(date, days));
			}
			// DBT Industry Average
			for( IndDebitMonthly monthlyData : ltdCompanyData.getPaymentPerformance().getPaymentFull().getIndDBTMonthly())
			{
				int days = monthlyData.getIndustryDBT();
				Date date = getCCYYMMDate(monthlyData.getIndExpMonth());
				experianData.getDaysBeyondTermsIndustryAverage().add(new IntegerDatedValue(date, days));
			}
		}

		return experianData;
	}
	
	public ExperianData getExperianData(NonLtdBusinessData nonLtdCompanyData)
	{
		ExperianData experianData = new ExperianData(nonLtdCompanyData.getNonLimitedKey(), nonLtdCompanyData.getBusinessName(), ExperianLegalStatus.NONLIMITED);
		// Commercial Delphi Scores
		if( nonLtdCompanyData.getCommercialDelphiHistory()!=null && nonLtdCompanyData.getCommercialDelphiHistory()!=null)
		{
			for( NonLtdScoreHistory s : nonLtdCompanyData.getCommercialDelphiHistory().getScoreHistory())
			{
				int score = XmlHelper.getIntegerFromXmlString(s.getCommDelphiScore());
				Date date = getCCYYMMDDDate(s.getScoreHistoryDate());
				experianData.getDelphiScores().add(new IntegerDatedValue(date, score));			
			}
		}
		// Payment Performance
		if( nonLtdCompanyData.getPaymentPerformance()!=null
				&& nonLtdCompanyData.getPaymentPerformance().getPaymentFull()!=null)
		{
			// DBT
			for( DebitMonthly monthlyData : nonLtdCompanyData.getPaymentPerformance().getPaymentFull().getDBTMonthly())
			{
				int days = monthlyData.getDBT();
				Date date = getCCYYMMDate(monthlyData.getExpMonth());
				experianData.getDaysBeyondTerms().add(new IntegerDatedValue(date, days));
			}
		}
		return experianData;
	}
	
	private Date getCCYYMMDate(ExperianLtdCompanySearchWS.CCYYMM theDate)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(theDate.getCCYY()), Integer.parseInt(theDate.getMM()), 1);
		return cal.getTime();
	}

	private Date getCCYYMMDate(ExperianNonLtdBusinessSearchWS.CCYYMM theDate)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(theDate.getCCYY()), Integer.parseInt(theDate.getMM()), 1);
		return cal.getTime();
	}
	
	private Date getCCYYMMDDDate(ExperianLtdCompanySearchWS.CCYYMMDD theDate)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(theDate.getCCYY()), Integer.parseInt(theDate.getMM()), Integer.parseInt(theDate.getDD()));
		return cal.getTime();
	}
	
	private Date getCCYYMMDDDate(ExperianNonLtdBusinessSearchWS.CCYYMMDD theDate)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(theDate.getCCYY()), Integer.parseInt(theDate.getMM()), Integer.parseInt(theDate.getDD()));
		return cal.getTime();
	}
}
