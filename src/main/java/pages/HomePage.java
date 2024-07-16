package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className = "header-logo__image")
	WebElement logo;
	
	@FindBy(xpath = "//span[text()='Men']")
	WebElement men;
	
	public void validateLogo() {
		logo.click();
	}
	
	public void validateMen() throws InterruptedException {
		men.click();
		Thread.sleep(4000);
	}
	
	

}
