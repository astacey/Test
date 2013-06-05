package Domain;

import java.util.Date;

//This is purely because I don't like typing DatedValue<Double> everywhere in code 
//and feel it's nicer to have this class to reference. I don't expect behaviour in here. 
// Any behaviour should ideally be genericised and added to the generic class. 
public class DoubleDatedValue extends DatedValue<Double>
{
	public DoubleDatedValue(Date date, Double value) {
		super(date, value);
	}
}
