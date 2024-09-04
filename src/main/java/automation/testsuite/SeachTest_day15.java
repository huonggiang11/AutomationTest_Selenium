package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.SigninPage_Day15;
import automation.page.UpdatePassword_PageFactory;


public class SeachTest_day15 extends CommonBase{
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	@Test
	public void SigninSuccessfully() {
		SigninPage_Day15 signin = new SigninPage_Day15(driver);
		signin.SiginFunction("Hương Giang", "11062000", "giangg610e@gmail.com", "123456");
		
		SigninPage_Day15 updatePass = new SigninPage_Day15(driver);
		updatePass.UpdatePassword("123456", "123456_new");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
		
		SigninPage_Day15 login = new SigninPage_Day15(driver);
		login.LoginFunction("giangg610e@gmail.com", "123456_new");
		
		SigninPage_Day15 search = new SigninPage_Day15(driver);
		search.SearchFuntion("ASP Net");
		assertTrue(driver.findElement(By.xpath("//a[text()='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP']")).isDisplayed());
	}
}
