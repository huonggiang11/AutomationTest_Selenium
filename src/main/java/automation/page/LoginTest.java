package automation.page;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPage;

public class LoginTest extends CommonBase {
	LoginPage login;
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_ALADA);
	
	}
	@Test
	public void loginSuccessfully()
 {
		login = new LoginPage(driver);
		login.LoginFunction("giangg610@gmail.com","hgiang11");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
}
	
	@Test
	public void loginFail_UsernameNotExist()
 {
		login = new LoginPage(driver);
		login.LoginFunction("randomemail@gmailcom","123456");
		assertTrue(driver.findElement(By.xpath("//p[text()='Email này chưa được đăng ký.']")).isDisplayed());
 }
	
	@Test
	public void loginFail_PasswordInvalid()
 {
		login = new LoginPage(driver);
		login.LoginFunction("giangg610@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("(//p[text()='Mật khẩu sai.'])")).isDisplayed());
 }
	
	@Test
	 void loginFail_LeaveBlank()
 {
	 login = new LoginPage(driver);
	 login.LoginFunction("", "");
	 assertTrue(driver.findElement(By.xpath("//label[@id='txtLoginPassword-error']")).isDisplayed());
 }
}
