/*
 * Tests : Validate all the available cars are displayed - Static Method
 * Author: Iranga Muthuthanthri
 * Date:7-March-2017
 */


package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.CarCoupePage;
import pages.homePageFactory;

public class TestMain {
	
	public static void main (String[] args)
	{
		WebDriver driver;
		String baseUrl="http://www.holden.com.au";
		 homePageFactory homePage = new homePageFactory();
		 CarCoupePage coupePage = new CarCoupePage();
		 System.setProperty("webdriver.gecko.driver", "/Users/iranga-mac/Software/Selenium/gecko/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(baseUrl);
		homePage.carMenulink(driver).click();
		coupePage.coupeMenulink(driver).click();
	
	}
	
}
