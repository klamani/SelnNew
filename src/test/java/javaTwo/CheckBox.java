package javaTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//		driver.findElement(By.xpath("//input[@placeholder='Username' and @id='user-name']")).sendKeys("performance_glitch_user");
//		driver.findElement(By.xpath("//input[@id='password' or @name='password']"));
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='profession-0']"));
		
		boolean  isDisplayed = checkBox.isDisplayed();
		
		if(checkBox.isDisplayed()==true) {
			checkBox.click();
		}
		
		WebElement checkBoxElement = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isEnabled = chckBxEnable.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxElement.click();
		}
		
		/**
		* Validate Checkbox isSelected method and click
		*/

		WebElement checkBoxElement = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
		
		
	}

}
