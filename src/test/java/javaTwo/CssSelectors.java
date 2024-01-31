package javaTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.saucedemo.com/");
//		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input#login-button")).click();
		driver.close();
	}

}
