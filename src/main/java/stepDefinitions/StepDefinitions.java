package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonFunctionLibrary.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	 WebDriver driver;
	@When("^I open chrome browser$")
	public void i_open_chrome_browser() throws Throwable {
	    
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		    driver=new ChromeDriver();	    
		   
	}

	@When("^I launch OHRMS url$")
	public void i_launch_OHRMS_url() throws Throwable {
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^I enter username$")
	public void i_enter_username() throws Throwable {
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	@Then("^I close the brower$")
	public void i_close_the_brower() throws Throwable {
	    driver.close();
	}
	
	
	// user registration steps
	
	
	@When("^I Open Browser$")
	public void i_Open_Browser() throws Throwable {
		 driver=FunctionLibrary.startBrowser("chrome");
	}

	

	@When("^I Wait For Username$")
	public void i_Wait_For_Username() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "txtUsername", "10");
	}

	@When("^I Enter Username$")
	public void i_Enter_Username() throws Throwable {
		FunctionLibrary.typeAction(driver, "id", "txtUsername", "Admin");
	}
	
	@When("^I Wait For Password$")
	public void i_Wait_For_Password() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "txtPassword", "10");
	}

	@When("^I Enter Password$")
	public void i_Enter_Password() throws Throwable {
		FunctionLibrary.typeAction(driver, "id", "txtPassword", "admin123");
	}

	@When("^I Wait For Login$")
	public void i_Wait_For_Login() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "btnLogin", "10");
	}

	@When("^I Click On Login$")
	public void i_Click_On_Login() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "btnLogin");
	}
	
	@When("^I Wait For Admin$")
	public void i_Wait_For_Admin() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "menu_admin_viewAdminModule", "10");
	}

	@When("^I Click On Admin$")
	public void i_Click_On_Admin() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "menu_admin_viewAdminModule");
	}
	
	@When("^I Wait For Employee Name$")
	public void i_Wait_For_Employee_Name() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "systemUser_employeeName_empName", "10");
	}

	@When("^I Enter Employee Name$")
	public void i_Enter_Employee_Name() throws Throwable {
		FunctionLibrary.typeAction(driver, "id", "systemUser_employeeName_empName", "hybriduser5");
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "systemUser_userName", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
		FunctionLibrary.typeAction(driver, "id", "systemUser_userName", "hybriduser5");
	}
	
	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
		FunctionLibrary.waitForElement(driver, "name", "systemUser[password]", "10");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		FunctionLibrary.typeAction(driver, "name", "systemUser[password]", "hybriduser123#");
	}
	
	@When("^Wait For Confirm Password$")
	public void wait_For_Confirm_Password() throws Throwable {
		FunctionLibrary.waitForElement(driver, "name", "systemUser[confirmPassword]", "10");
	}
	
	@When("^Enter Confirm Password$")
	public void enter_Confirm_Password() throws Throwable {
		FunctionLibrary.typeAction(driver, "name","systemUser[confirmPassword]", "hybriduser123#");
	}
	
	@When("^Wait For Save$")
	public void wait_For_Save() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "btnSave", "10");
	}

	@When("^Click On Save$")
	public void click_On_Save() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "btnSave");
	}
	
	@When("^I Wait For Add Button$")
	public void i_Wait_For_Add_Button() throws Throwable {
		FunctionLibrary.waitForElement(driver, "name", "btnAdd", "10");
	}

	@When("^I Click On Add Button$")
	public void i_Click_On_Add_Button() throws Throwable {
		FunctionLibrary.clickAction(driver, "name", "btnAdd");
	}

	@When("^I Wait For PIM$")
	public void i_Wait_For_PIM() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "menu_pim_viewPimModule", "10");
	}

	@When("^I Click On PIM$")
	public void i_Click_On_PIM() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "menu_pim_viewPimModule");
	}
	
	@When("^I Wait For Add Employee$")
	public void i_Wait_For_Add_Employee() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "menu_pim_addEmployee", "10");
	}

	@When("^I Click On Add Employee$")
	public void i_Click_On_Add_Employee() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "menu_pim_addEmployee");
	}
	
	@When("^I Wait For First Name$")
	public void i_Wait_For_First_Name() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "firstName", "10");
	}

	@When("^I Enter First Name$")
	public void i_Enter_First_Name() throws Throwable {
		FunctionLibrary.typeAction(driver, "id", "firstName", "emp_firstname_1");
	}

	@When("^I Wait For Last Name$")
	public void i_Wait_For_Last_Name() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "lastName", "10");
	}

	@When("^I Enter Last Name$")
	public void i_Enter_Last_Name() throws Throwable {
		FunctionLibrary.typeAction(driver, "id", "lastName", "emp_lastname_1");
	}
	
	@When("^I Wait For Leave$")
	public void i_Wait_For_Leave() throws Throwable {
		FunctionLibrary.waitForElement(driver, "linktext", "Leave", "10");
	}

	@When("^I Click On Leave$")
	public void i_Click_On_Leave() throws Throwable {
		FunctionLibrary.clickAction(driver, "linktext", "Leave");
	}
	
	@When("^I Wait For Assign Leave$")
	public void i_Wait_For_Assign_Leave() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "menu_leave_assignLeave", "10");
	}

	@When("^I Click On Assign Leave$")
	public void i_Click_On_Assign_Leave() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "menu_leave_assignLeave");
	}
	
	@When("^I Wait For into Employee Name$")
	public void i_Wait_For_into_Employee_Name() throws Throwable {
		FunctionLibrary.waitForElement(driver, "name", "assignleave[txtEmployee][empName]", "10");
	}

	@When("^I Enter into Employee Name$")
	public void i_Enter_into_Employee_Name() throws Throwable {
	    FunctionLibrary.typeAction(driver, "name", "assignleave[txtEmployee][empName]", "Jasmine Morgan");
	}
	
	@When("^I Wait For Leave Type$")
	public void i_Wait_For_Leave_Type() throws Throwable {
		FunctionLibrary.waitForElement(driver, "name", "assignleave[txtLeaveType]", "10");
	}

	@When("^I Select Leave Type$")
	public void i_Select_Leave_Type() throws Throwable {
		FunctionLibrary.selectAction(driver, "name", "assignleave[txtLeaveType]", "Casual Leave");
	}
	
	@When("^I Wait For From Date$")
	public void i_Wait_For_From_Date() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "assignleave_txtFromDate", "10");
	}

	@When("^I Select From Date$")
	public void i_Select_From_Date() throws Throwable {
		FunctionLibrary.selectFromCalendar(driver, "id", "assignleave_txtFromDate", "5/28/2020");
	}
	
	@When("^I Wait For To Date$")
	public void i_Wait_For_To_Date() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "assignleave_txtToDate", "10");
	}

	@When("^I Select To Date$")
	public void i_Select_To_Date() throws Throwable {
		FunctionLibrary.selectFromCalendar(driver, "id", "assignleave_txtToDate", "8/28/2020");
	}
	
	@When("^I Hit Enter$")
	public void i_Hit_Enter() throws Throwable {
		FunctionLibrary.hitEnter(driver, "id", "assignleave_txtToDate");
	}
	
	@When("^I Wait For Partial Days$")
	public void i_Wait_For_Partial_Days() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "assignleave_partialDays", "10");
	}

	@When("^I Select Partial Days$")
	public void i_Select_Partial_Days() throws Throwable {
		FunctionLibrary.selectAction(driver, "id", "assignleave_partialDays", "All Days");
	}
	
	@When("^I Wait For Comment$")
	public void i_Wait_For_Comment() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "assignleave_txtComment", "10");
	}

	@When("^I Enter Comment$")
	public void i_Enter_Comment() throws Throwable {
		FunctionLibrary.typeAction(driver, "id", "assignleave_txtComment", "test");
	}
	
	@When("^I Wait For Assign$")
	public void i_Wait_For_Assign() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "assignBtn", "10");
	}

	@When("^I Click On Assign$")
	public void i_Click_On_Assign() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "assignBtn");
	}
	
}
