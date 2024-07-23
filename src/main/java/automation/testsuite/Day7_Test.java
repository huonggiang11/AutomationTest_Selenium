package automation.testsuite;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day7_Test extends CommonBase{
	@BeforeMethod
	public void openBrowser() {
		System.out.println("This function to open chrome browser");
	}
	@Test
	public void TestCase_1()
	{
		System.out.println("This method to implement for testcase1");
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("This function to close chrome browser");
	}
}
