package tool;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public WebDriver driver;   
//    
    public WebDriver getDriver() {
    	
        return driver;
    }
 
    @BeforeClass
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowserDrivers//chromedriver.exe");
        driver = new ChromeDriver();
      //  driver.manage().window().maximize();
      //  driver.navigate().to("http://www.baidu.com");      
    }
    

     
    @AfterClass
    public void afterclass(){
    	driver.quit();
        driver.close();
        
    }
}