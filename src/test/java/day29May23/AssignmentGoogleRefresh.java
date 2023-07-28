package day29May23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import day24May23.JavaScriptExecutor;

public class AssignmentGoogleRefresh {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.in";
		driver.get(url);
		
		WebElement txt= driver.findElement(By.xpath("//div/textarea[@id='APjFqb']"));
		txt.sendKeys("Cyber Success Pune");
		Thread.sleep(2000l);
		//txt.clear();
		//txt.sendKeys(Keys.chord(Keys.CONTROL,"r"));
		//txt.sendKeys(Keys.CONTROL + "r");
		
		Actions actions = new Actions(driver);
		Thread.sleep(2000l);
		actions.sendKeys(Keys.F5).build().perform();
		
	//	driver.navigate().refresh();
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
    //		js.executeScript("window.location.reload(true)");
		
	}

}
