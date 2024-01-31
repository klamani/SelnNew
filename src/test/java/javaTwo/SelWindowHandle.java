package javaTwo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelWindowHandle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> window=driver.getWindowHandles();
		
		
		//Approach one
		List<String> windowList=new ArrayList<String>(window);
		
		String windowroot = windowList.get(0);
		String windowOne = windowList.get(2);
		
		//Switch to parent tab
		driver.switchTo().window(windowroot);
		driver.findElement(By.id("tabButton")).isDisplayed();
		
		//Switch to child tab
		driver.switchTo().window(windowOne);
		System.out.println(driver.getTitle());
		
		
		//Approach two
		for(String windoww:window) {
			String title=driver.switchTo().window(windoww).getTitle();
			System.out.println(title);
			if(title.equals("DEMOQA"));
			driver.switchTo().window(windoww);
		}
		
	}

}
