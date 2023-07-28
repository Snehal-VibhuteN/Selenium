package day11june23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {

	
	@Test
	public void verifyHardAssertion() {
		
		int actualI=9, expectedJ=10;
		System.out.println("Begin test ");
		
		//Assert.assertEquals(actualI, expectedJ);
		Assert.assertEquals(actualI,expectedJ,"actual value of i= "+actualI +"is not equal to j=" + expectedJ);
	    System.out.println("End test");
	}
}
