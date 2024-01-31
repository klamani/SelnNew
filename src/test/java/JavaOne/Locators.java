package JavaOne;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://phptravels.com/demo/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signup")).click();
		driver.close();
	}
}
