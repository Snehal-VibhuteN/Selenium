package practicalExam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodVerifyingValue {
	
        static WebDriver driver;
        
    		public  static void printText(String xpath1, String xpath2, String xpath3) {
    		    String s1 = driver.findElement(By.xpath(xpath1)).getText();
    		    String s2 = driver.findElement(By.xpath(xpath2)).getText();
    		    String s3 = driver.findElement(By.xpath(xpath3)).getText();
    		    String txt = s1.concat(s2);
    		    System.out.println(txt);
    		    System.out.println(s3);
    		}
        
	public static void main(String[] args) {
        	driver=new ChromeDriver();
        	driver.navigate().to("https://dista.ai/");
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
     

		// Calling the method with specific xpath values
		printText("//div[@class='elementor-counter']/div/span[2]", "//div[@class='elementor-counter']/div/span[3]", "(//div[@class='elementor-counter-title'])[1]");

		printText("(//div[@class='elementor-counter']/div/span[2])[2]", "(//div[@class='elementor-counter']/div/span[3])[2]", "(//div[@class='elementor-counter-title'])[2]");

		printText("(//div[@class='elementor-counter']/div/span[2])[3]", "(//div[@class='elementor-counter']/div/span[3])[3]", "(//div[@class='elementor-counter-title'])[3]");

	}

}
