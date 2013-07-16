package Domain;

//This is purely because I don't like typing DatedValueCollection<Money> everywhere in code 
//and feel it's nicer to have this class to reference. I don't expect behaviour in here. Any behaviour should ideally be genericised and added to the generic class. 

public class MoneyDatedValueCollection  extends DatedValueCollection<Money, MoneyDatedValue>
{
	// increment if breaking change to serializaion
	public static final long serialVersionUID = 1L;
}
