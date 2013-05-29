package Domain;


public interface ICompanyRepository 
{
	CompanyCollection getUnregisteredDunsCompanies();
	CompanyCollection getAllCompanies();
	Company getCompanyById(String Id);
	Company getCompanyByDuns(int dunsNumber);
	void saveCompany(Company c);
	void commitAllChanges();
}
