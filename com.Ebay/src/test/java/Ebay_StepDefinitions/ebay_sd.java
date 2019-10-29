package Ebay_StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Ebay_PageFactory.ebay_pf;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebay_sd {
	WebDriver driver;
	ebay_pf run;
	
	@Test(priority=1)
	@Given("^User Opens Chrome Browser and enter URL$")
	public void user_Opens_Chrome_Browser_and_enter_URL() throws Throwable {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\eclipse-workspace\\com.Ebay\\Drivers\\chromedriver.exe");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		run=PageFactory.initElements(driver,ebay_pf.class);
		Thread.sleep(3000);
	    
	}
	@Test(priority=2)
	@When("^Search Vintage Watches$")
	public void search_Vintage_Watches() throws Throwable {
		run.getSearch1().sendKeys("Vintage Watches");
		run.getClickSearch1().click();
	 
	}
	@Test(priority=3)
	@When("^Sort price low to High$")
	public void sort_price_low_to_High() throws Throwable {
		Actions act=new Actions(driver);
		WebElement msovr=driver.findElement(By.xpath("//*[@id=\"w4-w1_btn\"]/div"));
		act.moveToElement(msovr);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"w4-w1\"]/div/div/ul/li[4]/a/span")).click();
	}
	@Test(priority=4)
	@When("^Select price range from (\\d+) to (\\d+)$")
	public void select_price_range_from_to() throws Throwable {
		run.getPriceRange().click();
	  
	}
	@Test(priority=5)
	@When("^select gender as man$")
	public void select_gender_as_man() throws Throwable {
		run.getGender().click();
	  
	}
	@Test(priority=6)
	@Then("^click on Vintage soviet MAJAK m(\\d+) Watch$")
	public void click_on_Vintage_soviet_MAJAK_m_Watch() throws Throwable {
		run.getSelectWatch1().click();
	  
	}
//	@Test(priority=7)
//	@Then("^add to cart with (\\d+) years plan$")
//	public void add_to_cart_with_years_plan() throws Throwable {
//		run.getAddCart1().click();
//		run.getAddPlan().click();
//	  
//	}
	@Test(priority=8)
	@Then("^Search Vintage Watches again$")
	public void search_Vintage_Watches_again() throws Throwable {
		run.getClickSearchAgain().click();
	
	}
	@Test(priority=9)
	@Then("^Click Vintage Waltham Art Deco Watch Runs$")
	public void click_Vintage_Waltham_Art_Deco_Watch_Runs() throws Throwable {
		run.getSelectWatch2().click();
	 
	}
	@Test(priority=10)
	@Then("^Add to cart without plan$")
	public void add_to_cart_without_plan() throws Throwable {
		run.getAddCartAgain().click();
		run.getWithoutPlan().click();
	  
	}
	@Test(priority=11)
	@Then("^Remove (\\d+)yrs plan from cart$")
	public void remove_yrs_plan_from_cart() throws Throwable {
		run.getRemoveCart().click();
	   
	}
	@Test(priority=12)
	@Then("^Go to Checkout$")
	public void go_to_Checkout() throws Throwable {
		
	 run.getCheckOut().click();
	}
	@Test(priority=13)
	@Then("^Provide invalid credentials$")
	public void provide_invalid_credentials() throws Throwable {
		run.getUserName().sendKeys("aaaaaaaa");
		run.getPassword().sendKeys("123456789");
	}
	@Test(priority=14)
	@Then("^Validate login failure$")
	public void validate_login_failure() throws Throwable {
	  String text="\r\n" + "Oops, that's not a match.";
	  String ActualText=run.getSigninError().getText();
	  if(ActualText.contains(text)) {
		  System.out.println("Login failur Passed");
	  }else {
		  System.out.println("Login failure Failed");
	  }
	}
	@Test(priority=15)
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	   
	}


	
}
