package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class ProductsServicesPage extends BasePage{
	WebDriver driver;
	
	public ProductsServicesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[11]/a/span[1]") WebElement PRODUCTS_SERVICES_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[11]/ul/li[2]/a") WebElement NEW_PRODUCT_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@id='name']") WebElement NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='sales_price']") WebElement SALES_PRICE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='item_number']") WebElement ITEM_NUMBER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//textarea[@id='description']") WebElement DESCRIPTION_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement SUBMIT_BUTTON;
	
	public void clickProductsAndServicesButton() {
		explicitWait("clickable",driver,10,PRODUCTS_SERVICES_BUTTON);
		PRODUCTS_SERVICES_BUTTON.click();
	}
	
	public void clickNewProductButton() {
		explicitWait("clickable",driver,10,NEW_PRODUCT_BUTTON);
		NEW_PRODUCT_BUTTON.click();
	}
	
	public void enterName(String name) {
		explicitWait("visible",driver,10,NAME_LOCATOR);
		NAME_LOCATOR.sendKeys(name);
	}
	
	public void enterSalesPrice(String price) {
		SALES_PRICE_LOCATOR.sendKeys(price);
	}
	
	public void enterItemNumber(String items) {
		ITEM_NUMBER_LOCATOR.sendKeys(items);
	}
	
	public void enterDescription(String description) {
		DESCRIPTION_LOCATOR.sendKeys(description);
	}
	
	public void clickSubmitButton() {
		SUBMIT_BUTTON.click();
	}
	
}
