package stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionForHomePage {
	
	WebDriver driver;
	static Logger logger = Logger.getLogger(StepDefinitionForLogin.class);
	
	@Given("^user is on the home page$")	
    public void user_is_on_the_home_page() throws Throwable{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sumathinco-developer-edition.na172.force.com/s/login/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='47:2;a']")).sendKeys("mgrey@sumathinco.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputBox input' and @type='password']")).sendKeys("Automation4mst");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
	    System.out.println("User is on the homepage");
	    PropertyConfigurator.configure("logfile.properties");
		logger.info("By proceeding with the credential successfullly logged in to the portal");
	}
	
	@Then("^user selects the search contacts$")
	public void user_selects_the_search_contacts() throws Throwable {
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='combobox-input-41']")).sendKeys("Meredith Grey");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Contact searching success");
		
		
	    
	}
	
	@Then("^user clicks the applicant name$")
	public void user_clicks_the_applicant_name() throws Throwable{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"combobox-input-41-1-41\"]/span[2]/span[1]/lightning-base-combobox-formatted-text")).click();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Proceeding with further details");
		
	}
	
	
	@Then("^user clicks the academic department$")
	public void user_clicks_the_academic_department() throws Throwable{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='Academic_Dept__c']")).click();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Choosen the academic");
	    
	}
	@Then("^user selects the department$")
	public void user_selects_the_department() {
		driver.findElement(By.xpath("//span[text()='English']")).click();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Choosen the department");
	    
	    
	}
	@Then("^user clicks the applicant type$")
	public void user_clicks_the_applicant_type() throws Throwable{
		driver.findElement(By.xpath("//button[@name='Application_Type__c']")).click();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Choosen the application type");
	    
	   
	}
	@Then("^user selects the applicant type$")
	public void user_selects_the_applicant_type() throws Throwable{
	   driver.findElement(By.xpath("//span[text()='Graduate']")).click();
	   PropertyConfigurator.configure("logfile.properties");
		logger.info("Entered the Graduate");
	    
	}
	@Then("^user chcks the fafsa checkbox$")
	public void user_chcks_the_fafsa_checkbox() throws Throwable{
		driver.findElement(By.xpath("//input[@name='FAFSA__c']")).isSelected();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("checked the FAFSA checkbox");
	    
	    
	}
	@Then("^user enters the gpa$")
	public void user_enters_the_gpa() throws Throwable{
		driver.findElement(By.xpath("//input[@name='GPA__c']")).sendKeys("8.5");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Entered the GPA");
	    
	    
	}
	@Then("^user enters the testscore$")
	public void user_enters_the_testscore() throws Throwable{
		driver.findElement(By.xpath("//input[@name='TestScore__c']")).sendKeys("90");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Entered the testscore");
	    
	    
	}
	@Then("^user enters the schoolname$")
	public void user_enters_the_schoolname() throws Throwable{
		driver.findElement(By.xpath("//input[@name='School_Name__c']")).sendKeys("ABCD school");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Entered the SchoolName");
	    
	    
	}
	@Then("^users enters the dateofbirth$")
	public void users_enters_the_dateofbirth() throws Throwable{
		driver.findElement(By.xpath("//input[@name='DOB__c']")).sendKeys("Dec 28, 1995");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Entered the Date of birth");
		
	    
	}
	@Then("^user enters the email$")
	public void user_enters_the_email() throws Throwable{
		driver.findElement(By.xpath("//input[@name='Email__c']")).sendKeys("testingmail@mailinator.com");
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Entered the Email");
	    
	}
	@Then("^user clicks the createnew button$")
	public void user_clciks_the_createnew_button() throws Throwable{
		driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
		PropertyConfigurator.configure("logfile.properties");
		logger.info("Proceeded with Create new button");
		driver.close();
	    
	}

}



 
