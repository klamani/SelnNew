package JavaOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class javaDayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pageTitle = driver.getTitle();
		int pageTitleLength = driver.getTitle().length();
		System.out.println("Page name is " + " " + pageTitle + "And the length of the Title is" + " " + pageTitleLength);
		
		String pageUrl = driver.getCurrentUrl();
		if(pageUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("Okey with URL");
		}else {
			System.out.println("Not okey with URl");
		}
		String pageSource = driver.getPageSource();
		int pageSourceLength = driver.getPageSource().length();
		System.out.println("Page source is " + " " + pageSource + "And the length of the Page source is" + " " + pageSourceLength);
		driver.navigate().forward();
//		driver.quit();
	}
}
