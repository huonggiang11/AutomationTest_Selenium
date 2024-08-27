package automation.page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class LoginTestFactory extends CommonBase {
	LoginPageFactory loginFactory;
	LogoutPageFactory logoutFactory;
	
	@BeforeMethod
	public void openFirefox()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_CRMSTAR);
	}
	
	@Test
	public void logoutSuccessfully() throws InterruptedException {
		loginFactory = new LoginPageFactory(driver);
		loginFactory.LoginFunction("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
		Thread.sleep(10000);
		logoutFactory = new LogoutPageFactory(driver);
		logoutFactory.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	
	@Test
	public void loginFail_IncorrectPass()
	{
		loginFactory = new LoginPageFactory(driver);
		loginFactory.LoginFunction("admin@gmail.com","123");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	
	
}
