package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPage extends BaseClass{
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td")
	public List<WebElement> table;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[2]")
	public List<WebElement> idList;
	
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
	public List<WebElement> firstNameInTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[4]")
	public WebElement lastNameInTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[2]")
	public WebElement idInTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']")
	public WebElement resultTable;
	
	@FindBy(id = "btnDelete")
	public WebElement deleteButton;
	
	@FindBy (id = "dialogDeleteBtn")
	public WebElement confirmDeleteBtn;
	
	public boolean isTableDisplayed() {
		return resultTable.isDisplayed();
	}
	
	public List<Map<String, String>> getFirstNameFromTable(){
		List<Map<String, String>> uiFirstNames = new ArrayList<>();
		for(WebElement firstNameRow:firstNameInTable) {
			Map<String, String> mapData = new LinkedHashMap<>();
			String tableName = firstNameRow.getText();
			mapData.put("emp_firstname", tableName);
			uiFirstNames.add(mapData);
		}
		return uiFirstNames;
	}
		
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}

}
