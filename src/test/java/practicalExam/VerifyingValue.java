package practicalExam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingValue {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://dista.ai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/section[4]/div/div/div"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(5000l);
			
			String s1=driver.findElement(By.xpath("//div[@class='elementor-counter']/div/span[2]")).getText();
			String s2=driver.findElement(By.xpath("//div[@class='elementor-counter']/div/span[3]")).getText();
			String s3=driver.findElement(By.xpath("(//div[@class='elementor-counter-title'])[1]")).getText();
		    String txt=s1.concat(s2);
			System.out.println(txt);
			System.out.println(s3);
			
			String s4=driver.findElement(By.xpath("(//div[@class='elementor-counter']/div/span[2])[2]")).getText();
			String s5=driver.findElement(By.xpath("(//div[@class='elementor-counter']/div/span[3])[2]")).getText();
			String s6=driver.findElement(By.xpath("(//div[@class='elementor-counter-title'])[2]")).getText();
			String txt1=s4.concat(s5);
			System.out.println(txt1);
			System.out.println(s6);
			
			

			String s7=driver.findElement(By.xpath("(//div[@class='elementor-counter']/div/span[2])[3]")).getText();
			String s8=driver.findElement(By.xpath("(//div[@class='elementor-counter']/div/span[3])[3]")).getText();
			String s9=driver.findElement(By.xpath("(//div[@class='elementor-counter-title'])[3]")).getText();
			String txt2=s7.concat(s8);
			System.out.println(txt2);
			System.out.println(s9);
		driver.quit();
	
	
	
	
	
		
	
	}

}

