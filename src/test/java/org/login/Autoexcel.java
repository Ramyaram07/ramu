package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Autoexcel {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\kavir\\eclipse-workspace\\Frame\\Excel\\auto.xlsx");
    FileInputStream Stream= new FileInputStream(file);
    Workbook workbook = new XSSFWorkbook(Stream);
    Sheet sheet = workbook.getSheet("Datas");
    for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
    	Row row = sheet.getRow(i);
    	for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
    		Cell cell = row.getCell(j);
    		CellType type = cell.getCellType();
    	     switch(type)
    		   {
    			   case STRING :
    			     String stringCellValue = cell.getStringCellValue();
    				 System.out.println(stringCellValue);
    				 break;
    			   case NUMERIC :
    				   if(DateUtil.isCellDateFormatted(cell)){
    					   Date date = cell.getDateCellValue();
    					   SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MM-YY");
    					   String Format= dateFormat.format(date);
    					   System.out.println(Format);
    				   }
    				   else {
    					   double d = cell.getNumericCellValue();
    					   BigDecimal b=BigDecimal.valueOf(d);
    					   String num = b.toString();
    					   System.out.println(num);
    				   }
    					   break;
    				case BOOLEAN :
    					boolean booleanCellValue = cell.getBooleanCellValue();
    					System.out.println(booleanCellValue);
    				
    						   
    					   
    					   
    				   
    		   }
    					   
    	}
    }
    
}
}
