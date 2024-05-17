package leads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class createLead {

	public static void main(String[] args) {
//		@Test
//		public void cLead() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
			
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
//		String expectedResult="View Lead | opentaps CRM";
//		String actualResult=driver.getTitle();
//		Assert.assertEquals(actualResult, expectedResult, "text matched");
////		Assert.assertNotEquals(actualResult, expectedResult, actualResult);
////		Assert.assertTrue(true);
////		Assert.assertFalse(false);
////		Assert.assertNull(actualResult);
////		Assert.assertNotNull(actualResult);
		driver.close();
	}

}
