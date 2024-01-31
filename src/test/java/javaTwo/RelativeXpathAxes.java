package javaTwo;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		//input[@autocorrect='off']/parent::div
		//input[@autocorrect='off']/ancestor::form
	}

}
