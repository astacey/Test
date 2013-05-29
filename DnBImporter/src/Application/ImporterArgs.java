package Application;

public class ImporterArgs 
{
	private Boolean isRegistrationSelected = false;
	private String userName="";
	private String password="";
	private Boolean isInitailUpload = false;
	private Boolean isUpdate = false;
	private String importSourceFile = "";
	private String importSource = "";
	
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
				isUpdate = true;
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
	
	public Boolean getIsUpdate()
	{
		return isUpdate;
	}

	public String getImportSourceFile() 
	{
		return importSourceFile;
	}

	public String getImportSource() {
		return importSource;
	}
}
