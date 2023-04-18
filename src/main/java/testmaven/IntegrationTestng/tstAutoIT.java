package testmaven.IntegrationTestng;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tstAutoIT {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		
		Thread.sleep(3000L);
		Runtime.getRuntime().exec("C:\\SeleniumPrerequisite\\FileUplad.exe");
		
	}

}
