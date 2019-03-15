package test.java;

	import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import tool.DotTestListener;
import tool.ExtentTestNGIReporterListener;
import tool.TestBase;
@Listeners({DotTestListener.class,ExtentTestNGIReporterListener.class})
	public class CheckOutWeaveSocksTest extends TestBase {

//	    private WebDriver driver;
//
//	    @BeforeTest
//	    public void setUp() throws MalformedURLException {
//	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//	        capabilities.setPlatform(Platform.LINUX);
//	        driver = new RemoteWebDriver(new URL("https://selenium.devops.sparkflow.top/wd/hub"), capabilities);
//	    }
	    
//		WebDriver driver;
//		   @BeforeTest
//			public void SeleniumRestApp() throws InterruptedException {
//		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowserDrivers//chromedriver.exe");
//			driver=new ChromeDriver();
//		   	Thread.sleep(3000);
//			//driver.close();
//	}

//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setPlatform(Platform.LINUX);
//        driver = new RemoteWebDriver(new URL("https://selenium.devops.sparkflow.top/wd/hub"), capabilities);
//    }
	    
	    @Test
	    public void CheckOutTestAlternativeFlow1() throws InterruptedException {
	    	 driver.navigate().to("http://shop.devops.sparkflow.top");
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"youMayAlsoLike\"]/div[2]/div/div[2]/h3/a")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"buttonCart\"]")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/form/div[2]/div[2]/a")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"orderButton\"]")).click();
	         Thread.sleep(6000);
	         Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"user-message\"]/div")).getText().substring(2, 65),"Could not place order. Missing shipping or payment information.1");
	         Thread.sleep(6000);
	         driver.findElement(By.xpath("//*[@id=\"cart-list\"]/tr/td[7]/a")).click();
	       
	    } 
	
	    @Test
	    public void CheckOutTestAlternativeFlow2() throws InterruptedException {
	    	
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
	        Thread.sleep(6000);
	        driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"youMayAlsoLike\"]/div[2]/div/div[2]/h3/a")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"buttonCart\"]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/form/div[2]/div[2]/a")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"orderButton\"]")).click();
	        Thread.sleep(6000);
	        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"user-message\"]/div")).getText().substring(2, 62),"Error placing order. Payment declined: amount exceeds 100.00");
	        Thread.sleep(6000);
	        driver.findElement(By.xpath("//*[@id=\"cart-list\"]/tr/td[7]/a")).click();
	       
			
	    }
	  
	    @Test
	    public void CheckOutTestBasicFlow() throws InterruptedException {
	    	 driver.navigate().to("http://shop.devops.sparkflow.top");
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"youMayAlsoLike\"]/div[3]/div/div[2]/h3/a")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"buttonCart\"]")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"numItemsInCart\"]")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/form/div[2]/div[2]/a")).click();
	         Thread.sleep(6000);
	        // driver.findElement(By.xpath("//*[@onclick=\"deleteFromCart('03fef6ac-1896-4ce8-bd69-b798f85c6e0b')\"]")).click();
	         driver.findElement(By.xpath("//*[@id=\"cart-list\"]/tr/td[7]/a")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//*[@id=\"orderButton\"]")).click();
	         Thread.sleep(6000);
	         Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"customer-orders\"]/div/p[1]")).getText(), "Your orders in one place.");
	         
	         
	    } 
	
	
	
	}


