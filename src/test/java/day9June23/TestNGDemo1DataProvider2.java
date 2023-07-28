package day9June23;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestNGDemo1DataProvider2 {
	
	
	WebDriver driver;
	
	private final By un =By.name("username");
	private final By pw =By.name("password");
	private final By login=By.xpath("//button[@type='submit']");
	private final By errorMsg=By.xpath("//p[text()='Invalid credentials']");
    String expErrorMsg ="Invalid credentials";
	Properties prop;
    
    /**
     * Read config.properties file containing environment variable 
     * 
     * @throws IOException
     */

    
    private void readConfig() throws IOException {
        prop = new Properties();
    	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"src\\test\\java\\day9june23\\config.properties");
    	prop.load(fis);
    }
    
    /**
     * finds webelement
     * @param by  xpath,cssSelector,id,name,className,tagName
     * @return webelement
     */
    private WebElement getWebElement(By by) {
    	
    	return driver.findElement(by);
    	
    }
    
    /**
     * sends keys to a web element
     * @param by
     * @param String data
     */
    private void type(By by,String data) {
    	
    	getWebElement(by).sendKeys(data);
    	
    }
    
    /**
     * clicking on web element
     * @param by
     * 
     */
    
    private void elementClick(By by) {
    	getWebElement(by).click();
    	
    }
    
    /**
     * inputs username and password in username and passwrd field
     * @param username
     * @param password
     * 
     */
    private void fromInput(String username,String password) {
    	type(un,username);
    	type(pw,password);
    	elementClick(login);
    }
    
    /**
     * getText from webelement
     * return stringmessage
     */
    
    private String getTextMethod() {
    	
    	return driver.findElement(errorMsg).getText();
    }
    
    /**
     * launches a specified brower,maximize window and set implicite wait by using .properties file
     * @throws IOException
     */
    private void launchBrowser() throws IOException{
    	readConfig();
    	String br=prop.getProperty("browser");
    //	switch(br.toUpperCase())
    }
}
		