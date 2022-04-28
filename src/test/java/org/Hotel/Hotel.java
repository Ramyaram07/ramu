package org.Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotel {
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	   }
		public void launchUrl(String Url){
			driver.get(Url);
		}
		public void enterText(WebElement ele, String Data){
			ele.sendKeys(Data);
		}
		public void btnClick(WebElement element) {
			element.click();
		}
		public WebElement locatingElement(String locator, String value) {
			WebElement element = null;
			switch(locator){
			case "id":
				element=driver.findElement(By.id(value));
				break;
			case "name":
				element= driver.findElement(By.name(value));
				break;
			case "Xpath":
				element= driver.findElement(By.xpath(value));
				break;
			default:
				System.out.println("invalid locater");
				break;
			}
			return element;
				
		}
		public void dropdown(WebElement drop, String val) {
			Select select = new Select(drop);
			select.deselectByVisibleText(val);
			
		}
}
