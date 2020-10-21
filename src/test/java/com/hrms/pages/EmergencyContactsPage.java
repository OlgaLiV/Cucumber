package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmergencyContactsPage extends BaseClass{
	
	@FindBy(id = "btnAddContact")
	public WebElement addContactBtn;
	
	@FindBy(id = "emgcontacts_name")
	public WebElement emgContactsName;
	
	@FindBy(id = "emgcontacts_relationship")
	public WebElement emgRelationship;
	
	@FindBy(id = "emgcontacts_homePhone")
	public WebElement emgHomePhone;
	
	@FindBy(id = "emgcontacts_mobilePhone")
	public WebElement emgMobilePhone;
	
	@FindBy(id = "emgcontacts_workPhone")
	public WebElement emgWorkPhone;
	
	@FindBy(id = "btnSaveEContact")
	public WebElement emgContactsSaveBtn;
	
	@FindBy(xpath = "//table[@id = 'emgcontact_list']/tbody")
	public List<WebElement> emgListTable;
	
	
	public EmergencyContactsPage() {
		PageFactory.initElements(driver, this);
	}

}
