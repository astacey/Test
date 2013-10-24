package Domain;

import java.util.logging.Logger;

import Application.DnBRegistrationHandler;

public class Company implements Comparable<Company>
{
	private static Logger logger = Logger.getLogger(Company.class.getName());
	// id of the company. Expecting this to come from agresso
	private String id;
	// Name - from agresso probably
	private String name;
	// Type - Supplier, Customer, Partner
	private CompanyType type;
	// Company Registration Number
	private String companyRegistrationNumber;
	// Vertical Market ( from Agresso )
	private String verticalMarket;
	// Account Group ( from Agresso )	
	private AccountGroup accountGroup;
	// Total Spend
	private DoubleDatedValueCollection totalSpend;
	// Avg Days To Payment
	private DoubleDatedValueCollection averageDaysToPayment;
	// Open Balance
	private DoubleDatedValueCollection openBalance; 
	// D&B's data...
	private DnBData dunnBradstreetData;
	// Experian data
	private ExperianData experianData;
	// Main company address - may need to convert to a list of addresses in future ?
	private Address mainAddress;
	
	public Company(String id, String name, CompanyType type)
	{
		this.id=id;
		this.name=name;
		this.type=type;
		this.totalSpend=new DoubleDatedValueCollection();
		this.averageDaysToPayment=new DoubleDatedValueCollection();
		this.openBalance=new DoubleDatedValueCollection();
	}
	
	@Override
	public String toString() 
	{
		String company = "Name : " + name + "\n";
		if(dunnBradstreetData!=null)
			company += dunnBradstreetData.toString();
		return company;
	}
	
	// Introducing these 2 for D&B match grade and confidence
	// Not sure this is "Nice" in terms of code structure/design/whatever. After 60 seconds thinking, I just need to get on with it. Revisit later. Honest.
	public Boolean uploadCompanyMapping(String id, String mappingType, String mappingGrade, String mappingConfidence)
	{
		if(mappingType.equalsIgnoreCase("experian"))
			return uploadExperianMapping(id);
		else if(mappingType.equalsIgnoreCase("dnb"))
			return uploadDnBMapping(id, mappingGrade, mappingConfidence);
		return false;
	}
	
	private Boolean uploadExperianMapping(String id)
	{
		if(id.length()==0) // unmapped - wipe old data ( dangerous ??? )
		{
			experianData = null;
			return true;
		}
		else if(experianData==null) // If no existing mapping or mapping is different, then set up new experian details
		{
			experianData = new ExperianData(id, "", ExperianLegalStatus.UNKNOWN);
			return true;
		}
		else if(!experianData.getId().equalsIgnoreCase(id))
		{
			//TODO : Not sure what else we need to do, but all existing experian data needs to be wiped if remapped
			experianData = new ExperianData(id, "", ExperianLegalStatus.UNKNOWN);
			return true;
		}
		return false;
	}
	
	private Boolean uploadDnBMapping(String id, String grade, String confidence)
	{
		if(id.length()==0) // unmapped - wipe old data ( dangerous ??? ). Need to set status to "ReMapped" or facts won't be deleted
		{
			// This might screw up without a duns, but safer than dunnBradstreetData = null. duns will just be 0
			String oldduns = "";
			if( dunnBradstreetData != null)
				oldduns = String.valueOf(dunnBradstreetData.getDunsNumber());
			logger.info("DUNS mapping cleared for company id [" + this.id +"], old DUNS [" + oldduns + "]");
			dunnBradstreetData = new DnBData();
			dunnBradstreetData.getRegistrationDetails().setStatus(RegistrationStatus.REMAPPED);
			return true;
		}
		else if(dunnBradstreetData==null)// If no existing mapping or mapping is different, then set up new D&B details
		{
			dunnBradstreetData = new DnBData(Integer.parseInt(id));
			updateDnBMatchGradeAndConfidence(grade, confidence);
			return true;
		}
		else if(dunnBradstreetData.getDunsNumber()!=Integer.parseInt(id))
		{
			logger.info("DUNS mapping changed for company id [" + this.id +"], old DUNS [" + dunnBradstreetData.getDunsNumber() + "], new DUNS [" + id + "]");
			dunnBradstreetData = new DnBData(Integer.parseInt(id));
			dunnBradstreetData.getRegistrationDetails().setStatus(RegistrationStatus.REMAPPED);
			updateDnBMatchGradeAndConfidence(grade, confidence);
			return true;
		}
		else if(dunnBradstreetData.getDunsNumber()==Integer.parseInt(id))
		{
			// just update confidence and grade
			updateDnBMatchGradeAndConfidence(grade, confidence);
			// return true ? don't think so - only if new mapping
		}
		return false;
	}
	
