/*
 * Using the Page Object Model Framework
 * Web Elements in the  Home Page
 * Author:Iranga Muthuthanthri
 * Date: 8-March-2017
 */


package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class  homePageFactory {
	WebDriver driver;
	public WebElement element;
	String baseUrl="http://www.holden.com.au";
	
	public void open(WebDriver driver)
	{
	driver.get(baseUrl);
	}
	

	public WebElement carMenulink(WebDriver driver){
		element=driver.findElement(By.xpath("//a[contains(@href,'cars')]//following-sibling::a"));
		return element;
	}
	
}
	
