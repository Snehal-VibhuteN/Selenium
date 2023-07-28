package practicePurpose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceReturn {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to(url);
		driver.getPageSource();
		driver.get(url);
		driver.manage().window().maximize();	}
		
}
