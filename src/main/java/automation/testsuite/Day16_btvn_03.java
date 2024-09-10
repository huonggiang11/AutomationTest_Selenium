package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_btvn_03 extends CommonBase{
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_GURU99DELETE);
	}
	
	@Test
	public void deleteCustomer()
	{
		type(By.name("cusid"), "11");
		click(By.name("submit"));
		Alert alert1= driver.switchTo().alert();
		alert1.accept();
		
		waitAlertPeresent();
		Alert alert2= driver.switchTo().alert();
		String message = alert2.getText();
		assertEquals(message,"Customer Successfully Delete!");
		
		alert2.accept();
		
		String pageURL = driver.getCurrentUrl();
		assertEquals(pageURL,"https://demo.guru99.com/test/delete_customer.php");
	}
	
	@AfterMethod
	public void closeBrower()
	{
		driver.close();
	}
}
