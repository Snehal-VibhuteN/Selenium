package day7June2023;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo3 {
	
	@Test(priority=-1)
	public void reg() {
		System.out.println("Register to the app");
		Assert.fail("Intentionally failing:REG");
	}
	
	
	@Test(dependsOnMethods = {"reg"})
	public void Login() {
		System.out.println("Login to the app");
	}
	
	
	@Test(priority=1,dependsOnMethods= {"reg" , "Login"})
	public void Logout() {
		System.out.println("Logout to the app");
	}
	
	

}
