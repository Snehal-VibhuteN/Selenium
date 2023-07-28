package day17June23;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



public class GroupsDemo {
	
	@Parameters({"browser","env","responseCodes"})
	@Test(groups={"cars"})
	public void testBMW(String browserName,String envName,String rcs) {
		
		System.out.println("browserName   :"+browserName);
		System.out.println("envName       :"+envName);
		System.out.println("responseCodes : "+rcs);
		
		
		String[] rc=rcs.split(",");
		for(String s:rc)
			System.out.println(Integer.parseInt(s)+100);
		
		System.out.println("BMW Method....");
	
		
	}
	
	@Test(groups={"cars"})
    public void testBenz() {
		
		System.out.println("Benz Method");
	}

    @Test(groups={"cars","bikes"})
    public void testHonda() {
    	
    	System.out.println("Honda Method.....");
	
    }

    @Test(groups={"bikes"})
    public void testYamaha() {
		
    	System.out.println("Yamaha Method....");
	}

    @Test(groups={"cars"})
    public void testBajaj() {
    	
    	System.out.println("Bajaj Method....");
		
	}

}
