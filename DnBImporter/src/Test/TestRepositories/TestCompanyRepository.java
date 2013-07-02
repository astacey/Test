package Test.TestRepositories;

import Domain.*;

public class TestCompanyRepository implements ICompanyRepository 
{
	private CompanyCollection companiesSaved;
	private CompanyCollection testCompanies;
	
	public TestCompanyRepository()
	{
		this.companiesSaved = new CompanyCollection();
		this.testCompanies = new CompanyCollection();
	}
	
	@Override
	public CompanyCollection getUnregisteredDunsCompanies() 
	{
		if( testCompanies.size()==0)
		{
			CompanyCollection companies = new CompanyCollection();
			for (int duns : testSet) 
			{
				Company comp = new Company(String.valueOf(duns), "", CompanyType.SUPPLIER);
				comp.setDunnBradstreetData(new DnBData(duns));
				companies.add(comp);
			}
			return companies;
		}
		return testCompanies;
	}
	
	@Override
	public CompanyCollection getUnregisteredExperianCompanies()
	{
		CompanyCollection unregistered = new CompanyCollection();
		for(Company c : testCompanies)
		{
			if(c.getExperianData()!=null 
					&& (
							c.getExperianData().getRegistrationStatus()!=RegistrationStatus.ACTIVE
							&&
							c.getExperianData().getRegistrationStatus()!=RegistrationStatus.REGISTERED
						)
				)
			{
				unregistered.add(c);
			}
		}
		return unregistered;
	}
	
	@Override
	public CompanyCollection getAllCompanies()
	{
		if( testCompanies.size() == 0 )
		{
			CompanyCollection companies = new CompanyCollection();
			for (int duns : testSet) 
			{
				Company comp = new Company(String.valueOf(duns), "", CompanyType.SUPPLIER);
				comp.setDunnBradstreetData(new DnBData(duns));
				companies.add(comp);
			}
			return companies;
		}
		return testCompanies;
	}

	@Override
	public void saveCompany(Company c) 
	{
		companiesSaved.add(c);
//		System.out.println(c.toString());
	}
	
	@Override
	public CompanyCollection getCompanyByDuns(int dunsNumber) 
	{
		return getAllCompanies().getCompaniesFromDunsNumber(dunsNumber);
	}

	@Override
	public Company getCompanyById(String id) 
	{
		return getAllCompanies().getCompanyFromId(id);
	}
	
	
	
