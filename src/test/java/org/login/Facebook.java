package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("ramya99@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("ramya123");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnlogin.click();
		
		
		
		
		
	}

}
