package day24June23;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeOfWebElementDemo {

	public static void main(String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://deluxe-menu.com/popup-mode-sample.html");
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Thread.sleep(2000l);
	    
	    //get elements getHeight and width
	    
	    WebElement element1=driver.findElement(By.xpath("//p/img[1]"));
	    //H:16 W:17
	    System.out.println("getRect().getDimension().getHeight():"+element1.getRect().getDimension().getHeight());
	    System.out.println("getRect().getDimension().getWidth(): "+element1.getRect().getDimension().getWidth());
	    
	    
	    System.out.println("element1.getRect.getDimension.height: "+element1.getRect().height);
	    System.out.println("element1.getRect.getDimension.width: "+element1.getRect().width);
	    
	    System.out.println("element1.getRect.getHeight: "+element1.getRect().getHeight());
	    System.out.println("element1.getRect.getWidth: "+element1.getRect().getWidth());
	    
	    
	    WebElement element2=driver.findElement(By.xpath("(//p/img)[2]"));
	    //H:119 W:180
	    System.out.println("getRect().getDimension().getHeight():"+element2.getRect().getDimension().getHeight());
	    System.out.println("getRect().getDimension().getWidth(): "+element2.getRect().getDimension().getWidth());
	    
	    
	    System.out.println("element2.getRect.getDimension.height: "+element2.getRect().height);
	    System.out.println("element2.getRect.getDimension.width: "+element2.getRect().width);
	    
	    System.out.println("element2.getRect.getHeight: "+element2.getRect().getHeight());
	    System.out.println("element2.getRect.getWidth: "+element2.getRect().getWidth());
	    
	    
	}
	
	
}
