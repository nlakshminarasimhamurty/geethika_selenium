package selenium_basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Gmail extends BaseTest {

	@Test
	public static void valid_Credentials() {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("naveen");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("naveen");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}
}
