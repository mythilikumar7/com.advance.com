package stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionForLogin {
	
	WebDriver driver;
	static Logger logger = Logger.getLogger(StepDefinitionForLogin.class);
    
	@Given("^user should enter the url of the portal$")
	public void user_should_enter_the_url_of_the_portal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sumathinco-developer-edition.na172.force.com/s/login/");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("System navigated to community URL");
		
	    
	}
	
	@When("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='47:2;a']")).sendKeys("mgrey@sumathinco.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputBox input' and @type='password']")).sendKeys("Automation4mst");
		PropertyConfigurator.configure("logfile.properties");
		logger.warn("Credential validated and proceeding");
	  
	    
	}
	
	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.close();
		PropertyConfigurator.configure("logfile.properties");
		logger.warn("Window closed");
		
	    
	}

}
