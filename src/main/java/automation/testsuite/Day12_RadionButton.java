package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_RadionButton extends CommonBase{
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY2);
	}
	
	@Test
	public void case1_CheckDefaultValue()
	{
		WebElement rdoMale1= driver.findElement(By.xpath("//input[@name='optradio' and @value ='Male']"));
		assertFalse(rdoMale1.isSelected());
		
		WebElement rdoMale2= driver.findElement(By.xpath("//input[@name='optradio' and @value ='Female']"));
		assertFalse(rdoMale2.isSelected());
	}
	
	@Test
	public void case2_CheckRadioSuccessfully()
	{
		WebElement age0to5 = driver.findElement(By.xpath("//input[@value='0 - 5']"));
		if(age0to5.isDisplayed())
		{
			age0to5.click();
			assertTrue(age0to5.isSelected());
		}
		WebElement age5to15 = driver.findElement(By.xpath("//input[@value='5 - 15']"));
		if(age5to15.isDisplayed())
		{
			age5to15.click();
			assertTrue(age5to15.isSelected());
			assertFalse(age0to5.isSelected());
		}
		
		WebElement age15to50 = driver.findElement(By.xpath("//input[@value='15 - 50']"));
		if(age15to50.isDisplayed())
		{
			age15to50.click();
			assertTrue(age15to50.isSelected());
			assertFalse(age0to5.isSelected());
			assertFalse(age5to15.isSelected());
		}
	}
	
}
