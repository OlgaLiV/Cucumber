package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PageInitializer;
import com.hrms.utils.ConfigsReader;

public class LoginPageElements extends PageInitializer {

	@FindBy(id = "txtUsername")
	public WebElement userNameTextBox;

	@FindBy(id = "txtPassword")
	public WebElement passwordTextBox;

	@FindBy(id = "btnLogin")
	public WebElement loginButton;
	
	@FindBy(id = "spanMessage")
	public WebElement spanMsg;
	
	@FindBy(xpath = "//div[@id = 'logInPanelHeading']")
	public WebElement loginPanelHeading;
	
	@FindBy(id = "divLogo")
	public WebElement syntaxLogo;
	
	
	/**
	 * This method will login to HRMS and entered credentials
	 * @param username
	 * @param password
	 */
	public void loginHrms(String username, String password) {
		login.userNameTextBox.sendKeys(username);
		login.passwordTextBox.sendKeys(password);
		login.loginButton.click();
	}

	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
	}


