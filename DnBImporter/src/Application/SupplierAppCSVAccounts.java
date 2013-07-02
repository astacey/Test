package Application;

import java.io.IOException;

import Domain.AccountGroup;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.RegistrationStatus;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class SupplierAppCSVAccounts extends SupplierAppCSVFile 
{
	private final String[] accountsFileHeaders = new String[] { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS", "ACCOUNT_GROUP_CODE","ACCOUNT_GROUP_NAME","VERTICAL_MARKET", "EXPERIAN_NO", "EXPERIAN_LEGAL_STATUS", "EXPERIAN_REGISTRATION_STATUS" };
	private final String allMemberId = "1";

	@Override
	protected void readRecords(CompanyCollection companies, CsvReader csvReader) throws IOException 
	{
		if(csvReader.readHeaders() == true)
		{
			while(csvReader.readRecord()==true)
			{	
				//{ "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS";ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET };
				// TODO : constants for each header ?
				String id = csvReader.get("GEN_ID");
				String name = csvReader.get("NAME");
				String companyRegNo = csvReader.get("CH_NO");
				String status = csvReader.get("STATUS");
				String verticalMarket = csvReader.get("VERTICAL_MARKET");
				String groupCode = csvReader.get("ACCOUNT_GROUP_CODE");
				String groupName = csvReader.get("ACCOUNT_GROUP_NAME");
				
				// Ignore the artificial companies, all, supplier, partners, customers
				if( ! ( (id.equals("1")&&name.equals("All") ) || ( id.equals("A") && name.equals("Suppliers") ) || ( id.equals("B") && name.equals("Partners") ) || ( id.equals("C") && name.equals("Customers" ) ) ) )
				{
					CompanyType type = CompanyType.getCompanyTypeFromId(csvReader.get("PARENT (PARENT_GEN_ID)"));
					Company c = new Company(id, name, type);
					c.setCompanyRegistrationNumber(companyRegNo);
					c.setVerticalMarket(verticalMarket);
					if( groupCode.length()>0)
						c.setAccountGroup(new AccountGroup(groupCode, groupName));
					
					String dunsString = csvReader.get("DUNS_NO");
					if( dunsString.length()>0)
					{
						int dunsNumber = Integer.parseInt(dunsString);
						DnBData data = new DnBData(dunsNumber);
						data.setOutOfBusiness(getOutOfBusiness(status));
						String dnbStatus = csvReader.get("DnB_STATUS");
						data.getRegistrationDetails().setStatus(RegistrationStatus.fromString(dnbStatus));
						
						c.setDunnBradstreetData(data);
					}
					
					String experianRef = csvReader.get("EXPERIAN_NO");
					if( experianRef.length()>0)
					{
						String ls = csvReader.get("EXPERIAN_LEGAL_STATUS");
						ExperianData expData = new ExperianData(experianRef, "", ExperianLegalStatus.getExperianLegalStatusFromDescription(ls));
						String rs = csvReader.get("EXPERIAN_REGISTRATION_STATUS");
						expData.setRegistrationStatus(RegistrationStatus.fromString(rs));
						
						c.setExperianData(expData);
					}
					companies.add(c);
				}
			}
		}
	}

	@Override
	// Incremental doesn't do anything here - always writes all companies
	protected void writeRecords(CompanyCollection companies, CsvWriter csvWriter, Boolean isIncremental) throws IOException 
	{
		// Write headers
		initialiseAccounts(csvWriter);
		for(Company c : companies)
		{
			String accGroupName = "", accGroupCode ="";
			if(c.getAccountGroup()!=null)
			{
				accGroupName = c.getAccountGroup().getName();
				accGroupCode = c.getAccountGroup().getCode();
			}
			
			String duns="", outOfBusiness="Active", dnbStatus="", experianNo="", experianLegalStatus="", experianRegStatus="";  
			
			if(c.hasDunnBradstreetData())
			{
				duns = String.valueOf(c.getDunnBradstreetData().getDunsNumber());
				outOfBusiness = getOutOfBusinessString(c.getDunnBradstreetData().getOutOfBusiness());
				dnbStatus = c.getDunnBradstreetData().getRegistrationDetails().getStatus().getDescription();
			}
			if(c.hasExperianData())
			{
				experianNo = c.getExperianData().getId();
				experianLegalStatus = c.getExperianData().getLegalStatus().getDescription();
				experianRegStatus = c.getExperianData().getRegistrationStatus().getDescription();
			}
			csvWriter.writeRecord(new String[] { c.getId(), c.getName(), c.getType().getId(), c.getId(), c.getCompanyRegistrationNumber(), duns, outOfBusiness, dnbStatus, accGroupCode, accGroupName, c.getVerticalMarket(), experianNo, experianLegalStatus, experianRegStatus});
			
			csvWriter.flush();
		}
	}
	
	private void initialiseAccounts(CsvWriter csvWriter) throws IOException
	{
		csvWriter.writeRecord(accountsFileHeaders);
		csvWriter.writeRecord(new String[] { allMemberId, "All",allMemberId,"","","","","","","","","",""  });
		for(CompanyType ct : CompanyType.values())
		{
			if( ct!=CompanyType.UNKNOWN )
			{
				csvWriter.writeRecord(new String[] { ct.getId(), ct.getDescription(), allMemberId, "", "", "", "", "","","","","","" });
			}
		}
		csvWriter.flush();
	}

	private Boolean getOutOfBusiness(String outOfBusiness)
	{
		if( outOfBusiness.equalsIgnoreCase("inactive"))
			return true;
		// Active by default
		return false;
	}

	private String getOutOfBusinessString(Boolean outOfBusiness)
	{
		if( outOfBusiness )
			return "Inactive";
		// Active by default
		return "Active";
	}
}
