package day7June2023;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo {
  
	
	@Test(priority=-2)
  public void reg() {
	  System.out.println("Register to the application");
  }
  
	@Test(priority=-3)
  public void Login() {
	  System.out.println("Login to the application");
	  
  }
  
  @Test(priority=1)
  public void Logout() {
	  System.out.println("Logout from the application");
  }
}
