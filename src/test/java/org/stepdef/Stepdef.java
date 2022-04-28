package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	
	WebDriver driver;
	
	@Given("user is on adactinhotelapp page on chrome browser.")
	public void user_is_on_adactinhotelapp_page_on_chrome_browser() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	
	  }

	@When("user enter {string} and {string}.")
	public void user_enter_and(String string, String string2) {
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys(string);
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys(string2);
	   
	    
	}

	@When("user should click login button.")
	public void user_should_click_login_button() {
		WebElement element = driver.findElement(By.name("login"));
		element.click();
	   
	}

	@When("user select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_select(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		
		WebElement drop = driver.findElement(By.id("location"));
		Select se = new Select(drop);
		se.selectByVisibleText(string);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select se1 = new Select(hotel);
		se1.selectByVisibleText(string2);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select se2 = new Select(roomtype);
		se2.selectByValue(string3);
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select se3 = new Select(roomno);
		se3.selectByVisibleText(string4);
		
		WebElement drop5 = driver.findElement(By.id("datepick_in"));
		drop5.sendKeys(string5);
		
	    WebElement drop6 = driver.findElement(By.id("datepick_out"));
		drop6.sendKeys(string6);
		
	    WebElement drop7 = driver.findElement(By.id("adult_room"));
		Select se7 = new Select(drop7);
		se7.selectByVisibleText(string7);
		
		WebElement drop8 = driver.findElement(By.id("child_room"));
		Select se8 = new Select(drop8);
		se8.selectByVisibleText(string8);
		
		WebElement elem = driver.findElement(By.id("Submit"));
		elem.click();
		
	  	}

	@When("user select hotel and click continue for booking")
	public void user_select_hotel_and_click_continue_for_booking() {
		WebElement elem = driver.findElement(By.id("radiobutton_0"));
		elem.click();
		WebElement elem1 = driver.findElement(By.id("continue"));
		elem1.click();
	    
	}

	@When("user enter {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_enter_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		WebElement element = driver.findElement(By.id("first_name"));
		element.sendKeys(string);
		WebElement element2 = driver.findElement(By.id("last_name"));
		element2.sendKeys(string2);
		WebElement element3 = driver.findElement(By.id("address"));
		element3.sendKeys(string3);
		WebElement element4 = driver.findElement(By.id("cc_num"));
		element4.sendKeys(string4);
		WebElement drop1 = driver.findElement(By.id("cc_type"));
		Select sel = new Select(drop1);
		sel.selectByVisibleText(string5);
		WebElement drop2 = driver.findElement(By.id("cc_exp_month"));
		Select sel2 = new Select(drop2);
		sel2.selectByVisibleText(string6);
		WebElement drop3 = driver.findElement(By.id("cc_exp_year"));
		Select sel3 = new Select(drop3);
		sel3.selectByVisibleText(string7);
		WebElement elem = driver.findElement(By.name("cc_cvv"));
		elem.sendKeys(string8);
	 }

	@When("user click on continue for generating order id")
	public void user_click_on_continue_for_generating_order_id() throws InterruptedException {
		WebElement element = driver.findElement(By.name("book_now"));
		element.click();
	    Thread.sleep(9000);
	}

	@When("user print order id to console")
	public void user_print_order_id_to_console() {
		WebElement orderid = driver.findElement(By.id("order_no"));
		String order = orderid.getAttribute("value");
		System.out.println(order);

	}
	
}