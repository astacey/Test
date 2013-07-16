package Domain;

public class Money 
{
	private Currency currency;
	private double value;

	public Money(Currency currency, double value)
	{
		this.value=value;
		this.currency=currency;
	}
	
	public Money(String currencyCode, double value)
	{
		this.value=value;
		this.currency=Currency.getCurrencyFromCode(currencyCode);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}	
}
