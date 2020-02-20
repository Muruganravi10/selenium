package testexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excellogin
{
public static void main(String[] args) throws IOException
{
	FileInputStream file=new FileInputStream(new File("C:\\Users\\BLTuser.BLT1207\\Desktop\\excelwork.xlsx"));
			XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int count = sheet.getLastRowNum();
	System.out.println(count);
	for(int i=1;i<=count;i++)
	{
		XSSFRow row=sheet.getRow(i);
		XSSFCell cell= row.getCell(0);
		String un=cell.getStringCellValue();
		XSSFCell cell1=row.getCell(1);
		String Pwd=cell.getStringCellValue();
		 System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1207//Downloads//chromedriver.exe");
			WebDriver chrome=new ChromeDriver();
		      chrome.get("https://in.linkedin.com");
			chrome.manage().window().maximize();
	         chrome.findElement(By.className("nav__button-secondary")).click();
	        chrome.findElement(By.id("username")).sendKeys(un);
	        chrome.findElement(By.id("password")).sendKeys(Pwd);
	      //  chrome.findElement(By.className("btn__primary--large from__button--floating")).click();
	         chrome.close();

		}
}
}
