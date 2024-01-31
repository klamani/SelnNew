package javaTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username' and @id='user-name']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@id='password' or @name='password']"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}
}
