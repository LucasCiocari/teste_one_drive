package pucrs.com.live.onedrive;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneDriveTest {
	private WebDriver driver;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Before
	public void setupTest() {
		driver = new ChromeDriver();

		String initialPage = "https://www.americanas.com.br";
		driver.get(initialPage);
	}

	@After
	public void teardown() {
		if (driver != null)
			driver.close();
	}

	// TODO: change name of method

	@Test
	public void ChangeName() {
		
		
		WebElement login_box = driver.findElement(By.xpath("//*[@id=\"h_search=input\"]"));
	}
}
