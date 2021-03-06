package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetalesPage extends BaseClass{
	
	@FindBy(xpath = "//div[@id = 'profile-pic' ]/h1")
	public WebElement profilePictureText;
	
	@FindBy(xpath = "//a[text() = 'Emergency Contacts']")
	public WebElement emergencyContactsBtn;
	
	
	

	public PersonalDetalesPage() {
		PageFactory.initElements(driver, this);
	}

}
