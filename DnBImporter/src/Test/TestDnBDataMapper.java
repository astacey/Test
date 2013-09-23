package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import DnBXmlMappers.DnBDataMapper;
import Domain.Country;
import Domain.Currency;
import Domain.DnBData;

public class TestDnBDataMapper {

	@Test
	public void testGetDnBDataFromXml() 
	{
		// test string is unit 4, duns 225314921
		String testXml = "<CREDITMSGSRSV2 xmlns:ns2=\"http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP\"><DATATRNRS><TRNUID>Id-c6a0c1ef5180f962328b52f7-2</TRNUID><STATUS><CODE>0</CODE><SEVERITY>INFO</SEVERITY></STATUS><DATARS><SRVRTID>14774883</SRVRTID><CACHE_IND>Y</CACHE_IND><DUNS_NBR>225314921</DUNS_NBR><PRIM_NME>UNIT4 BUSINESS SOFTWARE & LTD</PRIM_NME><ADR_LINE><ArrayOfstringItem>ST GEORGES HALL</ArrayOfstringItem><ArrayOfstringItem>ST GEORGES HILL, EASTON-IN-GORDANO</ArrayOfstringItem></ADR_LINE><POST_TOWN>BRISTOL</POST_TOWN><PRIM_GEO_AREA>AVON</PRIM_GEO_AREA><POST_CODE>BS20 0PX</POST_CODE><CTRY_CD>GB</CTRY_CD><BR_IND>N</BR_IND><ACT_PAY>135000</ACT_PAY><ACT_REC>17482000</ACT_REC><ADR_TENR_TYPE_CD><ArrayOfstringItem>H</ArrayOfstringItem></ADR_TENR_TYPE_CD><AUDT_IND>Y</AUDT_IND><AVG_HIGH_CR>2982</AVG_HIGH_CR><BUS_REGN_NBR>1737985</BUS_REGN_NBR><BUS_REGN_NBR_TYPE_CD>AEB</BUS_REGN_NBR_TYPE_CD><BUS_STRU>Y</BUS_STRU><CASH_LIQ_ASET>373000</CASH_LIQ_ASET><CLM_IND>N</CLM_IND><CONS_IND>N</CONS_IND><CRCY_CD>GBP</CRCY_CD><CRIM_IND>N</CRIM_IND><CURR_RATO>1</CURR_RATO><DNB_RATG>5A1</DNB_RATG><DOM_ULT_CTRY_CD>GB</DOM_ULT_CTRY_CD><DOM_ULT_PNT_DUNS>225314921</DOM_ULT_PNT_DUNS><DOM_ULT_PNT_NME>UNIT4 BUSINESS SOFTWARE LTD</DOM_ULT_PNT_NME><DSTR_IND>N</DSTR_IND><ESTD_IND>N</ESTD_IND><EXPT_IND>Y</EXPT_IND><FAIL_SCR>1578</FAIL_SCR><FAIL_SCR_CMTY><ArrayOfstringItem>BG/N81</ArrayOfstringItem></FAIL_SCR_CMTY><FAIL_SCR_NATL_PCTG>100</FAIL_SCR_NATL_PCTG><FAX_NBR>01275-377201</FAX_NBR><FINL_EMBT_IND>N</FINL_EMBT_IND><FINL_LGL_EVNT_IND>N</FINL_LGL_EVNT_IND><FISC_IND>Y</FISC_IND><GBL_ULT_CTRY_CD>NL</GBL_ULT_CTRY_CD><GBL_ULT_PNT_DUNS>549946416</GBL_ULT_PNT_DUNS><GBL_ULT_PNT_NME>UNIT4 N.V.</GBL_ULT_PNT_NME><HIGH_CR>15000</HIGH_CR><INCM_STMT_DT>20111231</INCM_STMT_DT><INCN_YR>1983</INCN_YR><INTL_DLNG_CD>44</INTL_DLNG_CD><ITNG_ASET>21197000</ITNG_ASET><LGL_FORM>LSC/102</LGL_FORM><LOCN_STAT>HQ</LOCN_STAT><MAX_CR>1867000</MAX_CR><NET_INCM>12523000</NET_INCM><NET_WRTH>98769000</NET_WRTH><OPRG_SPEC_EVNT_IND>Y</OPRG_SPEC_EVNT_IND><OTHR_SPEC_EVNT_IND>Y</OTHR_SPEC_EVNT_IND><OUT_BUS_IND>Y</OUT_BUS_IND><PAYD_3_MO_AGO>64</PAYD_3_MO_AGO><PAYD_NORM>75</PAYD_NORM><PAYD_SCR>64</PAYD_SCR><PNT_CTRY_CD>NL</PNT_CTRY_CD><PNT_DUNS>410614358</PNT_DUNS><PNT_NME>UNIT4 Business Software Holding B.V.</PNT_NME><PREV_NET_WRTH>86246000</PREV_NET_WRTH><PREV_SLS>31133000</PREV_SLS><PREV_STMT_DT>20101231</PREV_STMT_DT><PRIM_SIC>7379</PRIM_SIC><PRIM_SIC_TYPE_CD>1972</PRIM_SIC_TYPE_CD><QK_RATO>0.2</QK_RATO><SCRD_FLNG_IND>Y</SCRD_FLNG_IND><SLS>62610000</SLS><STAT>1</STAT><STMT_DT>20111231</STMT_DT><STRT_YR>1983</STRT_YR><SUIT_JDGT_IND>N</SUIT_JDGT_IND><TLCM_NBR>01275-377200</TLCM_NBR><TOT_ASET>242850000</TOT_ASET><TOT_CURR_ASET>77034000</TOT_CURR_ASET><TOT_CURR_LIAB>74081000</TOT_CURR_LIAB><TOT_EMPL>239</TOT_EMPL><TOT_EMPL_ESTD_IND>Y</TOT_EMPL_ESTD_IND><TOT_EMPL_IND>A</TOT_EMPL_IND><TOT_LIAB>144081000</TOT_LIAB><TOT_PMT>22</TOT_PMT><UBAL_IND>N</UBAL_IND><ENQ_DUNS>225314921</ENQ_DUNS><PRIN_NME>Anwen Robinson</PRIN_NME><PRIN_TTL>Director</PRIN_TTL><FAIL_SCR_ENTR><SCR_GRP><ASMT_DT>20130427</ASMT_DT><NATL_PCTL>100</NATL_PCTL><ALGM_ID>GB1032</ALGM_ID><SCR>1578</SCR><SCR_CMTY_CD><ArrayOfstringItem>BG/N81</ArrayOfstringItem></SCR_CMTY_CD></SCR_GRP></FAIL_SCR_ENTR><DELQ_SCR_ENTR><SCR_GRP><ASMT_DT>20130427</ASMT_DT><NATL_PCTL>22</NATL_PCTL><ALGM_ID>GB1532</ALGM_ID><SCR>411</SCR><SCR_CMTY_CD><ArrayOfstringItem>BG/N81</ArrayOfstringItem></SCR_CMTY_CD></SCR_GRP></DELQ_SCR_ENTR></DATARS></DATATRNRS></CREDITMSGSRSV2>";
		
		DnBDataMapper mapper = new DnBDataMapper();
		DnBData data = mapper.getDnBDataFromXml(testXml);
		
		assertEquals("Check DUNS", 225314921, data.getDunsNumber());
		assertEquals("Check name", "UNIT4 BUSINESS SOFTWARE & LTD", data.getName());
		assertEquals("Check DB Rating", "5A1", data.getCurrentRating().getRating());
		assertTrue("Check Failure Risk", 1578 == data.getFailureRiskScoreHistory().getCurrent().getValue());
		assertTrue("Check Failure Risk Percentile", 100 == data.getFailureRiskPercentileHistory().getCurrent().getValue());
		assertTrue("Check PAYDEX", 64 == data.getPaydexScoreHistory().getCurrent().getValue());
		assertTrue("Check PAYDEX Norm", 75 == data.getPaydexNormHistory().getCurrent().getValue());
		assertEquals("Check SIC Code", 7379, data.getPrimarySicCode());
		assertEquals("Check Out of Business Indicator", true, data.getOutOfBusiness());
		assertTrue("Check cash and liquid assets", 373000.0 - data.getCashLiquidAssetsHistory().getCurrent().getValue().getValue() < 0.00001);
		assertTrue("Check cash and liquid assets currency", Currency.GBP == data.getCashLiquidAssetsHistory().getCurrent().getValue().getCurrency());
		assertTrue("Check max credit recommendation", 1867000.0 - data.getMaximumCreditRecommendation().getCurrent().getValue().getValue() < 0.00001);
		assertTrue("Check max credit recommendation currency", Currency.GBP == data.getMaximumCreditRecommendation().getCurrent().getValue().getCurrency());

		assertTrue("Check Credit delinquency percentile", 22 == data.getCreditDelinquencyNationalPercentileHistory().getCurrent().getValue());
		assertTrue("Check Credit delinquency percentile Date", "2013-04-27 00:00:00".equals(getDateString(data.getCreditDelinquencyNationalPercentileHistory().getCurrent().getDate())));
		
		assertEquals("Check default currency", Currency.GBP, data.getDefaultCurrency());
		assertEquals("Check max credit currency", Currency.GBP, data.getMaximumCreditRecommendationCurrency());
		
		// Address details
		assertEquals("Postal Town is Bristol", "BRISTOL", data.getMainAddress().getTown());
		assertEquals("Postal Code is BS20 0PX", "BS20 0PX", data.getMainAddress().getPostCode());
		assertEquals("County is AVON", "AVON", data.getMainAddress().getCounty());
		assertEquals("Postal Code is Great Britain", Country.GB, data.getMainAddress().getCountry());
		assertEquals("Address lines length is 2", 2, data.getMainAddress().getAddressLines().size());
		assertEquals("Address lines 0 is right", "ST GEORGES HALL", data.getMainAddress().getAddressLines().get(0));
		assertEquals("Address lines 1 is right", "ST GEORGES HILL, EASTON-IN-GORDANO", data.getMainAddress().getAddressLines().get(1));
	}
	
	private String getDateString(Date date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(date);
	}
}
