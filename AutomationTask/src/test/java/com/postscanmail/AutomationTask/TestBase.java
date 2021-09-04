package com.postscanmail.AutomationTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver ; 

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void startdriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://app-test.postscanmail.com/registration?plan=5370&store=6&address=1004");
		



	}

	@AfterSuite
	public void quitdriver() {
		driver.quit();
	}


}
