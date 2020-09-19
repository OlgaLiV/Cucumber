package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPage extends BaseClass{
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td")
	public List<WebElement> table;
	
	@FindBy(linkText = "Next")
	public WebElement nextBtn;
	
	@FindBy(id = "empsearch_id")
	public WebElement empSearchById;
	
	@FindBy (id = "empsearch_employee_name_empName")
	public WebElement empSearchByName;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath = "//input[@name = 'chkSelectRow[]']")
	public WebElement checkbox;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[3]")
	public WebElement firstNameInTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[4]")
	public WebElement lastNameInTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[2]")
	public WebElement idInTable;
	
	@FindBy(id = "btnDelete")
	public WebElement deleteButton;
	
	@FindBy (id = "dialogDeleteBtn")
	public WebElement confirmDeleteBtn;
	
	
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}

}
