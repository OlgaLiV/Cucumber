package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PimPage extends BaseClass {
	@FindBy(xpath = "//a[@id= 'menu_pim_addEmployee']")
	public WebElement addEmpBtn;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr[5]")
	public WebElement anyEmployee;

	public PimPage() {
		PageFactory.initElements(driver, this);
	}

}
