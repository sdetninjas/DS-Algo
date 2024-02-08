package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	protected static WebDriver driver = new ChromeDriver();
	protected String BASE_URL="https://juice-shop.herokuapp.com";
	
	
	public void openPage() {
		driver.get(BASE_URL);
		
	}
	
	protected void waitFor() {
		waitFor(1000);
		
	}
	
	protected void waitFor(long milliseconds ) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
