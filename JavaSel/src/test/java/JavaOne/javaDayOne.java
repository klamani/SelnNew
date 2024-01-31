/**
 * 
 */
/**
 * 
 */
package JavaOne;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class javaDayOne{
	
	public static void main(String[] args) {	
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.edge.com");
	//	driver.findElement(By.linkText("Stay signed out")).click();
		String titleName = driver.getTitle();
		System.out.println(titleName);
		driver.findElement(By.id("q")).sendKeys("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.className("search-btn stealth")).click();
		driver. quit();
	}
}