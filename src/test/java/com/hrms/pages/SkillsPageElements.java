package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class SkillsPageElements extends BaseClass {
	@FindBy(id = "btnAdd")
	public WebElement addSkillsBtn;
	
	@FindBy(id = "skill_name")
	public WebElement skillName;
	
	@FindBy(id = "skill_description")
	public WebElement skillDescription;
	
	@FindBy(id = "btnSave")
	public WebElement skillSaveBtn;
	
	@FindBy(xpath = "//table[@id = 'recordsListTable']/tbody/tr/td[2]")
	public WebElement skillNameInTable;
	
	
	public SkillsPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	

}
