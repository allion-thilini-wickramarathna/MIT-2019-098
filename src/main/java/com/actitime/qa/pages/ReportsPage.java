package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.qa.base.TestBase;

public class ReportsPage extends TestBase  {

	
	// Web Element Xpath 
	
	@FindBy(xpath = "//div[@id='ext-gen134']")
	WebElement createChart;

	@FindBy(xpath = "//div[@id='ext-gen29']")
	WebElement reportsLink;

	@FindBy(xpath = "//div[@id='logo_aT']")
	WebElement actitimeLogo;	
	
	@FindBy(xpath = "//div[contains(@class,'type-title') and contains(text(), 'Staff Performance')]")
	WebElement viewStaffPerformanceReport;
	
	@FindBy(xpath = "//div[contains(@class,'pagetitle') and contains(text(), 'Staff Performance Report')]")
	WebElement verifyStaffPerformanceReport;
	
	
	// Call init
	
	
	// Method
	
	public ReportsPage clickStaffPerformanceReport() {		
	
    viewStaffPerformanceReport.click();
    return new ReportsPage();
		
	}
	
	public Boolean validateReport() {
		return verifyStaffPerformanceReport.isDisplayed();
	}
	
	
	
}
