package Application;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

import com.csvreader.CsvReader;

import Domain.*;

public class BulkMappingUpload
{
	private static Logger logger = Logger.getLogger(BulkMappingUpload.class.getName());

	private String csvfile;
	private String masterIdcolumnName;
	private String mappedIdcolumnName;
	private String mappingType;
	private ICompanyRepository companyRepo;
	private char delimiter;

	public BulkMappingUpload(ICompanyRepository companyRepo, String csvfile, String masterIdcolumnName, String mappedIdcolumnName, String mappingType)
	{
		this.companyRepo=companyRepo;
		this.csvfile=csvfile;
		this.masterIdcolumnName=masterIdcolumnName;
		this.mappedIdcolumnName=mappedIdcolumnName;
		this.mappingType=mappingType;
		this.delimiter=','; //default
	}

	public void uploadMappings() throws Exception
	{
		CompanyCollection companies = companyRepo.getAllCompanies();
		CsvReader reader = getCsvReader();
		int read=0, mapped=0, notexist=0, nomasterid=0;
		if(reader.readHeaders())
		{
			while(reader.readRecord()==true)
			{
				read++;
				String masterId = reader.get(masterIdcolumnName);
				String mappedId = reader.get(mappedIdcolumnName);
				if(masterId.length()>0) // not checking for mappedId because I might want to unmap ? 
				{
					Company c = companies.getCompanyFromId(masterId);
					if(c==null)
					{
						notexist++;
						// Company doesn't exist, not much I can do
						logger.warning("Company does not exist [id, mapping] = [" + masterId + "," + mappedId + "]");
					}
					else
					{
						if(c.uploadCompanyMapping(mappedId, mappingType))
							mapped++;
						companyRepo.saveCompany(c);
					}
				}
				else
				{
					nomasterid++;
				}
			}
		}
		companyRepo.commitAllChanges();
		logger.info("Read " + String.valueOf(read) + ", mapped " + String.valueOf(mapped) + ", nonexisting companies " + String.valueOf(notexist) + ", no master id = " + nomasterid);
	}

	private CsvReader getCsvReader() throws FileNotFoundException
	{
		CsvReader csv = new CsvReader(csvfile);
		csv.setDelimiter(getDelimiter());
		return csv;
	}

	public char getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(char delimiter) {
		this.delimiter = delimiter;
	}
}