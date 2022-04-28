package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autodropdown {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\kavir\\eclipse-workspace\\Frame\\Excel\\skills.xlsx");
		Workbook workbook = new XSSFWorkbook(); 
		Sheet sheet = workbook.createSheet("Test");
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
       WebElement dropdown = driver.findElement(By.xpath("//select[@id='Skills']"));
	   // dropdown.click();
	    Select select = new Select(dropdown);
       List<WebElement> options = select.getOptions();	
       for(int i=0;i<options.size();i++){
        WebElement createRow = options.get(i);
        Row createRow2 = sheet.createRow(i);
        Cell createCell = createRow2.createCell(0);
        String text = createRow.getText();
        createCell.setCellValue(text);
        System.out.println(text);
       }
	   FileOutputStream out = new FileOutputStream(file);
       workbook.write(out);
}
}
	



