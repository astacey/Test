package WebServiceClients;


public abstract class DnBWebServiceClient 
{
	protected String userName;
	protected String password;
	
	public DnBWebServiceClient(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
}
