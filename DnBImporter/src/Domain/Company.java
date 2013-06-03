package Domain;

public class Company 
{
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
	private DatedValueCollection totalSpend;
	// Avg Days To Payment
	private DatedValueCollection averageDaysToPayment;
	// Open Balance
	private DatedValueCollection openBalance; 
	// D&B's data...
	DnBData dunnBradstreetData;
	
	public Company(String id, String name, CompanyType type)
	{
		this.id=id;
		this.name=name;
		this.type=type;
		this.totalSpend=new DatedValueCollection();
		this.averageDaysToPayment=new DatedValueCollection();
		this.openBalance=new DatedValueCollection();
	}
	
	@Override
	public String toString() 
	{
		String company = "Name : " + name + "\n";
		if(dunnBradstreetData!=null)
			company += dunnBradstreetData.toString();
		return company;
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

	public DatedValueCollection getTotalSpendCollection() {
		return totalSpend;
	}

	public DatedValueCollection getAverageDaysToPaymentCollection() {
		return averageDaysToPayment;
	}

	public DatedValueCollection getOpenBalanceCollection() {
		return openBalance;
	}
	
	// returns current openBalance
	public DatedValue getOpenBalance()
	{
		return this.openBalance.getCurrent();
	}
	
	// returns current Avg Days To Payment
	public DatedValue getAverageDaysToPayment()
	{
		return this.averageDaysToPayment.getCurrent();
	}
	
	// returns current Total Spend
	public DatedValue getTotalSpend()
	{
		return this.totalSpend.getCurrent();
	}
}
