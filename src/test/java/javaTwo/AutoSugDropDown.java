package javaTwo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugDropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
		
		Thread.sleep(10000);
		
		List<WebElement> searchList = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println(searchList.size());
		
		for(int i = 0;i<searchList.size();i++) {
			
			String listName = searchList.get(i).getText();
			System.out.println("Totale number of search list are " + listName);
			if(listName.equalsIgnoreCase("JavaScript")) {
				searchList.get(i).click();
				break;
			}
		}
		driver.close();
	}
}
