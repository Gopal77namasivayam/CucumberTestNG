package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


 

public class TestBase {

	public static WebDriver driver;
	public static Properties prob;
	public TestBase() {
		try {
			prob = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\ecli\\CucumberWithPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prob.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void initialtion() {
		String browsername = prob.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		 

		driver.get(prob.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Time_Out, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

}
