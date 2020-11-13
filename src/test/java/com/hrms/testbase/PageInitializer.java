package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmergencyContactsPage;
import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.JobTitlesPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetalesPage;
import com.hrms.pages.PimPage;
import com.hrms.pages.SkillsPageElements;
import com.hrms.utils.APICommonMethods;

public class PageInitializer extends BaseClass {
	protected static LoginPageElements login;
	protected static DashboardPageElements dash;
	protected static AddEmployeePageElements addEmp;
	protected static PimPage pim;
	protected static PersonalDetalesPage personalPage;
	protected static EmployeeListPage empList;
	protected static EmergencyContactsPage emgCont;
	protected static SkillsPageElements skillsPage;
	protected static JobTitlesPageElements jobTitlesPage;
	protected static APICommonMethods apiMethods;
	

	public static void initializePageObjects() {

		login = new LoginPageElements();
		dash = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pim = new PimPage();
		personalPage = new PersonalDetalesPage();
		empList = new EmployeeListPage();
		emgCont = new EmergencyContactsPage();
		skillsPage = new SkillsPageElements();
		jobTitlesPage = new JobTitlesPageElements();
		apiMethods = new APICommonMethods();
		
	}

}
