package SimpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleInterest si = new SimpleInterest("4500", "7.5");
		BigDecimal totalValue = si.calculateTotalValue(5);

		System.out.println("Total Sum : " + totalValue);
	}

}
