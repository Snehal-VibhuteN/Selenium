package practicePurpose;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mifmif.common.regex.util.Iterator;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to(url);
		driver.get(url);
		driver.manage().window().maximize();
		WebElement btnalert=driver.findElement(By.id("alertbtn"));
		btnalert.click();
		//driver.switchTo().alert().accept();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.id("openwindow")).click();
		Set <String>  windIds=driver.getWindowHandles();
		
		java.util.Iterator<String> iter=windIds.iterator();
		
		String pWindId=iter.next();
		System.out.println("P= "+pWindId);
		String cWindId=iter.next();
		System.out.println("C="+cWindId);
}}
