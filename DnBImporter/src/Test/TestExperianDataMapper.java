package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import ExperianLtdCompanySearchWS.ArrayOfString1;
import ExperianLtdCompanySearchWS.CCYYMM;
import ExperianLtdCompanySearchWS.CCYYMMDD;
import ExperianLtdCompanySearchWS.CommercialDelphiHistory;
import ExperianLtdCompanySearchWS.CompDebitMonthly;
import ExperianLtdCompanySearchWS.CompanyHistory;
import ExperianLtdCompanySearchWS.IndDebitMonthly;
import ExperianLtdCompanySearchWS.LtdCompanyData;
import ExperianLtdCompanySearchWS.PaymentFull;
import ExperianLtdCompanySearchWS.ScoreHistory;
import ExperianLtdCompanySearchWS.SectorScore;
import ExperianMappers.ExperianDataMapper;
import ExperianNonLtdBusinessSearchWS.PaymentPerformance;

public class TestExperianDataMapper {

	@Test
	public void testGetExperianDataLtdCompanyData() 
	{
		LtdCompanyData inputData = new LtdCompanyData();
		ScoreHistory score = new ScoreHistory();
		score.setScoreHistoryDate(getCCYYMMDD("2013", "06", "18"));
		score.setCommDelphiScore("99");
		inputData.setCommercialDelphiHistory(new CommercialDelphiHistory());
		inputData.getCommercialDelphiHistory().setCompanyHistory(new CompanyHistory());
		inputData.getCommercialDelphiHistory().getCompanyHistory().getScoreHistory().add(score);
		inputData.setCommercialName("Andy Company Name");
		
		SectorScore sectorScore = new SectorScore();
		sectorScore.setIndHistoricalScore(new ArrayOfString1());
		sectorScore.getScoreHistoryDate().add(getCCYYMMDD("2013","06","01"));
		sectorScore.getIndHistoricalScore().getIndHistoricalAverageDelphiScore().add("95");
		sectorScore.getScoreHistoryDate().add(getCCYYMMDD("2013","07","01"));
		sectorScore.getIndHistoricalScore().getIndHistoricalAverageDelphiScore().add("90");
		inputData.getCommercialDelphiHistory().setSectorScore(sectorScore);
		
	
		inputData.setPaymentPerformance(new ExperianLtdCompanySearchWS.PaymentPerformance());
		inputData.getPaymentPerformance().setPaymentFull(new PaymentFull());
		CompDebitMonthly cdm = new CompDebitMonthly();
		cdm.setCompanyDBT(50);
		cdm.setCompanyExpMonth(getCCYYMM("2013","07"));
		inputData.getPaymentPerformance().getPaymentFull().getCompanyDBTMonthly().add(cdm);
		
		IndDebitMonthly idm = new IndDebitMonthly();
		idm.setIndustryDBT(43);
		idm.setIndExpMonth(getCCYYMM("2013","06"));
		inputData.getPaymentPerformance().getPaymentFull().getIndDBTMonthly().add(idm);
		idm = new IndDebitMonthly();
		idm.setIndustryDBT(45);
		idm.setIndExpMonth(getCCYYMM("2013","07"));
		inputData.getPaymentPerformance().getPaymentFull().getIndDBTMonthly().add(idm);
		
		ExperianDataMapper mapper = new ExperianDataMapper();
		ExperianData actual = mapper.getExperianData(inputData);
		
		assertEquals("Name i correct","Andy Company Name",actual.getName());
		assertEquals("Legal Status should be limited", ExperianLegalStatus.LIMITED, actual.getLegalStatus());
		assertTrue("current delphi score is 99", 99==actual.getDelphiScores().get(0).getValue());
		assertTrue("current industry average delphi is 90", 90==actual.getDelphiScoresIndustryAverage().getCurrent().getValue());
		assertTrue("first industry average delphi is 95 ( last month )", 95==actual.getDelphiScoresIndustryAverage().get(0).getValue());
		assertTrue("current dbt is 50", 50==actual.getDaysBeyondTerms().getCurrent().getValue());
		assertTrue("current dbt inductry average is 45", 45==actual.getDaysBeyondTermsIndustryAverage().getCurrent().getValue());
	}
		
	private CCYYMM getCCYYMM(String year, String month)
	{
		CCYYMM date = new CCYYMM();
		date.setCCYY(year);
		date.setMM(month);
		return date;
	}
	
	private CCYYMMDD getCCYYMMDD(String year, String month, String day)
	{
		CCYYMMDD date = new CCYYMMDD();
		date.setCCYY(year);
		date.setMM(month);
		date.setDD(day);
		return date;
	}

	@Test
	public void testGetExperianDataNonLtdBusinessData() 
	{
	//	fail("Not yet implemented");
	}

}
