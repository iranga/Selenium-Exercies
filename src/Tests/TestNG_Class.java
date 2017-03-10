/*
 * Validate all the available cars are displayed- Implemented with TestNG as the test unit framework
 * Web Elements in the  Astra Coup Page -https://www.holden.com.au/cars/astra-coupe
 * Author:Iranga Muthuthanthri
 * Date: 8-March-2017
 */


package Tests;

import org.testng.annotations.Test;

import pages.*;

import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNG_Class {
	
	WebDriver driver;
	String baseUrl="http://www.holden.com.au";
	WebElement element1;
	 homePageFactory homePage = new homePageFactory();
	 CarCoupePage coupePage = new CarCoupePage();
	 
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.gecko.driver", "/Users/iranga-mac/Software/Selenium/gecko/geckodriver");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  homePage.open(driver);
  }
 
  /*-----
   * Validate all the available cars are displayed
   */
  @Test
  public void displayCars() {
	  homePage.carMenulink(driver).click();
	  String[] expected = {"Astra Coupe","New Astra"};
	  List <WebElement> cargrid=driver.findElements(By.xpath("//div[@class='c-cars-grid']/a[contains(@href,cars)]"));
	    for (int i = 0; i < expected.length; i++) {
	        String optionValue = cargrid.get(i).getText();
	        Assert.assertEquals(optionValue, expected[i]);
	    }
  }
  
 @Test
  public void displayCoupe() {
	   homePage.carMenulink(driver).click();
	   coupePage.coupeMenulink(driver).click();
	   
  }
  
  @AfterMethod
  public void Teardown() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }
}
