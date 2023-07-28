package practicalExam2day9jun23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticalFacebook {
	
	static WebDriver driver;
//	
//	public static WebElement getWebElement(By by,String xpa) {
//		return driver.findElement(by.xpath("xpa"));
//	}
//
//	public static void radiobutton(String xpath1) {
//		driver.findElement(By.xpath(xpath1)).click();
//	}
//	
	
	public static void main(String[] args) throws InterruptedException 
	{
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		driver.findElement(By.linkText("Create new account")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMillis(20000));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname"))).sendKeys("Snehal");		
	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname"))).sendKeys("Patil");;
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_email__"))).sendKeys("snehalpatil@gmail.com");;
	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_passwd__"))).sendKeys("Cyber@12");;
		
		WebElement dayDropDown = driver.findElement(By.name("birthday_day"));
		Select select = new Select( dayDropDown);
			select.selectByIndex(2);
		   
				
		WebElement MonthDropDown = driver.findElement(By.name("birthday_month"));
		 select = new Select(MonthDropDown);
			select.selectByIndex(1);
  

		WebElement YearDropDown = driver.findElement(By.name("birthday_year"));
		 select = new Select(YearDropDown);
			select.selectByIndex(6);
			
     
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();

		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();

		driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).click();
  
		

		WebElement CustomDropDown = driver.findElement(By.name("preferred_pronoun"));
		 select = new Select(CustomDropDown);
			select.selectByIndex(1);
  
		
	//	driver.findElement(By.name("websubmit"));
	}

      
}