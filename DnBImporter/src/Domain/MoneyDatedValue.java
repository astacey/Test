package Domain;

import java.util.Date;

public class MoneyDatedValue  extends DatedValue<Money>
{
	public MoneyDatedValue(Date date, Money value) {
		super(date, value);
	}
}
