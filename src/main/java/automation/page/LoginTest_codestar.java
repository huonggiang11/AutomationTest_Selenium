package automation.page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class LoginTest_codestar extends CommonBase{
	LoginPage_codestar login;
	LogoutPage_codestar logout;
	@BeforeMethod
	public void openFirefox()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_CRMSTAR);
	
	}
	@Test
	public void loginSuccessfully()
 {
		login = new LoginPage_codestar(driver);
		login.LoginFunction("admin@gmail.com","12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()= 'Quản lý người dùng']")).isDisplayed());
}
	@Test
	public void loginFail_EmailNotExist() {
		login = new LoginPage_codestar(driver);
		login.LoginFunction("admin2@gmail.com","12345678");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	@Test
	public void loginFail_PasswordInvalid() {
		login = new LoginPage_codestar(driver);
		login.LoginFunction("admin@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	@Test
	public void loginFail_EmailPasswordInvalid() {
		login = new LoginPage_codestar(driver);
		login.LoginFunction("admin2@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	@Test
	public void LogoutSuccessfully() throws InterruptedException {
		login = new LoginPage_codestar(driver);
		login.LoginFunction("admin@gmail.com","12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()= 'Quản lý người dùng']")).isDisplayed());
		Thread.sleep(10000);
		logout = new LogoutPage_codestar(driver);
		logout.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	
	}
}
