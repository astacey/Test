package Application;

public class ImporterArgs 
{
	private Boolean isRegistrationSelected = false;
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
	
	public ImporterArgs(String[] args)
	{
		ReadArgs(args);
	}
	
	private void ReadArgs(String[] args)
	{
		for(int i = 0;i<args.length;i++)
		{
			if(args[i].equalsIgnoreCase("-r"))
			{
				isRegistrationSelected = true;
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
		}
	}
	
	public Boolean getIsRegistrationSelected()
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
}
