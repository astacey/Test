package ExperianMappers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.IntegerDatedValue;
import ExperianLtdCompanySearchWS.CCYYMMDD;
import ExperianLtdCompanySearchWS.LtdCompanyData;
import ExperianLtdCompanySearchWS.ScoreHistory;
import ExperianNonLtdBusinessSearchWS.NonLtdBusinessData;

public class ExperianDataMapper 
{

	public ExperianData getExperianData(LtdCompanyData ltdCompanyData)
	{
		
		ExperianData experianData = new ExperianData(ltdCompanyData.getRegNumber(), ltdCompanyData.getCommercialName(), ExperianLegalStatus.LIMITED);
		
		if( ltdCompanyData.getCommercialDelphiHistory()!=null && ltdCompanyData.getCommercialDelphiHistory().getCompanyHistory()!=null)
		{
			for( ScoreHistory s : ltdCompanyData.getCommercialDelphiHistory().getCompanyHistory().getScoreHistory())
			{
				int score = Integer.parseInt(s.getCommDelphiScore());
				Date date = getCCYYMMDDDate(s.getScoreHistoryDate());
				experianData.getDelphiScores().add(new IntegerDatedValue(date, score));			
			}
		}

		
		return experianData;
	}
	
	public ExperianData getExperianData(NonLtdBusinessData nonLtdCompanyData)
	{
		return null;
	}
	
	private Date getCCYYMMDDDate(CCYYMMDD theDate)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(theDate.getCCYY()), Integer.parseInt(theDate.getMM()), Integer.parseInt(theDate.getDD()));
		return cal.getTime();
	}
}
