package ExceptionLearning;

class CurrencyConverter {
	private String countryCode;
	private int amount;

	public CurrencyConverter(int amount, String countryCode) {
		this.amount = amount;
		this.countryCode = countryCode;
	}

	public int getAmount() {
		return this.amount;
	}

	public void addAmount(CurrencyConverter that) throws Exception {
		if (!this.countryCode.equals(that.countryCode)) {
			throw new Exception("Invalid Country code");
		}

		this.amount += that.amount;
	}
}

public class CurrencyRunner {
	public static void main(String[] args) {
		try {
			CurrencyConverter amount1 = new CurrencyConverter(10, "USD");
			CurrencyConverter amount2 = new CurrencyConverter(30, "USD");

			amount1.addAmount(amount2);
			System.out.println("Total Amount : " + amount1.getAmount());
			CurrencyConverter amount3 = new CurrencyConverter(30, "INR");
			amount1.addAmount(amount3);
			System.out.println("Total Amount : " + amount1.getAmount());
		} catch (Exception exp) {
			System.out.println("Exception occured");
			System.out.println("Message : " + exp.getMessage());
		}

	}
}
