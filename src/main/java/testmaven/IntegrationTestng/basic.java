package testmaven.IntegrationTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basic {

	@Test
	public void hitUrl()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	
}
