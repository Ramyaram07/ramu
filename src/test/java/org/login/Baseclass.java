package org.login;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
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
			public void screenShots(String path) throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(screenshotAs);
			FileUtils.copyFile(screenshotAs, new File(path));
			}
			public void windowHanding() {
				String windowHandle = driver.getWindowHandle();
				System.out.println(windowHandle);
			   Set<String> windowHandles = driver.getWindowHandles();
			   System.out.println(windowHandles);
			   for(String Win:windowHandles);
			   if(!windowHandle.equal(Win)) {
				   driver.switchTo().window(Win);
			   }
			   
				
				
			}
			
					
				
		}	


