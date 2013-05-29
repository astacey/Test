package Domain;

public class DnBRegistration 
{
	private int dunsNo;
	private DnBRegistrationStatus status;
	
	public DnBRegistration(){this(0);}
	
	public DnBRegistration(int dunsNo)
	{
		this.dunsNo=dunsNo;
		this.status=DnBRegistrationStatus.UNREGISTERED;
	}
	
	public int getDunsNo() {
		return dunsNo;
	}
	public void setDunsNo(int dunsNo) {
		this.dunsNo = dunsNo;
	}
	public DnBRegistrationStatus getStatus() {
		return status;
	}
	public void setStatus(DnBRegistrationStatus status) {
		this.status = status;
	}
	
	
	
}
