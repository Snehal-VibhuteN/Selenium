package day11june23;

import org.testng.annotations.Test;

public class ShippingDemo {
	

	@Test(dataProvider = "DP2", dataProviderClass = Dp.class)
	public void verifyPayment(String userName) {
		System.out.println(userName);
	}

}
