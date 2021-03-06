package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements extends BaseClass{
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimLinkBtn;
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminLinkBtn;

	@FindBy(id = "menu_leave_viewLeaveModule")
	public WebElement leaveLinkBtn;
	
	@FindBy(id = "menu_time_viewTimeModule")
	public WebElement timeLinkBtn;
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	public WebElement recruitmentLinkBtn;
	
	@FindBy(id = "menu_dashboard_index")
	public WebElement dashboardLinkBtn;
	
	@FindBy(id = "menu_directory_viewDirectory")
	public WebElement directoryLinkBtn;
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empListBtn;
	
	@FindBy(id = "menu_admin_Job")
	public WebElement jobLinkBtn;
	
	@FindBy(id = "menu_admin_viewJobTitleList")
	public WebElement jobTitleBtn;
	
	@FindBy(id = "welcome")
	public WebElement welcomeMsg;
	
	@FindBy(id = "menu_admin_Qualifications")
	public WebElement qualifications;
	
	@FindBy(id = "menu_admin_viewSkills")
	public WebElement skillsBtn;
		
	@FindBy(xpath = "//div[@class = 'menu']/ul/li")
	public List<WebElement> dashTabs;
	
	@FindBy(xpath = "//table[@id = 'recordsListTable']/tbody/tr/td")
	public List<WebElement> recordListTable;
	
	
	
	public DashboardPageElements() {
	
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
