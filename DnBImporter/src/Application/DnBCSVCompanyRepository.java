package Application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

import com.csvreader.CsvReader;

import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.ICompanyRepository;

public class DnBCSVCompanyRepository implements ICompanyRepository 
{
	private static Logger logger = Logger.getLogger(DnBCSVCompanyRepository.class.getName());

	private String sourceFile;
	
	public DnBCSVCompanyRepository(String sourceFile)
	{
		this.sourceFile = sourceFile;
	}
	
	@Override
	public Company getCompanyById(String Id)
	{
		return null;
	}
	
	@Override
	public CompanyCollection getUnregisteredDunsCompanies() 
	{
		// If it's DnB file then they're all unregistered ???
		// this method probably not used here 
		return getAllCompanies();
	}

	@Override
	public CompanyCollection getAllCompanies() 
	{
		return readAllCompaniesFromFile();
	}

	@Override
	public Company getCompanyByDuns(int dunsNumber) 
	{
		// No need to do anything here
		// This won't get called
		return null;
	}

	@Override
	public void saveCompany(Company c) 
	{
		// Won't implement as far as I can see, this is a source repository only.
	}

	@Override
	public void commitAllChanges() 
	{
		// Won't implement as far as I can see, this is a source repository only.
	}
	
	private CompanyCollection readAllCompaniesFromFile()
	{
		CompanyCollection allCompanies = new CompanyCollection();
		try
		{
			CsvReader csvReader = new CsvReader(sourceFile);
			if(csvReader.readHeaders() == true)
			{
				while(csvReader.readRecord()==true)
				{	
					//apar_id,apar_name,address,place,province,Country_code,zip_code,telephone_1,comp_reg_no,acctype
					// TODO : constants for each header ?
					String id = csvReader.get("Customer ID");
					String name = csvReader.get("Business Name 1");
					String companyRegNo = csvReader.get("Local Registration Number");

					CompanyType type = CompanyType.UNKNOWN;
					Company c = new Company(id, name, type);
					c.setCompanyRegistrationNumber(companyRegNo);
					
					String dunsString = csvReader.get("DUNS");
					if( dunsString.length()>0)
					{
						int dunsNumber = Integer.parseInt(dunsString);
						DnBData data = new DnBData(dunsNumber);
						String dnbName = csvReader.get("COMPANY_NAME");
						int sic = XmlHelper.getIntegerFromXmlString(csvReader.get("PRIMARY_SIC"));
						data.setName(dnbName);
						if(sic>0)
							data.setPrimarySicCode(sic);
						
						c.setDunnBradstreetData(data);
					}
					allCompanies.add(c);
				}
			}
			csvReader.close();
		}
		catch(FileNotFoundException fnfe)
		{
			logger.warning(fnfe.getMessage());
		}
		catch(IOException ioe)
		{
			logger.warning(ioe.getMessage());
		}
		catch(Exception e)
		{
			logger.warning(e.getMessage());
		}
		return allCompanies;
	}

}
