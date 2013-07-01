package Domain;

public class DnBRegistration 
{
	private int dunsNo;
	private RegistrationStatus status;
	
	public DnBRegistration(){this(0);}
	
	public DnBRegistration(int dunsNo)
	{
		this.dunsNo=dunsNo;
		this.status=RegistrationStatus.UNREGISTERED;
	}
	
	public int getDunsNo() {
		return dunsNo;
	}
	public void setDunsNo(int dunsNo) {
		this.dunsNo = dunsNo;
	}
	public RegistrationStatus getStatus() {
		return status;
	}
	public void setStatus(RegistrationStatus status) {
		this.status = status;
	}
	
	
	
}
