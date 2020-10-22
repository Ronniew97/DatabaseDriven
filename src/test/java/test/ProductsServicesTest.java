package test;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.ProductsServicesPage;
import util.BrowserFactory;
import util.DatabaseConnection;

public class ProductsServicesTest {

	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToAddAProductWithValidCredentials() throws ClassNotFoundException, SQLException {
		String username = DatabaseConnection.getData("users","username");
		String password = DatabaseConnection.getData("users","password");
		String name = DatabaseConnection.getData("products","Name");
		String price = DatabaseConnection.getData("products","Sales_Price");
		String items = DatabaseConnection.getData("products","Item_Number");
		String description = DatabaseConnection.getData("products","Description");
		
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clickSignInButton();
		ProductsServicesPage products = PageFactory.initElements(driver, ProductsServicesPage.class);
		products.clickProductsAndServicesButton();
		products.clickNewProductButton();
		products.enterName(name);
		products.enterSalesPrice(price);
		products.enterItemNumber(items);
		products.enterDescription(description);
		products.clickSubmitButton();
	
	}
}
