package test.java;



import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
import tool.DotTestListener;
import tool.ExtentTestNGIReporterListener;
import tool.TestBase;
@Listeners({DotTestListener.class,ExtentTestNGIReporterListener.class})

public class AddToCartWeaveSocksTest extends TestBase{

//    private WebDriver driver;
//
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
		//driver.close();
//}
	
//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setPlatform(Platform.LINUX);
//        driver = new RemoteWebDriver(new URL("https://selenium.devops.sparkflow.top/wd/hub"), capabilities);
//    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }



    
    @Test
    public void AddToCartBasicFlow() throws InterruptedException {
    	
        driver.navigate().to("http://shop.devops.sparkflow.top");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"youMayAlsoLike\"]/div[2]/div/div[2]/h3/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"buttonCart\"]")).click();;
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cart-list\"]/tr/td[7]/a")).click();
    }
    

    

}