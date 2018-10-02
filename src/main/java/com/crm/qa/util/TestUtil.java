package com.crm.qa.util;

import java.io.File;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

import bsh.util.Util;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT= 20;
	public static long IMPLICIT_WAIT= 10;
	
	public static String TESTDATA_SHEET_PATH= "D:\\Automation\\Practice\\Soltex\\CRM\\src\\main\\java\\com\\crm\\qa\\testdata\\testdata1.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel1");
		
	}
	
	public void takeScreenShotAtEndOfTestCase() {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
				
	}
	
}
