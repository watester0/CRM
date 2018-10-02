package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("D:\\Automation\\Practice\\Soltex\\CRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties"));
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browsername=prop.getProperty("browser");
		
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Practice\\jars\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gechko.driver", "D:\\Automation\\Practice\\jars\\geckodriver.exe");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