	// List of Big companies given to me by Mike at D&B
	private int[] testSet = new int[]{293432092,
			779158224,
			221153591,
			290250406,
			296240179,
			525251716,
			227141223,
			221574713,
			289977530,
			295215255,
			229523253,
			210138418,
			227124963,
			396990202,
			536137748,
			423607626,
			218084192,
			732935874,
			505080911,
			220548437,
			235359614,
			739424435,
			218080380,
			771224771,
			227117603,
			218072684,
			213139298,
			396902082,
			365341416,
			520079948,
			733534304,
			222141397,
			491350138,
			288317225,
			772702601,
			227041241,
			774879183,
			229564323,
			235689515,
			288262819,
			210052346,
			217513099,
			217372670,
			291765915,
			739612898,
			210210415,
			216314577,
			215684143,
			491309357,
			214058695,
			764367132,
			213169162,
			295631428,
			719231875,
			505280081,
			238137009,
			777775958,
			396933053,
			290062918,
			212013551,
			504599994,
			217600272,
			217504852,
			520269762,
			577767023,
			218803377,
			221862647,
			737130492,
			227116084,
			770879856,
			289978728,
			458530946,
			298235839,
			227304011,
			236278524,
			771089190,
			288286636,
			500532064,
			211400304,
			295652242,
			458049400,
			212323042,
			225007590,
			228197729,
			458874716,
			210294393,
			525283495,
			293411260,
			348052965,
			779654180,
			397002122,
			771675311,
			217011403,
			214076127,
			290029164,
			298848508,
			239093250,
			769799925,
			210981213,
			216566415,
			732955625,
			216244954,
			491406757,
			520026014,
			238532014,
			215907742,
			216268418,
			228283073,
			519882559,
			227060472,
			394153332,
			228022075,
			215909904,
			235838542,
			779024368,
			494261175,
			543753768,
			218012235,
			219267788,
			288310915,
			570436865,
			494944937,
			218812527,
			212173561,
			213006174,
			505834127,
			291446516,
			227070901,
			212144737,
			458580461,
			769366832,
			424697154,
			766225106,
			225081553,
			217204939,
			218353100,
			229512744,
			221688497,
			210207205,
			218145332,
			295224364,
			219792822,
			779636026,
			217241637,
			210060661,
			423561906,
			237535570,
			211066707,
			214081846,
			769938382,
			229521208,
			739494198,
			210514501,
			738803118,
			238619931,
			229508692,
			348048575,
			774870760,
			766877096,
			220810563,
			238561174,
			210330544,
			216708404,
			672107901,
			525270575,
			229522099,
			210050688,
			515824998,
			736079927,
			211963434,
			210084058,
			212938195,
			346564847,
			986137909,
			212078364,
			423587252,
			215684317,
			217518075,
			378486021,
			210184891,
			238424829,
			570213553,
			229510698,
			214473704,
			394760805,
			770980027,
			211921275,
			378902597,
			396940843,
			289977621,
			349084822,
			378498166,
			236377180,
			346387355,
			213187883,
			737228122,
			225189935,
			219683427,
			399099894,
			346265791,
			217226935,
			218079432,
			733131788,
			233051155,
			237894337,
			296729254,
			734354074,
			739260925,
			347566395,
			291978484,
			212287650,
			346426021,
			776591349,
			216084236,
			210968798,
			737276527,
			298465758,
			345856400,
			291383602,
			734035467,
			210174900,
			349823273,
			348037677,
			210985732,
			211907274,
			216552858,
			423601710,
			216581300,
			525686374,
			210301818,
			394765473,
			216290031,
			216327588,
			738916332,
			288210602,
			230105541,
			569870165,
			212053557,
			640957796,
			210152641,
			569382815,
			212323018,
			503764482,
			211585997,
			216087502,
			458325925,
			291657617,
			210290086,
			739193337,
			347608338,
			216019661,
			215683269,
			236141748,
			211984430,
			297619090,
			293264180,
			210042081,
			737908462,
			236367426,
			221943983,
			217006709,
			672051005,
			491184792,
			228137451,
			856159132,
			239708568,
			736255410,
			237760392,
			231165254,
			345594209,
			216880153,
			211607825,
			298452707,
			238583624,
			218886765,
			236905589,
			216242784,
			734765139,
			212408447,
			210152328,
			214007270,
			734997971,
			225311612,
			641129754,
			229533856,
			211642236,
			210047577,
			217467480,
			503172199,
			210289096,
			737083621,
			221727360,
			239196673,
			394153050,
			739277114,
			237760236,
			737341631,
			293394433,
			214432858,
			210328548,
			399061407,
			238345201,
			672156858,
			738801005,
			210273256,
			221009355,
			237760277,
			222495827,
			210160321,
			211994595,
			298782947,
			220370899,
			536528938,
			210272498,
			536039696,
			424247604,
			423814263,
			222388634,
			212051973,
			210256905,
			227063948,
			346906592,
			210244596,
			218064780,
			227089133,
			235938714,
			763540937,
			505005942,
			346879393,
			210227468,
			217304393,
			347355229,
			210125944,
			211135959,
			399343466,
			294448808,
			239293439,
			220824952,
			236172573,
			210109186,
			734340057,
			778557603,
			214513087,
			221724714,
			211628409,
			525317137,
			220285972,
			216854067,
			235660086,
			212150593,
			210021531,
			423583363,
			210300901,
			296267206,
			211966312,
			230790719,
			236952516,
			458495678,
			235295586,
			210248928,
			210129250,
			423792808,
			536025000,
			238980408,
			289936783,
			210042669,
			288451024		
	};

	public int[] getTestSet() {
		return testSet;
	}

	public void setTestSet(int[] testSet) {
		this.testSet = testSet;
	}

	public CompanyCollection getCompaniesSaved() {
		return companiesSaved;
	}

	@Override
	public void commitAllChanges() {
		// TODO Auto-generated method stub
	}

	public void resetSavedCompanies()
	{
		// reset the saved companies
		this.companiesSaved = new CompanyCollection();
	}
	
	public void setTestCompanies(CompanyCollection companies) {
		this.testCompanies = companies;
	}
}
