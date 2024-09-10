package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_btvn_01 extends CommonBase{
	@BeforeMethod
	public void openChrome() 
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_ALADALOGIN);
	}
	@Test
	public void updatePassword()
	{
		type(By.id("txtLoginUsername"), "giangg610@gmail.com");
		type(By.id("txtLoginPassword"), "hgiang11a");
		click(By.xpath("//button[text()='ĐĂNG NHẬP' and @type='submit']"));
		click(By.xpath("//div[@class='avatar2']"));
		click(By.xpath("//a[text()='Chỉnh sửa thông tin']"));
		type(By.id("txtpassword"),"hgiang11a");
		type(By.id("txtnewpass"), "hgiang11");
		type(By.id("txtrenewpass"), "hgiang11");
		click(By.xpath("//button[text()='Lưu mật khẩu mới']"));
		driver.switchTo().alert().accept();
		String title= driver.getTitle();
		assertEquals(title,"Thông tin cá nhân");
	}
	
	@AfterMethod
	public void closeBrower()
	{
		driver.close();
	}
}

