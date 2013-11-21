package Application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import Domain.AccountGroup;
import Domain.Address;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.Country;
import Domain.Currency;
import Domain.DnBData;
import Domain.DnBRating;
import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.RegistrationStatus;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class SupplierAppCSVAccounts extends SupplierAppCSVFile 
{
	private final String[] accountsFileHeaders = new String[] { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS", "ACCOUNT_GROUP_CODE","ACCOUNT_GROUP_NAME","VERTICAL_MARKET", "EXPERIAN_NO", "EXPERIAN_LEGAL_STATUS", "EXPERIAN_REGISTRATION_STATUS", "DNB_DEFAULT_CURRENCY_CODE","DNB_CREDIT_RECOMMENDATION_CURRENCY_CODE",
			"DNB_RATING", "DNB_ADDRESS_LINE_1", "DNB_ADDRESS_LINE_2", "DNB_ADDRESS_LINE_3", "DNB_ADDRESS_LINE_4", "DNB_ADDRESS_TOWN", "DNB_ADDRESS_COUNTY", "DNB_ADDRESS_COUNTRY_CODE", "DNB_ADDRESS_COUNTRY_DESCRIPTION", "DNB_ADDRESS_POST_CODE", "DNB_NAME", "DNB_MATCH_GRADE", "DNB_CONFIDENCE_CODE",
			"DNB_ORIGINAL_MATCHED_DUNS_NO" };
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
				String currencyCode = csvReader.get("DNB_DEFAULT_CURRENCY_CODE");
				String maxCreditCurrencyCode = csvReader.get("DNB_CREDIT_RECOMMENDATION_CURRENCY_CODE");
								
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
						String originalDuns = csvReader.get("DNB_ORIGINAL_MATCHED_DUNS_NO");
						if(originalDuns.length()>0)
							data.getRegistrationDetails().setOriginalMatchedDunsNo(Integer.parseInt(originalDuns));
						data.setDefaultCurrency(Currency.getCurrencyFromCode(currencyCode));
						data.setMaximumCreditRecommendationCurrency(Currency.getCurrencyFromCode(maxCreditCurrencyCode));
						
						data.setName(csvReader.get("DNB_NAME"));
						data.setMatchGrade(csvReader.get("DNB_MATCH_GRADE"));
						data.setMatchConfidenceCode(csvReader.get("DNB_CONFIDENCE_CODE"));
												
						// current rating
						String currentRating = csvReader.get("DNB_RATING");
						if(currentRating.length()>0)
						{
							// Use today's date. This isn't the most accurate, since the current rating date is probably in the past. This will do for the risk app for now.
							// interestingly, it doesn't write a new fact to fact_data, because the fact is marked as committed after being read in ( in supplierappcsvcompanyrepository ). It is written to fact_data_full. This might bloat this file, but no harm done.
							data.getDbratingHistory().upsert(new DnBRating(currentRating, new Date()));
						}
						Address dnbAddress = getAddress(csvReader);
						data.setMainAddress(dnbAddress);
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
			
			String duns="", outOfBusiness="Active", dnbStatus="", experianNo="", experianLegalStatus="", experianRegStatus="", currency="", maxCreditCurrency="";  
			
			String dnbRating="", dnbAddress1="", dnbAddress2="", dnbAddress3="", dnbAddress4="", dnbAddressTown="", dnbAddressCounty="", dnbAddressCountryCode="", dnbAddressCountryDesc="", dnbAddressPostCode="", dnbName="", dnbMatchGrade="", dnbConfidenceCode="";
			
			String dnbOriginalDuns="";
			
			if(c.hasDunnBradstreetData())
			{
				duns = String.valueOf(c.getDunnBradstreetData().getDunsNumber());
				outOfBusiness = getOutOfBusinessString(c.getDunnBradstreetData().getOutOfBusiness());
				dnbStatus = c.getDunnBradstreetData().getRegistrationDetails().getStatus().getDescription();
				if(c.getDunnBradstreetData().getRegistrationDetails().getOriginalMatchedDunsNo() != 0)
					dnbOriginalDuns = String.valueOf(c.getDunnBradstreetData().getRegistrationDetails().getOriginalMatchedDunsNo());
				if(c.getDunnBradstreetData().getDefaultCurrency()!=null)
					currency = c.getDunnBradstreetData().getDefaultCurrency().getCode();
				if(c.getDunnBradstreetData().getMaximumCreditRecommendationCurrency()!=null)
					maxCreditCurrency = c.getDunnBradstreetData().getMaximumCreditRecommendationCurrency().getCode();
				if(c.getDunnBradstreetData().getCurrentRating()!=null)
					dnbRating=c.getDunnBradstreetData().getCurrentRating().getRating();
				
				dnbName = c.getDunnBradstreetData().getName();
				dnbMatchGrade = c.getDunnBradstreetData().getMatchGrade();
				dnbConfidenceCode = c.getDunnBradstreetData().getMatchConfidenceCode();
				
				Address address = c.getDunnBradstreetData().getMainAddress();
				if(address!=null)
				{
					dnbAddress1 = address.getAddressLine1();
					dnbAddress2 = address.getAddressLine2();
					dnbAddress3 = address.getAddressLine3();
					dnbAddress4 = address.getAddressLine4();
					dnbAddressTown = address.getTown();
					dnbAddressCounty = address.getCounty();
					if( address.getCountry()!=null)
					{
						dnbAddressCountryCode = address.getCountry().getIso2();
						dnbAddressCountryDesc = address.getCountry().getDescription();
					}
					dnbAddressPostCode = address.getPostCode();
				}
			}
			if(c.hasExperianData())
			{
				experianNo = c.getExperianData().getId();
				experianLegalStatus = c.getExperianData().getLegalStatus().getDescription();
				experianRegStatus = c.getExperianData().getRegistrationStatus().getDescription();
			}

			csvWriter.writeRecord(new String[] { c.getId(), c.getName(), c.getType().getId(), c.getId(), c.getCompanyRegistrationNumber(), duns, outOfBusiness, dnbStatus, accGroupCode, accGroupName, c.getVerticalMarket(), experianNo, experianLegalStatus, experianRegStatus, currency, maxCreditCurrency, dnbRating, dnbAddress1, dnbAddress2, dnbAddress3, dnbAddress4, dnbAddressTown, dnbAddressCounty, dnbAddressCountryCode, dnbAddressCountryDesc, dnbAddressPostCode, dnbName, dnbMatchGrade, dnbConfidenceCode, dnbOriginalDuns});
			
			csvWriter.flush();
		}
	}
	
	private Address getAddress(CsvReader reader) throws IOException
	{
		//"DNB_ADDRESS_LINE_1", "DNB_ADDRESS_LINE_2", "DNB_ADDRESS_LINE_3", "DNB_ADDRESS_LINE_4", "DNB_ADDRESS_TOWN", "DNB_ADDRESS_COUNTY", "DNB_ADDRESS_COUNTRY_CODE", "DNB_ADDRESS_COUNTRY_DESCRIPTION", "DNB_ADDRESS_POST_CODE"
		ArrayList<String> addressLines = new ArrayList<String>();
		addAddressLine("DNB_ADDRESS_LINE_1", reader, addressLines);
		addAddressLine("DNB_ADDRESS_LINE_2", reader, addressLines);
		addAddressLine("DNB_ADDRESS_LINE_3", reader, addressLines);
		addAddressLine("DNB_ADDRESS_LINE_4", reader, addressLines);
		
		String town = reader.get("DNB_ADDRESS_TOWN");
		String county = reader.get("DNB_ADDRESS_COUNTY");
		Country country = Country.getCountryFromIso2(reader.get("DNB_ADDRESS_COUNTRY_CODE"));
		String postCode = reader.get("DNB_ADDRESS_POST_CODE");
		
		if(town.length()>0 || county.length()>0 || postCode.length()>0 || country!=null || addressLines.size()>0)
		{
			Address address = new Address();
			address.getAddressLines().addAll(addressLines);
			address.setTown(town);
			address.setCounty(county);
			address.setCountry(country);
			address.setPostCode(postCode);
			return address;
		}
		return null;
	}
	
	private void addAddressLine(String tag, CsvReader reader, ArrayList<String> addressLines) throws IOException
	{
		String addressLine = reader.get(tag);
		if(addressLine.length()>0)
			addressLines.add(addressLine);
	}
	
	private void initialiseAccounts(CsvWriter csvWriter) throws IOException
	{
		csvWriter.writeRecord(accountsFileHeaders);
		csvWriter.writeRecord(new String[] { allMemberId, "All",allMemberId,"","","","","","","","","","","","","","","","","","","","","","","","","","",""  });
		for(CompanyType ct : CompanyType.values())
		{
			if( ct!=CompanyType.UNKNOWN )
			{
				csvWriter.writeRecord(new String[] { ct.getId(), ct.getDescription(), allMemberId, "", "", "", "", "","","","","","","","","","","","","","","","","","","","","","","" });
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
