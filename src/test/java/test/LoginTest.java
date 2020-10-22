package test;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;
import util.DatabaseConnection;

public class LoginTest {

	WebDriver driver;
	
	@Test
	public void userWithValidCredentialsShouldBeAbleToLogin() throws ClassNotFoundException, SQLException {
		String username = DatabaseConnection.getData("users","username");
		String password = DatabaseConnection.getData("users","password");
		
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clickSignInButton();
	}

}
