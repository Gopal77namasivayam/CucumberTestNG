package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	// Pagefactory-OR
		@FindBy(xpath = "//td[contains(text(),'User: Demo User')]")
		WebElement UsernameLabel;
		@FindBy(xpath = "//a[contains(text(),'Contacts')]")
		WebElement ContactsLinks;
		@FindBy(xpath = "//a[contains(text(),'Deals')]")
		WebElement DealsLink;
		@FindBy(xpath = "//a[contains(text(),'Tasks')]")
		WebElement TasksLink;
		@FindBy(xpath="//a[contains(text(),'New Contact')]")
		WebElement newContact;
		
		public HomePage() throws IOException {
			PageFactory.initElements(driver, this);// this means current class web elements initalized by Pagefacory
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		public boolean verifyUserNameTest()
		{
			 return UsernameLabel.isDisplayed();
		}
}
