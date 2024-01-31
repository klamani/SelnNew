package javaTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Select sle = new Select(driver.findElement(By.xpath("//span[@class='active_option' and text()='Name (A to Z)']")));
		sle.selectByIndex(3);
		sle.selectByValue("6");
		sle.selectByVisibleText("White");
		
		
		if(sle.isMultiple()){
			
			//Selecting multiple values by index
			sle.selectByIndex(1);
			sle.selectByIndex(2);

			//Or selecting by values
			sle.selectByValue("volvo");
			sle.selectByValue("audi");

			//Or selecting by visible text
			sle.selectByVisibleText("Volvo");
			sle.selectByVisibleText("Opel");
		}
		
		
	}

}
