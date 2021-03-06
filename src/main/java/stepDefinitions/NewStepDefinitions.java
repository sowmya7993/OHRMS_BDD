package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonFunctionLibrary.FunctionLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class NewStepDefinitions {
	
	WebDriver driver;
				
//	@When("^I Open \"([^\"]*)\" Browser$")
//	public void i_Open_Browser(String browserName) throws Throwable {
//	      System.out.println(browserName);
//	}
//
//	@When("^I Open Ohrms Application$")
//	public void i_Open_Ohrms_Application() throws Throwable {
//	   System.out.println("i will open the url");
//	}
	
	

//	@When("^I Open \"([^\"]*)\"$")
//	public void i_Open(String browsername) throws Throwable {
//		System.out.println(browsername);
//	}
//
//
//	@When("^I Open Ohrms Application$")
//	public void i_Open_Ohrms_Application() throws Throwable {
//			System.out.println("i will open the url");
//	}
	
	
	@When("^I Open \"([^\"]*)\"$")
	public void i_Open(String browserName) throws Throwable {
				
		 driver=FunctionLibrary.startBrowser(browserName);
		
		
	}
	
	@When("^I Open Application$")
	public void i_Open_Application() throws Throwable {
		FunctionLibrary.openApplication(driver);
	}
	
	@When("^I Wait For \"([^\"]*)\" with \"([^\"]*)\" for \"([^\"]*)\" seconds$")
	public void i_Wait_For_with_for_seconds(String elementName, String locator, String seconds) throws Throwable {
		
		
		String[] locatorsplit=locator.split("-");
		
		FunctionLibrary.waitForElement(driver, locatorsplit[0], locatorsplit[1], seconds);
			
	}
	
	@When("^I Enter \"([^\"]*)\" into \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_Enter_into_with(String testData, String elementName, String locator) throws Throwable {
		String[] locatorsplit=locator.split("-");
		FunctionLibrary.typeAction(driver, locatorsplit[0], locatorsplit[1], testData);	
	}
	
	 			 
	
	@When("^I Click On \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_Click_On_with(String elementName, String locator) throws Throwable {
	 				 String[] locatorsplit=locator.split("-");
	 				FunctionLibrary.clickAction(driver,  locatorsplit[0], locatorsplit[1]);	 
	}
	
	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
		FunctionLibrary.closeBrowser(driver);
	}
	
	@When("^I select \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_select_with(String optionToSelect, String locator) throws Throwable {
		String[] locatorsplit=locator.split("-");
		FunctionLibrary.selectAction(driver, locatorsplit[0], locatorsplit[1], optionToSelect);
	}
	
	@When("^I select from \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_select_from_with(String  dateToSelect, String locator) throws Throwable {
		String[] locatorsplit=locator.split("-");
		FunctionLibrary.selectFromCalendar(driver, locatorsplit[0], locatorsplit[1], dateToSelect);
	}
	
	@When("^I hit Enter on \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_hit_Enter_on_with(String elementName, String locator) throws Throwable {
		String[] locatorsplit=locator.split("-");
		FunctionLibrary.hitEnter(driver,  locatorsplit[0], locatorsplit[1]);
	}
	
	@Before
	public void beforeScenario() {
		System.out.println("********************* SCENARIO EXECUTION STARTED *******************");
	}
	
	@After
	public void AfterScenario() {
		System.out.println("********************* SCENARIO EXECUTION COMPLETED *******************");
	}

	
}
