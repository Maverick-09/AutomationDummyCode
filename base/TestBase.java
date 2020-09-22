package com.fullcycle.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	protected WebDriver driver;

	@BeforeTest
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Eclipse-Workspace/AutomationAssignment/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");

		
	}
	
	@AfterTest
	public void CloseBrowser() {
		
		driver.quit();
		
	}

}
