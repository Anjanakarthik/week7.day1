package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProjectSpecificMethods{
	
	@Given("Select CRMSFA Link")
	public void clickonCrmLink() throws Exception {
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
	}
	
	@When("Leads option is selected")
	public void leadsOptionselect() {
		driver.findElement(By.linkText("Leads")).click();
		
	}
    @Then("Select FindLeads option")
    public void findLeads() {
    	driver.findElement(By.xpath("//a[contains( text(),'Find Leads')]")).click();
    }
    @Given("First name as 'Siva'")
    public void firstName() {
    	driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("Siva");
    }
    
    @Then("Select Findleads icon")
    public void iconFindLeads() throws Exception {
    	driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
    	Thread.sleep(5000);
    }
    @And("Select the first resulting lead")
    public void selectLead() {
    	
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
    }
    @Then("verify page title")
    public void pageTitleVerify() {
    String pagetitle=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	if(pagetitle.equalsIgnoreCase("View Lead")) {
		System.out.println("success");
		
	}
    }
    
    @And("Select edit lead button")
    public void selectionOfEdit() {
    driver.findElement(By.linkText("Edit")).click();
    }
    
    @Then("Clear the companyname")
    public void clearCompany() {
    	driver.findElement(By.id("updateLeadForm_companyName")).clear();
    }
    @And("Enter the companyName as (.*)$")
    public void enterCompanyName(String company) {
    	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
    	String editedname=driver.findElement(By.id("updateLeadForm_companyName")).getText();
		driver.findElement(By.name("submitButton")).click();

		String companynm=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companynm);
    	
    }
    
    


}
