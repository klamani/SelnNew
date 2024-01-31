package javaTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelAlertsandPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");	
//		driver.findElement(By.cssSelector("button#alertButton")).click();	
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//button[@id='confirmButton' and @type='button']")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		String string=driver.switchTo().alert().getText();
		System.out.println("The alerts message is" + " " + string);
		
		driver.switchTo().alert().sendKeys("Hey i am Kiran lamani");
		driver.switchTo().alert().accept();
		driver.close();
	}

}
