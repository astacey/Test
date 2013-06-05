package Domain;

import java.util.Date;

//This is purely because I don't like typing DatedValue<Integer> everywhere in code 
//and feel it's nicer to have this class to reference. I don't expect behaviour in here. 
// Any behaviour should ideally be genericised and added to the generic class. 
public class IntegerDatedValue extends DatedValue<Integer>
{
	public IntegerDatedValue(Date date, Integer value) {
		super(date, value);
	}
}
