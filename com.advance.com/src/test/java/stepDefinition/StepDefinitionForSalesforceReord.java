package stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionForSalesforceReord {
	
	WebDriver driver;
	static Logger logger = Logger.getLogger(StepDefinitionForLogin.class);
	
	@Given("^User enters the url of the salesforce$")
	public void user_enters_the_url_of_the_salesforce() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sumathinco-dev-ed.my.salesforce.com/");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("System navigated to Salesforce page");
	    
	}
	
	@When("^User enters the username and password$")
	public void user_enters_the_username_and_password()  throws Throwable{
		driver.findElement(By.id("username")).sendKeys("automationdemo@mstsolutions.com");
		driver.findElement(By.id("password")).sendKeys("Automation4mst");
		driver.findElement(By.id("Login")).click();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("System validated with salesforce credential");
	    
	    
	}
	
	@Then("^User clicks the applauncher and selects Applications$")
	public void user_clicks_the_applauncher_and_selects_applications() throws Throwable{
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Applications");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class ='slds-truncate']")).click();
	    
	}
	
	@Then("^User clicks listview and selects todaysapplications$")
	public void user_clicks_listview_and_selects_todaysapplications() throws Throwable{
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small uiOutputText']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"virtualAutocompleteListbox_83214d942bda3\"]/li[2]")).click();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("proceeding with application search");
	    
	}
	
	@Then("^User clicks the record created$")
	public void user_clicks_the_record_created() throws Throwable{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//table/tbody/tr[1]/th/span/a")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		PropertyConfigurator.configure("logfile.properties");
		logger.warn("check whether record created");
	    
		driver.close();

	    
	}


}
