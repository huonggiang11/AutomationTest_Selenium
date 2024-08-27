package automation.page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class SigninTest_day14 extends CommonBase{
	SigninPage_day14 signin;
	LoginPage_day14 Login;
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_ALADA);
	
	}
	
	@Test
	public void signinSuccessfully() throws InterruptedException {
		signin = new SigninPage_day14(driver);
		signin.SigninFunction("Huong Giang8", "hgiang118@gmail.com", "hgiang118@gmail.com","hgiang11", "hgiang11", "0971522968");
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
	@Test
	public void editPassword() throws InterruptedException {
		Login = new LoginPage_day14(driver);
		Login.LoginFunction("hgiang117@gmail.com", "hgiang11");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
		signin = new SigninPage_day14(driver);
		signin.Login_information("hgiang11", "hgiang11a", "hgiang11a");
		driver.switchTo().alert().accept();
	}
	@Test
	public void LoginSuccessfully() {
		Login = new LoginPage_day14(driver);
		Login.LoginFunction("hgiang116@gmail.com", "hgiang11");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
}