	private void updateDnBMatchGradeAndConfidence(String grade, String confidence)
	{
		if( grade.length()>0)
			dunnBradstreetData.setMatchGrade(grade);
		if(confidence.length()>0)
			dunnBradstreetData.setMatchConfidenceCode(confidence);
	}
	/**
	 * @return the name 
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dunnBradstreetData
	 */
	public DnBData getDunnBradstreetData() {
		return dunnBradstreetData;
	}
	/**
	 * @param dunnBradstreetData the dunnBradstreetData to set
	 */
	public void setDunnBradstreetData(DnBData dunnBradstreetData) {
		this.dunnBradstreetData = dunnBradstreetData;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CompanyType getType() {
		return type;
	}

	public void setType(CompanyType type) {
		this.type = type;
	}	
	
	public Boolean hasDunnBradstreetData(){
		return (this.dunnBradstreetData!=null);
	}

	public String getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}

	public String getVerticalMarket() {
		return verticalMarket;
	}

	public void setVerticalMarket(String verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

	public AccountGroup getAccountGroup() {
		return accountGroup;
	}

	public void setAccountGroup(AccountGroup accountGroup) {
		this.accountGroup = accountGroup;
	}

	public DoubleDatedValueCollection getTotalSpendCollection() {
		return totalSpend;
	}

	public DoubleDatedValueCollection getAverageDaysToPaymentCollection() {
		return averageDaysToPayment;
	}

	public DoubleDatedValueCollection getOpenBalanceCollection() {
		return openBalance;
	}
	
	// returns current openBalance
	public DoubleDatedValue getOpenBalance()
	{
		return this.openBalance.getCurrent();
	}
	
	// returns current Avg Days To Payment
	public DoubleDatedValue getAverageDaysToPayment()
	{
		return this.averageDaysToPayment.getCurrent();
	}
	
	// returns current Total Spend
	public DoubleDatedValue getTotalSpend()
	{
		return this.totalSpend.getCurrent();
	}
	
	// set committed on all objects
	public void setCommitted()
	{
		this.averageDaysToPayment.setCommitted();
		this.totalSpend.setCommitted();
		this.openBalance.setCommitted();
		if(hasDunnBradstreetData())
			getDunnBradstreetData().setCommitted();
		if(hasExperianData())
			getExperianData().setCommitted();
	}

	public Boolean hasExperianData(){
		return (this.experianData!=null);
	}
	
	public ExperianData getExperianData() {
		return experianData;
	}

	public void setExperianData(ExperianData experianData) {
		this.experianData = experianData;
	}

	public Address getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(Address mainAddress) {
		this.mainAddress = mainAddress;
	}
	
	@Override
	// this is probably temporary, figure out how to do this better later on. I specifically want order by open balance for concordance
	public int compareTo(Company compareAgainst)
	{
		double thisOB = 0.0, compareOB = 0.0;
		if( this.getOpenBalance()!=null)
			thisOB = getOpenBalance().getValue();
		if( compareAgainst.getOpenBalance()!=null)
			compareOB = compareAgainst.getOpenBalance().getValue();
		
		return (int)Math.round(compareOB - thisOB);
	}
}
