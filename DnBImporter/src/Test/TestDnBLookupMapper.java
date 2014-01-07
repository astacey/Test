package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import DnBXmlMappers.DnBLookUpMapper;
import Domain.DnBLookupResult;

public class TestDnBLookupMapper {

	@Test
	public void testGetLookupResultsFromXml() 
	{
		String testXml = "<CREDITMSGSRSV2 xmlns:ns2=\"http://www.dnb.com/DNB_WebServices/Providers/LookUp\">  <LOOKUPTRNRS><TRNUID></TRNUID><STATUS>  <SEVERITY>INFO</SEVERITY>  <CODE>0</CODE>  <MESSAGE></MESSAGE></STATUS><LOOKUPRS>  <LOOKUPRSCOMPANY><ArrayOfLOOKUPRSCOMPANYItem>  <ADR_LINE>ST GEORGES HALL</ADR_LINE>  <BR_IND>H</BR_IND>  <CTRY_CD>826</CTRY_CD>  <DUNS_NBR>225314921</DUNS_NBR>  <NME>UNIT4 BUSINESS SOFTWARE LTD</NME>  <NON_POST_TOWN>BRISTOL</NON_POST_TOWN>  <POST_CODE>BS20 0PX</POST_CODE>  <TLCM_NBR>01275377200</TLCM_NBR></ArrayOfLOOKUPRSCOMPANYItem><ArrayOfLOOKUPRSCOMPANYItem>  <ADR_LINE>2 Cardale Park, Beckwith Head Road</ADR_LINE>  <BR_IND>H</BR_IND>  <CTRY_CD>826</CTRY_CD>  <DUNS_NBR>569486855</DUNS_NBR>  <NME>The Coda Group Ltd</NME>  <NON_POST_TOWN>HARROGATE</NON_POST_TOWN>  <POST_CODE>HG3 1RY</POST_CODE>  <TLCM_NBR>01423509999</TLCM_NBR>  <TRDG_STYL>Unit 4 Business Software Limited</TRDG_STYL></ArrayOfLOOKUPRSCOMPANYItem>  </LOOKUPRSCOMPANY></LOOKUPRS>  </LOOKUPTRNRS></CREDITMSGSRSV2>";
		DnBLookUpMapper mapper = new DnBLookUpMapper();
		ArrayList<DnBLookupResult> results = mapper.getLookupResultsFromXml(testXml);
		
		assertEquals("There should be 2 results", 2, results.size());
		assertEquals("Name 1 is UNIT4 BUSINESS SOFTWARE LTD", "UNIT4 BUSINESS SOFTWARE LTD", results.get(0).getName());
		assertEquals("Town 2 is HARROGATE", "HARROGATE", results.get(1).getTown());
		assertEquals("Post Code 1 is BS20 0PX", "BS20 0PX", results.get(0).getPostCode());
		assertEquals("Address 2 is 2 Cardale Park, Beckwith Head Road", "2 Cardale Park, Beckwith Head Road", results.get(1).getAddressLine1());
		assertEquals("duns 1 is 225314921", "225314921", results.get(0).getDunsNumber());
	}

}
