package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethods {
	
	
	@Given("Click CRMSFA Link")
	public void clickonCrmLink() throws Exception {
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
	}
    @And ("Select the leads option")
    public void selectLeads() {
    	driver.findElement(By.linkText("Leads")).click();
    	
    }
    @And ("Click on CreateLead icon")
    public void createLead() {
    	driver.findElement(By.linkText("Create Lead")).click();
    }
    @And ("Type the companyname as (.*)$")
    public void companynameType(String companyname) {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
    
    	
    	
    }
    @And ("Type the firstname as (.*)$")
    public void firstNameType(String firstname) {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
    	
    }
    @And("Type the lastname as (.*)$")
    public void lastName(String lastname) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
    }
    @Then("Proceed to creating lead")
    
    public void creationOfLead() {
    	driver.findElement(By.name("submitButton")).click();
    }
	
		
		
	

	}
	
	

