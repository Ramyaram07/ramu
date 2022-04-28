package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sampleclass extends Baseclass{
	public static void main(String[] args) {
		Baseclass bas = new Baseclass();
		bas.getDriver();
		bas.launchUrl("http://greenscart.in/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("ramya99@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("ramya123");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnlogin.click();

}
}