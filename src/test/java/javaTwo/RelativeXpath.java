package javaTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		WebElement productOne = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));		
		System.out.println(productOne);
		productOne.click();
	
		WebElement addCart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
		
		if(addCart.isDisplayed()) {
			addCart.click();
		}else {
			System.out.println("Searching for the add to cart but not found");
		}
		WebElement removeCart = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		
		if(removeCart.isDisplayed()) {
			removeCart.click();
		}else {
			System.out.println("Please add item to the cart");
		}
		driver.close();
	}

}
