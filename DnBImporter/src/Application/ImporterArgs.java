package Application;

public class ImporterArgs 
{
	private Boolean isRegistrationSelected = false;
	private Boolean isExperianRegistrationSelected = false;
	private String userName="";
	private String password="";
	private Boolean isDnBUpdate = false;
	private Boolean isABWUpdate = false;
	private String abwUpdateFolder = "";
	private Boolean isPrepareABWCSV = false;
	private String clientFilter = "";
	private Boolean isExperianUpdate = false;
	private Boolean isBulkMapping = false;
	private String bulkMappingFile ="";
	private String masterId = "";
	private String mappingId ="";
	private String mappingType ="";
	private String mappingMatchGrade = "";
	private String mappingConfidence = "";
	private String jksFile = "";
	private String jksPassword="";
	private Boolean isShowForm=false;
	private String GUIUpdateFolder="";
	private char delimiter=','; // default
	private Boolean isDebugJavax = false;
	private Boolean isDBUnRegistrationSelected = false;
	
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
			else if(args[i].equalsIgnoreCase("-urdnb"))
			{
				isDBUnRegistrationSelected = true;
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
			else if(args[i].equalsIgnoreCase("-xdnb"))
			{
				isDnBUpdate = true;
			}

			else if(args[i].equalsIgnoreCase("-debug"))
			{
				isDebugJavax = true;
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
			else if(args[i].equalsIgnoreCase("-mappingGrade"))
			{
				i++;
				this.mappingMatchGrade=args[i];
			}
			else if(args[i].equalsIgnoreCase("-mappingConfidence"))
			{
				i++;
				this.mappingConfidence=args[i];
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
			else if(args[i].equalsIgnoreCase("-help"))
			{
				printHelp();
			}
			else
			{
				RuntimeException e = new RuntimeException("Invalid argument " + args[i] + ". Try -help for help.");
				throw(e);
			}
		}
	}
	
	private void printHelp()
	{
		// Converted from help.txt using http://www.htmlescape.net/javaescape_tool.html
		String help = "Usage: \nDnbImporter -gui [-guifolder folder] [-u userName] [-pwd password] [-jksfile filepath] [-jkspass password] [-debug]\n\n\t-gui\t\tDisplays the user interface to make calls manually\n\t-guifolder\tPopulates the \"Supplier Data\" input box on the Account Details tab\n\t-u\t\tPopulates the D&B \"User Name\" input box on the Account Details tab\n\t-pwd\t\tPopulates the D&B \"Password\" input box on the Account Details tab\n\t-jksfile\tPopulates the Experian \"JKS File\" input box on the Account Details tab\n\t-jkspass\tPopulates the Experian \"Password\" input box on the Account Details tab\n\t-debug\t\tTurns on javax debugging. i.e. System.setProperty(\"javax.net.debug\",\"all\")\n\nOr\n\nDnbImporter [-bm filepath -masterid id -mappingid mappingid -mappingtype mappingtype -mappingGrade mappinggrade -mappingConfidence mappingconfidencecode [-delimiter delimiter]] [-rdnb] [-urdnb] [-xdnb] [-rexperian] [-xexperian] [-xabw folder [-f clientfilter]] [-debug]\n\n\t-bm\t\tPerform a bulk mapping import from a csv file\n\t-masterid\tColumn header of the master id column in the csv file\n\t-mappingid\tColumn header of the mapping id in the csv file ( the -mappingtype option specifies exactly what this id represents )\n\t-mappingtype\tSpecifies the mapping type of the mapping id column. \n\t\t\tCurrent options are:\n\t\t\t\"dnb\" for Dunn and Bradstreet DUNS numbers\n\t\t\t\"experian\" for Experian reference numbers\n\t-mappingGrade\tColumn header of the match grade column in the csv file\n\t-mappingConfidence\tColumn header of the match confidence code column in the csv file\n\t-delimiter\tThe delimiter used in the csv file\n\t\n\t-rdnb\t\tUpdate the D&B notification registrations\n\t-urdnb\t\tCancel any D&B notification registrations that are no longer relevant\n\t-xdnb\t\tGet D&B data updates for registered companies\n\t-u\t\tPopulates the D&B \"User Name\" input box on the Account Details tab\n\t-pwd\t\tPopulates the D&B \"Password\" input box on the Account Details tab\n\n\t-rexperian\tUpdate the Experian alert registrations\n\t-xxperian\tGet D&B data updates for registered companies\n\t-jksfile\tPopulates the Experian \"JKS File\" input box on the Account Details tab\n\t-jkspass\tPopulates the Experian \"Password\" input box on the Account Details tab\n\n\t-xabw\t\tImport data from abw based csv files. Must specify the folder location as a parameter.\n\t-f\t\tFilter the import based on Client. If specified, will only import the companies that match the specified client value.\n\t\n\t-debug\t\tTurns on javax debugging. i.e. System.setProperty(\"javax.net.debug\",\"all\")";
		System.out.println(help);
	}
	
	public Boolean getIsDnBRegistrationSelected()
	{
		return isRegistrationSelected;
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

	public Boolean getIsDebugJavax() {
		return isDebugJavax;
	}

	public String getMappingMatchGrade() {
		return mappingMatchGrade;
	}

	public String getMappingConfidence() {
		return mappingConfidence;
	}

	public Boolean getIsDnBUnRegistrationSelected() {
		return isDBUnRegistrationSelected;
	}
}
