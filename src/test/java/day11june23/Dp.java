package day11june23;

import org.testng.annotations.DataProvider;

public class Dp {
	
	/**
	 * @return
	 */

	
	
	@DataProvider(name="DP1")
	public Object[][] getData1(){
		
		Object[][] data= {{"Shahruk","Shah@123"},
		                  {"Salman","Sala@456"}
		
		
		};
		return data;
	}
	
	
	@DataProvider(name="DP2")
	public Object[][] getData2(){
		
		Object[][] data= {{"Hritik"},
		                  {"Kartik"}
		};
		
		return data;
	}
}

