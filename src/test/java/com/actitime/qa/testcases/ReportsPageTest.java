package com.actitime.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.ReportsPage;

public class ReportsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ReportsPage reportPage;
	
	public ReportsPageTest() {
		PageFactory.initElements(driver, this);
		
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
	@Test
	public void viewReports() {
		
		reportPage = new ReportsPage();
		homePage.clickOnReportsLink();
		reportPage.clickStaffPerformanceReport();
		reportPage.validateReport();
		
		
		}
	
	@AfterMethod(enabled=false)
	public void tearDown() {
		
		driver.quit();
	}
	
		
}
