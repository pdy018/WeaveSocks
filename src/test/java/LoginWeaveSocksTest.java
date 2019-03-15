package test.java;





import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import tool.DotTestListener;
import tool.ExtentTestNGIReporterListener;
import tool.TestBase;



@Listeners({DotTestListener.class,ExtentTestNGIReporterListener.class})
public class LoginWeaveSocksTest extends TestBase{

    //public WebDriver driver;

//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setPlatform(Platform.LINUX);
//        driver = new RemoteWebDriver(new URL("https://selenium.devops.sparkflow.top/wd/hub"), capabilities);
//    }
    
//	WebDriver driver;
//	   @BeforeTest
//		public void SeleniumRestApp() throws InterruptedException {
//	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowserDrivers//chromedriver.exe");
//		driver=new ChromeDriver();
//	   	Thread.sleep(3000);
//		//driver.close();
//}

//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }

//    @Test
//    public void simpleTest() {
//        driver.navigate().to("http://www.google.com");
//        Assert.assertEquals(driver.getTitle(), "Google");
//    }
//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setPlatform(Platform.LINUX);
//        driver = new RemoteWebDriver(new URL("https://selenium.devops.sparkflow.top/wd/hub"), capabilities);
//    }
    
    @Test
    public void LoginTestBasicFlow() throws InterruptedException {
    	
        driver.navigate().to("http://shop.devops.sparkflow.top");
        Thread.sleep(3000);
        //wait(30);
        driver.findElement(By.xpath("//*[@id=\"login\"]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"username-modal\"]")).sendKeys("user");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password-modal\"]")).sendKeys("password");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/form/p/button")).click();
        Thread.sleep(10000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"banner\"]/div/h2/a/font")).getText(), "LOG OUT");
       // driver.findElement(By.xpath("//*[@id=\"logout\"]/a")).click();
       
		
    }
    
//    @Test
//    public void LoginTestAlternativeFlow() throws InterruptedException {
//    	
//        driver.navigate().to("http://shop.devops.sparkflow.top");
//        Thread.sleep(30000);
//        //wait(30);
//        driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"register\"]/a")).sendKeys("sonoo");
//        driver.findElement(By.xpath("//*[@id=\"register-first-modal\"]")).sendKeys("jaiswal");
//        driver.findElement(By.xpath("//*[@id=\"register-email-modal\"]")).sendKeys("jaiswal");
//        driver.findElement(By.xpath("//*[@id=\"register-password-modal\"]")).sendKeys("jaiswal");
//        driver.findElement(By.xpath("//*[@id=\"register-modal\"]/div/div/div[2]/form/p/button")).click();
//        
//        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"banner\"]/div/h2/a/font")).getText(), "LOG OUT");
		
  //  }
    

    
    
}