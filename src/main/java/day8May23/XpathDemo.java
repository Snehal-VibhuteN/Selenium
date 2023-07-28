package day8May23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {

     String url="https://www.letskodeit.com/practice";
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		WebElement ele=driver.findElement(By.xpath("//h1[1][@data-uniqid='1621702280245']"));
		 Thread.sleep(2000l);
		 
		 String actLblValue = ele.getText();
		 
		 String expLblValue="practice page";
		 
		 if(actLblValue.equals(expLblValue))
			 System.out.println("Test case Passed ....!");
		 else
			 System.out.println("Test case failed ....!," + "expLblValue:" + expLblValue + ":" + "actLblValue:" + actLblValue);
		       driver.quit();
	}

}
