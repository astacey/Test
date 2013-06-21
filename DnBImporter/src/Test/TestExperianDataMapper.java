package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import ExperianLtdCompanySearchWS.CCYYMMDD;
import ExperianLtdCompanySearchWS.CommercialDelphiHistory;
import ExperianLtdCompanySearchWS.CompanyHistory;
import ExperianLtdCompanySearchWS.LtdCompanyData;
import ExperianLtdCompanySearchWS.ScoreHistory;
import ExperianMappers.ExperianDataMapper;

public class TestExperianDataMapper {

	@Test
	public void testGetExperianDataLtdCompanyData() 
	{
		LtdCompanyData inputData = new LtdCompanyData();
		ScoreHistory score = new ScoreHistory();
		CCYYMMDD date = new CCYYMMDD();
		date.setCCYY("2013");
		date.setMM("06");
		date.setDD("18");
		score.setScoreHistoryDate(date);
		score.setCommDelphiScore("99");
		inputData.setCommercialDelphiHistory(new CommercialDelphiHistory());
		inputData.getCommercialDelphiHistory().setCompanyHistory(new CompanyHistory());
		inputData.getCommercialDelphiHistory().getCompanyHistory().getScoreHistory().add(score);
		inputData.setCommercialName("Andy Company Name");
		
		ExperianDataMapper mapper = new ExperianDataMapper();
		ExperianData actual = mapper.getExperianData(inputData);
		
		assertEquals("Name i correct","Andy Company Name",actual.getName());
		assertEquals("Legal Status should be limited", ExperianLegalStatus.LIMITED, actual.getLegalStatus());
		assertTrue("current delphi score is 99", 99==actual.getDelphiScores().get(0).getValue());
	}

	@Test
	public void testGetExperianDataNonLtdBusinessData() 
	{
	//	fail("Not yet implemented");
	}

}
