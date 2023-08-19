package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchProductPage {
	
	
	WebDriver driver;
	
	public searchProductPage (WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(id="APjFqb")
	WebElement searchbar;
	
	@FindBy(name="btnK")
	WebElement searchButton;
	
	@FindBy(id="result-stats")
	WebElement searchResult;
	
	public void enterProductName(String productName) {
		searchbar.sendKeys(productName);
	}	
	public void clickOnsearchButton() {
		searchButton.click();
	}
	public boolean isSearchResultDisplayed() {
		return searchResult.isDisplayed();
	}
	
}
