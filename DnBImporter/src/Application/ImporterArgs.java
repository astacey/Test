package Application;

public class ImporterArgs 
{
	private Boolean isRegistrationSelected = false;
	private Boolean isExperianRegistrationSelected = false;
	private String userName="";
	private String password="";
	private Boolean isInitailUpload = false;
	private Boolean isDnBUpdate = false;
	private Boolean isABWUpdate = false;
	private String importSourceFile = "";
	private String importSource = "";
	private String abwUpdateFolder = "";
	private Boolean isPrepareABWCSV = false;
	private String clientFilter = "";
	private Boolean isExperianUpdate = false;
	private Boolean isBulkMapping = false;
	private String bulkMappingFile ="";
	private String masterId = "";
	private String mappingId ="";
	private String mappingType ="";
	private String jksFile = "";
	private String jksPassword="";
	private Boolean isShowForm=false;
	private String GUIUpdateFolder="";
	private char delimiter;
	
	public ImporterArgs(String[] args)
	{
		ReadArgs(args);
	}
	
	private void ReadArgs(String[] args)
	{
		for(int i = 0;i<args.length;i++)
		{
			if(args[i].equalsIgnoreCase("-gui"))
			{
				isShowForm = true;
			}
			else if(args[i].equalsIgnoreCase("-guiFolder"))
			{
				i++;
				GUIUpdateFolder = args[i];
			}
			else if(args[i].equalsIgnoreCase("-rdnb"))
			{
				isRegistrationSelected = true;
			}
			else if(args[i].equalsIgnoreCase("-rexperian"))
			{
				isExperianRegistrationSelected = true;
			}
			else if(args[i].equalsIgnoreCase("-u"))
			{
				i++;
				userName=args[i];
			}
			else if(args[i].equalsIgnoreCase("-p"))
			{
				i++;
				password=args[i];
			}
			else if(args[i].equalsIgnoreCase("-iabw"))
			{
				isInitailUpload = true;
				importSource = "ABW";
				i++;
				importSourceFile=args[i];
			}
			else if(args[i].equalsIgnoreCase("-idnb"))
			{
				isInitailUpload = true;
				importSource = "DnB";
				i++;
				importSourceFile=args[i];
			}
			else if(args[i].equalsIgnoreCase("-x"))
			{
				isDnBUpdate = true;
			}
			else if(args[i].equalsIgnoreCase("-xabw"))
			{
				isABWUpdate = true;
				i++;
				abwUpdateFolder=args[i];
			}
			else if(args[i].equalsIgnoreCase("-pabw"))
			{
				isPrepareABWCSV = true;
				i++;
				abwUpdateFolder=args[i];
			}
			else if(args[i].equalsIgnoreCase("-f"))
			{
				i++;
				clientFilter = args[i];
			}
			else if(args[i].equalsIgnoreCase("-xexperian"))
			{
				isExperianUpdate=true;
			}
			else if(args[i].equalsIgnoreCase("-bm"))//Bulk Mapping
			{
				isBulkMapping=true;
				i++;
				this.bulkMappingFile=args[i];
			}
			else if(args[i].equalsIgnoreCase("-masterid"))
			{
				i++;
				this.masterId=args[i];
			}
			else if(args[i].equalsIgnoreCase("-mappingid"))
			{
				i++;
				this.mappingId=args[i];
			}
			else if(args[i].equalsIgnoreCase("-mappingtype"))
			{
				i++;
				this.mappingType=args[i];
				if(!this.mappingType.equalsIgnoreCase("experian")
						&& !this.mappingType.equalsIgnoreCase("dnb"))
				{
					RuntimeException e = new RuntimeException("Invalid mapping type. Allowed values are currently \nexperian\ndnb");
					throw(e);
				}
			}
			else if(args[i].equalsIgnoreCase("-jksfile"))
			{
				i++;
				this.jksFile=args[i];
			}
			else if(args[i].equalsIgnoreCase("-jkspass"))
			{
				i++;
				this.jksPassword=args[i];
			}
			else if(args[i].equalsIgnoreCase("-delimiter"))
			{
				i++;
				char[] chars=new char[1];
				args[i].getChars(0, 1, chars, 0);
				this.delimiter=chars[0];
			}
			else
			{
				RuntimeException e = new RuntimeException("Invalid argument " + args[i]);
				throw(e);
			}
		}
	}
	
	public Boolean getIsDnBRegistrationSelected()
	{
		return isRegistrationSelected;
	}

	public Boolean getIsInitialUpload()
	{
		return isInitailUpload;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public Boolean getIsDnBUpdate()
	{
		return isDnBUpdate;
	}

	public String getImportSourceFile() 
	{
		return importSourceFile;
	}

	public String getImportSource() {
		return importSource;
	}

	public Boolean getIsABWUpdate() {
		return isABWUpdate;
	}

	public String getAbwUpdateFolder() {
		return abwUpdateFolder;
	}

	public Boolean getIsPrepareABWCSV() {
		return isPrepareABWCSV;
	}

	public String getClientFilter() {
		return clientFilter;
	}

	public Boolean getIsExperianUpdate() {
		return isExperianUpdate;
	}

	public Boolean getIsBulkMapping() {
		return isBulkMapping;
	}

	public String getMasterId() {
		return masterId;
	}

	public String getMappingId() {
		return mappingId;
	}

	public String getMappingType() {
		return mappingType;
	}

	public String getBulkMappingFile() {
		return bulkMappingFile;
	}

	public Boolean getIsExperianRegistrationSelected() {
		return isExperianRegistrationSelected;
	}

	public String getJksFile() {
		return jksFile;
	}

	public String getJksPassword() {
		return jksPassword;
	}

	public Boolean getIsShowForm() {
		return isShowForm;
	}

	public String getGUIUpdateFolder() {
		return GUIUpdateFolder;
	}

	public char getDelimiter() {
		return delimiter;
	}
}
