package day25May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
	
	public static void main(String [] args ) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//p[@class='_ab25']/a/span")).click();
	
	driver.findElement(By.name("emailOrPhone")).sendKeys("snehalvibhutesf21@gmail.com");
	driver.findElement(By.name("fullName")).sendKeys("Cyber");
	driver.findElement(By.name("username")).sendKeys("selenium_practice");
	driver.findElement(By.name("password")).sendKeys("ABC");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.xpath("//*[@id=\"mount_0_0_fE\"]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[7]/div")).click();


}
}