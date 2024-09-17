package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_btvn_02 extends CommonBase {
	@BeforeMethod
	public void openChrome()
	{
		driver = initMSEdgeDriver(CT_PageURLs.URL_SELENIUMPRACTISE);
	}
	
	@Test
	public void verifyAlertMessage()
	{
	click(By.xpath("//button[text()='Try it']"));	
	waitAlertPeresent();
	String message = driver.switchTo().alert().getText();
	assertEquals(message, "Welcome to Selenium WebDriver Tutorials");
	}
	
	@AfterMethod
	public void closeBrower()
	{
		driver.close();
	}
}

