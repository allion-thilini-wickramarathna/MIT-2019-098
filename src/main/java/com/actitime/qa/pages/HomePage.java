package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {

	
	//Page Factory - Object Repository
	
		@FindBy(xpath = "//a[@class='content tasks']")
		WebElement taskLink;
		
		@FindBy(xpath = "//a[@class='content reports']")
		WebElement reportsLink;
		
		@FindBy(xpath = "//div[@id='logo_aT']")
		WebElement actitimeLogo;
		
		@FindBy(xpath = "//div[@id='container_users']")
		WebElement usersIcon;
		
		@FindBy(xpath = "//span[contains(@class,'userNameSpan') and contains(text(), 'Klein, Hannah')]")
		WebElement employeeName;
		
		@FindBy(xpath = "//div[contains(@class,'userName nameInfo ellipsis') and contains(text(), 'Hannah Klein')]")
		WebElement employeeProfile;
	
		
		//initialization
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		//Action/Methods
		
		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}
		
		
		
		public TasksPage clickOnTaskLink() {
			
			taskLink.click();
			return new TasksPage();
			
		}
		
		
        public ReportsPage clickOnReportsLink() {
			
	         reportsLink.click();
	         return new ReportsPage();
			
		}
        
        public UsersPage clickOnUsersLink() {
			
        	usersIcon.click();
	         return new UsersPage();
			
		}
        
        public UsersPage viewEmployeeProfile() {    		
    		
        	employeeName.click();
    		return new UsersPage();
    		
    	}
        
        public Boolean validateProfileName() {
			return employeeProfile.isDisplayed();
		}
        
	
}
