/*
 * Using the Page Object Model Framework
 * Web Elements in the  Astra Coup Page -https://www.holden.com.au/cars/astra-coupe
 * Author:Iranga Muthuthanthri
 * Date: 8-March-2017
 */


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarCoupePage {
	
	WebDriver driver;
	WebElement element;
	
	public  WebElement coupeMenulink(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@class='c-cars-grid']/a[contains(@href,cars)][1]"));
		return element;
	}
	
	
}
