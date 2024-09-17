package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.UpdatePassword_PageFactory;

public class UpdatePasswordTest_Day15 extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	@Test
	public void updatePasswordSuccessfully()
	{
		UpdatePassword_PageFactory updatePass = new UpdatePassword_PageFactory(driver);
		updatePass.LoginFunction("giangg610c@mail.com", "123456_new");
		updatePass.UpdatePassword("123456", "123456_new");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
	}
}
