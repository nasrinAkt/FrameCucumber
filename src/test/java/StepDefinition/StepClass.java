package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	@Given("^Open docs oracle application$")
	public void open_docs_oracle_application() throws Throwable {
	  System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe") ;
	  ChromeOptions run = new ChromeOptions();
	  run.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver();
	  driver.get("https://docs.oracle.com/javase/8/docs/api/");
	  
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  
	}

	@Then("^click on help$")
	public void click_on_help() throws Throwable {
	 
	/*	driver.switchTo().frame("classFrame");	
	WebElement help	 = driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]/a"));
	help.click();
		
	Thread.sleep(1000); */
	
   /*driver.switchTo().frame("packageListFrame");
	
	WebElement tl = driver.findElement(By.linkText("java.applet"));
	tl.click();
	Thread.sleep(2000);
	driver.close(); */
	
	((JavascriptExecutor)driver).executeScript("scroll(0,2200)");
	driver.switchTo().frame("packageFrame");
    WebElement k = driver.findElement(By.linkText("Base64"));
    k.click();
	//WebElement r = driver.findElement(By.linkText("AbstractWriter"));
	//r.click();
	Thread.sleep(5000);
	driver.close();
	}


}
