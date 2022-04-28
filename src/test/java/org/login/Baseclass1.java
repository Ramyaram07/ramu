package org.login;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {
	
 public static WebDriver driver;
       //1
      public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	   }
        //2
		public void launchUrl(String Url){
			driver.get(Url);
		}
        //3
		public void enterText(WebElement ele, String Data){
			ele.sendKeys(Data);
		}
		//4
		public void btnClick(WebElement element) {
			element.click();
		}
		//5
		public void screenShots(String path) throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(screenshotAs);
			FileUtils.copyFile(screenshotAs, new File(path));
			}
		//6
	    public static WebElement findelementid(String data) {
		WebElement element = driver.findElement(By.id("email"));
		return element;
		}
	    //7
		public static WebElement findelementclass(String data) {
	    WebElement element = driver.findElement(By.className("pass"));
	    return element;
		}
		//8
		public static String getcurrenturl() {
			String string = driver.getCurrentUrl();
			return string;
		}
		//9
		public String gettitle(String title) {
			String string = driver.getTitle();
			return string;
		}
		//10
		public static WebElement findelementname(String data) {
		    WebElement element = driver.findElement(By.name("pass"));
		    return element;
			}
		//11
		public static WebElement findelementxpath(String path) {
		    WebElement element = driver.findElement(By.xpath("path"));
		    return element;
			}
		//12
        public String gettxt(WebElement element) {
        	String text = element.getText();
        	return text;
        }
        //13
        public String getAttribute(WebElement element) {
        String data = element.getAttribute("value");
		return data;
        }
        //14
        public void close() {
        	driver.close();
        }
        //15
        public static void quit() {
        	driver.quit();
        }
        //16
        public void movetoelement(WebElement element) {
        	Actions actions=new Actions(driver);
        	actions.moveToElement(element).perform();
        }
        //17
        public void draganddrop(String sourceid, String destinationid) {
        	WebElement sourceElement = driver.findElement(By.id(sourceid));
        	WebElement destinationElement = driver.findElement(By.id(destinationid));
        	Actions actions = new Actions(driver);
        	actions.dragAndDrop(sourceElement, destinationElement).perform();
        }
        //18
        public void rightclick(WebElement element) {
        	Actions actions =new Actions(driver);
        	actions.contextClick(element).perform();
        }
        //19
        public void navigate(String url) {
        	driver.navigate().to(url);
        }
        //20
        public void navigateback() {
        	driver.navigate().back();
        }
        //21
        public void navigateforward() {
        	driver.navigate().forward();
        }
        //22
        public void navigaterefresh() {
        	driver.navigate().refresh();
        }
        //23
        public static void alertaccept() {
        	Alert alert = driver.switchTo().alert();
        	alert.accept();
        }
        //24
        public void alertdismiss() {
        	Alert alert = driver.switchTo().alert();
        	alert.dismiss();
        }
        //25
        public static String alertgettext() {
        	Alert alert = driver.switchTo().alert();
        	String text = alert.getText();
			return text;
        }
        //26
        public void selectbyindex(WebElement element, int index) {
        	Select select = new Select(element);
        	select.selectByIndex(index);
        }
        //27
        public String selectgetalloptions(WebElement element) {
        	Select select=new Select(element);
        	List<WebElement> list = select.getOptions();
        	String text = element.getText();
			return text;
         }
        //28
        public String selecttoattribute(WebElement element) {
        	Select select=new Select(element);
        	List<WebElement> list = select.getOptions();
        	String text = element.getAttribute("value");
			return text;
         }
        //29
        public void deselectall(WebElement element) {
        	Select select = new Select(element);
        	select.deselectAll();
        }
        //30
        public void deselectbyvalue(WebElement element,String value) {
        	Select select = new Select(element);
        	select.deselectByValue(value);
        }
        //31
       public void deselectbyindex(WebElement element,int index) {
        	Select select = new Select(element);
        	select.deselectByIndex(index);
        }
        //32
       public static void selectbyvisibletext(WebElement element,String string) {
       	Select select = new Select(element);
       	select.selectByVisibleText(string);
       }
       //33
       public void getfirstselectedoption(WebElement element) {
          	Select select = new Select(element);
          	select.getFirstSelectedOption();
       }
       //34
       public void doubleclick(WebElement element) {
    	  Actions actions = new Actions(driver);
    	  actions.doubleClick(element).perform();
       }
       //35
       public void excelcreation(String path) {
    	   File file = new File(path);
       }
       //36
       
        
        
        
        
        
        
}     
