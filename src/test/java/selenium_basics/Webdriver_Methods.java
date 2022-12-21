package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Webdriver_Methods extends BaseTest {

	@Test
	public static void webDriverMethods() throws IOException {

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://web.whatsapp.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());

		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File screenshotAs = screenShot.getScreenshotAs(OutputType.FILE);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();

		Files.copy(screenshotAs, new File("./screenshot/screenshot_" + dtf.format(now) + ".png"));

		driver.quit();
	}
}
