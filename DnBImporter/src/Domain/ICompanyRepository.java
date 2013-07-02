package Domain;


public interface ICompanyRepository 
{
	// Experian
	CompanyCollection getUnregisteredExperianCompanies();
	CompanyCollection getCompaniesForInitialUpdateExperian();
	CompanyCollection getCompaniesByExperianReference(String reference);
	
	// DnB
	CompanyCollection getUnregisteredDunsCompanies();
	CompanyCollection getCompanyByDuns(int dunsNumber);
	CompanyCollection getCompaniesForInitialUpdateDnB();
	
	// General
	CompanyCollection getAllCompanies();
	Company getCompanyById(String Id);
	void saveCompany(Company c);
	void commitAllChanges();
}
