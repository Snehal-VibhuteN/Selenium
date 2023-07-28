package day11june23;

import org.testng.annotations.Test;

public class PaymentDemo {
	
	@Test(dataProvider = "DP1", dataProviderClass = Dp.class)
	public void verifyPayment(String userName, String password) {
		System.out.println(userName + " : " + password);
	}

}
