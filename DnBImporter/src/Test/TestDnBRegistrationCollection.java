package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import Domain.DnBRegistration;
import Domain.DnBRegistrationCollection;

public class TestDnBRegistrationCollection {
	
	private final String xml = "<DGX><SIGNONMSGSRSV1><SONRS><STATUS><CODE>0</CODE><SEVERITY>INFO</SEVERITY></STATUS><DTSERVER></DTSERVER><LANGUAGE></LANGUAGE></SONRS></SIGNONMSGSRSV1><GLBLMNSVCMSGSRSV1><REGNLISTTRNRS><STATUS><CODE>0</CODE><SEVERITY>INFO</SEVERITY></STATUS><REGNLISTRS><USERRS><USERID>unit4test</USERID><PFLRS><PROD_NME>EnterpriseManagement</PROD_NME><NTFC_LVL>level2</NTFC_LVL><REGNRS><DUNS_NBR>225314921</DUNS_NBR><CTRY_CD>GB</CTRY_CD><PRIM_NME>UNIT4BUSINESSSOFTWARELTD</PRIM_NME><STAT_CD>10</STAT_CD><STAT_DESC>active</STAT_DESC><LAST_UPD_DT>2013-05-01T22:44:02-04:00</LAST_UPD_DT><RNEW_DT>2014-05-02T00:00:00-04:00</RNEW_DT></REGNRS><REGNRS><DUNS_NBR>230782260</DUNS_NBR><CTRY_CD>GB</CTRY_CD><PRIM_NME>SIGNATUREINDUSTRIESLTD</PRIM_NME><STAT_CD>60</STAT_CD><STAT_DESC>failed</STAT_DESC><LAST_UPD_DT>2013-05-01T11:19:33-04:00</LAST_UPD_DT><RNEW_DT>2014-05-02T00:00:00-04:00</RNEW_DT></REGNRS></PFLRS><PFLRS><PROD_NME>EnterpriseManagement</PROD_NME><NTFC_LVL>level3</NTFC_LVL><REGNRS><DUNS_NBR>293432092</DUNS_NBR><CTRY_CD>GB</CTRY_CD><PRIM_NME>JPMORGANJAPANESEINVESTMENTTRUSTPLC</PRIM_NME><STAT_CD>10</STAT_CD><STAT_DESC>active</STAT_DESC><LAST_UPD_DT>2013-05-03T05:31:40-04:00</LAST_UPD_DT><RNEW_DT>2014-05-04T00:00:00-04:00</RNEW_DT></REGNRS><REGNRS><DUNS_NBR>779158224</DUNS_NBR><CTRY_CD>GB</CTRY_CD><PRIM_NME>XCHANGINGPLC</PRIM_NME><STAT_CD>20</STAT_CD><STAT_DESC>pending</STAT_DESC><LAST_UPD_DT>2013-05-03T05:27:46-04:00</LAST_UPD_DT><RNEW_DT>2014-05-04T00:00:00-04:00</RNEW_DT></REGNRS></PFLRS></USERRS></REGNLISTRS></REGNLISTTRNRS></GLBLMNSVCMSGSRSV1></DGX>";
	
	@Test
	public void testFindByDuns() {
		DnBRegistrationCollection regs = getTestColl();
		
		assertEquals("Find 200", 200, regs.findByDuns(200).getDunsNo());
		
		DnBRegistration r = new DnBRegistration();
		r.setDunsNo(4000);
		regs.add(r);
		assertEquals("Find new member", r, regs.findByDuns(4000));
		
		assertEquals("find 22222 returns null", null, regs.findByDuns(22222));
	}

	@Test
	public void testAddFromXml() 
	{
		DnBRegistrationCollection regs = new DnBRegistrationCollection();
		//<?xmlversion=\"1.0\"encoding=\"UTF-8\"?>
		regs.addFromXml(xml);
		
		assertEquals("Does it read in 2 registrations ?", 4, regs.size());
	}
	
	private DnBRegistrationCollection getTestColl()
	{
		DnBRegistrationCollection regs = new DnBRegistrationCollection();
		DnBRegistration r = new DnBRegistration();
		r.setDunsNo(100);
		regs.add(r);
		DnBRegistration r2 = new DnBRegistration();
		r2.setDunsNo(200);
		regs.add(r2);
		DnBRegistration r3 = new DnBRegistration();
		r3.setDunsNo(300);
		regs.add(r3);
		
		return regs;
	}
}
