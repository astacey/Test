package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import ExperianLtdCompanySearchWS.ArrayOfString1;
import ExperianLtdCompanySearchWS.CommercialDelphiHistory;
import ExperianLtdCompanySearchWS.CompDebitMonthly;
import ExperianLtdCompanySearchWS.CompanyHistory;
import ExperianLtdCompanySearchWS.IndDebitMonthly;
import ExperianLtdCompanySearchWS.LtdCompanyData;
import ExperianLtdCompanySearchWS.PaymentFull;
import ExperianLtdCompanySearchWS.ScoreHistory;
import ExperianLtdCompanySearchWS.SectorScore;
import ExperianMappers.ExperianDataMapper;
import ExperianNonLtdBusinessSearchWS.DebitMonthly;
import ExperianNonLtdBusinessSearchWS.DelphiHistoryAndScore;
import ExperianNonLtdBusinessSearchWS.NonLtdBusinessData;
import ExperianNonLtdBusinessSearchWS.NonLtdScoreHistory;
import ExperianNonLtdBusinessSearchWS.PaymentPerformance;
import ExperianNonLtdBusinessSearchWS.PaymentPerformanceFullDetails;

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
		
		assertEquals("Name is correct","Andy Company Name",actual.getName());
		assertEquals("Legal Status should be limited", ExperianLegalStatus.LIMITED, actual.getLegalStatus());
		assertTrue("current delphi score is 99", 99==actual.getDelphiScores().get(0).getValue());
		assertTrue("current industry average delphi is 90", 90==actual.getDelphiScoresIndustryAverage().getCurrent().getValue());
		assertTrue("first industry average delphi is 95 ( last month )", 95==actual.getDelphiScoresIndustryAverage().get(0).getValue());
		assertTrue("current dbt is 50", 50==actual.getDaysBeyondTerms().getCurrent().getValue());
		assertTrue("current dbt inductry average is 45", 45==actual.getDaysBeyondTermsIndustryAverage().getCurrent().getValue());
	}
		
	private ExperianLtdCompanySearchWS.CCYYMM getCCYYMM(String year, String month)
	{
		ExperianLtdCompanySearchWS.CCYYMM date = new ExperianLtdCompanySearchWS.CCYYMM();
		date.setCCYY(year);
		date.setMM(month);
		return date;
	}
	
	private ExperianNonLtdBusinessSearchWS.CCYYMM getCCYYMMNonLtd(String year, String month)
	{
		ExperianNonLtdBusinessSearchWS.CCYYMM date = new ExperianNonLtdBusinessSearchWS.CCYYMM();
		date.setCCYY(year);
		date.setMM(month);
		return date;
	}
	
	private ExperianLtdCompanySearchWS.CCYYMMDD getCCYYMMDD(String year, String month, String day)
	{
		ExperianLtdCompanySearchWS.CCYYMMDD date = new ExperianLtdCompanySearchWS.CCYYMMDD();
		date.setCCYY(year);
		date.setMM(month);
		date.setDD(day);
		return date;
	}

	private ExperianNonLtdBusinessSearchWS.CCYYMMDD getCCYYMMDDNonLtd(String year, String month, String day)
	{
		ExperianNonLtdBusinessSearchWS.CCYYMMDD date = new ExperianNonLtdBusinessSearchWS.CCYYMMDD();
		date.setCCYY(year);
		date.setMM(month);
		date.setDD(day);
		return date;
	}

	@Test
	public void testGetExperianDataNonLtdBusinessData() 
	{
		NonLtdBusinessData inputData = new NonLtdBusinessData();
		NonLtdScoreHistory score = new NonLtdScoreHistory();
		score.setScoreHistoryDate(getCCYYMMDDNonLtd("2013", "06", "18"));
		score.setCommDelphiScore("99");
		inputData.setCommercialDelphiHistory(new DelphiHistoryAndScore());
		inputData.getCommercialDelphiHistory().getScoreHistory().add(score);
		inputData.setBusinessName("Andy Company Name");
		
		inputData.setPaymentPerformance(new PaymentPerformance());
		inputData.getPaymentPerformance().setPaymentFull(new PaymentPerformanceFullDetails());
		DebitMonthly cdm = new DebitMonthly();
		cdm.setDBT(50);
		cdm.setExpMonth(getCCYYMMNonLtd("2013","07"));
		inputData.getPaymentPerformance().getPaymentFull().getDBTMonthly().add(cdm);
		
		ExperianDataMapper mapper = new ExperianDataMapper();
		ExperianData actual = mapper.getExperianData(inputData);
		
		assertEquals("Name is correct","Andy Company Name",actual.getName());
		assertEquals("Legal Status should be non limited", ExperianLegalStatus.NONLIMITED, actual.getLegalStatus());
		assertTrue("current delphi score is 99", 99==actual.getDelphiScores().getCurrent().getValue());
		assertTrue("current dbt is 50", 50==actual.getDaysBeyondTerms().getCurrent().getValue());
	}

}
