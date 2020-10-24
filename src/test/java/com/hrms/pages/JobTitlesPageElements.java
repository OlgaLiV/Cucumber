package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class JobTitlesPageElements extends BaseClass {

	@FindBy(xpath = "//table[@id = 'resultTable']")
	public WebElement jobTitlesResultTable;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/TBODY/tr/td/a")
	public List<WebElement> listOfJT;
	
	public boolean isJobTitlesTableDisplayed() {
		return jobTitlesResultTable.isDisplayed();
	}
	
	public List<Map<String, String>> getJobTitlesFromTable(){
		List<Map<String, String>> uiJobTitles = new ArrayList<>();
		for(WebElement jobTitles:listOfJT) {
			Map<String, String> mapData = new LinkedHashMap<>();
			String tableName = jobTitles.getText();
			mapData.put("job_title", tableName);
			uiJobTitles.add(mapData);
		}
		return uiJobTitles;
	}

	public JobTitlesPageElements() {
		PageFactory.initElements(driver, this);
	}

}
