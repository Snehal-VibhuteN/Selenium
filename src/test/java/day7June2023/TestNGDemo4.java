package day7June2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("Before suite....");
	}
	@AfterSuite
	public void AfterSuit() {
		System.out.println("After suite....");
	}
	
	@BeforeTest
    public void BeforeTest() {
		System.out.println("Before Test....");
	}
    
    @AfterTest
    public void AfterTest() {
  		System.out.println("After Test....");
  	}

    @BeforeClass
    public void BeforeClass() {
		System.out.println("Before Class....");	
	}
    @AfterClass
    public void AfterClass() {
		System.out.println("After Class....");
	}
    @BeforeMethod
    public void tearUp() {
    	System.out.println("Before Script/method ");
    }
    
     @AfterMethod
    public void tearDown() {
    	System.out.println("After Script/method ");
    }

	
     @Test
    public void reg() {
    	System.out.println("successfully registered");
    }
     @Test
     public void Login() {
     	System.out.println("Login registered");
     }
    
   
    
   
}
