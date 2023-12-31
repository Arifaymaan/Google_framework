package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Common.googleBase;
import Pages.searchProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




public class searchProduct extends googleBase{
	
	searchProductPage sp;
	
	
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
	launchBrowser();
		
	}
	  

	@When("i entre the {string} in the search bar")
	public void i_entre_the_in_the_search_bar(String Product_name) {
		
		sp = new searchProductPage(driver);
		sp.enterProductName(Product_name);
		
		
	}
	   

	@When("i click on the search button")
	public void i_click_on_the_search_button() {
		sp = new searchProductPage(driver);
		sp.clickOnsearchButton();
		
	  }

	@Then("i can see the search result successfully")
	public void i_can_see_the_search_result_successfully() throws InterruptedException {
		
		sp = new searchProductPage(driver);
		Assert.assertTrue(sp.isSearchResultDisplayed());
		      
		       Thread.sleep(500);
		      closeAll();
	  
		
	}

}
