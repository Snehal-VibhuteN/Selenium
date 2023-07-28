package day25May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.xpath("//div[@id='content']/following-sibling::div//ul/li[2]/a")).click();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		WebElement droppable=driver.findElement(By.id("draggable"));
		WebElement draggable=driver.findElement(By.id("draggable"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(droppable, draggable).build().perform();
		
		
	}

}
