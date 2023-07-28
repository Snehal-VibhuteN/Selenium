package day11june23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo2 {
	
	@Test
	public void verifyHardAssertion() {
		int actualI=101, expectedJ=102;
		System.out.println("Begin test");
		
		//Assert.assertTrue(actualI==expectedJ,"Error Msg");
		
		//Assert.assertFalse(actualI==expectedJ,"Error Msg");
	//	if(actualI==10)
	//		Assert.fail("Intentionally failingtest case because there is associated defect");
		
	    Assert.assertNotEquals(actualI,expectedJ,"Error Msg");
	    
	    if(actualI==101)
	    	Assert.fail();
	    
	    System.out.println("End test");
	}

}
