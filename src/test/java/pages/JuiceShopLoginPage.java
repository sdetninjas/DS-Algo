package pages;

import org.openqa.selenium.By;

public class JuiceShopLoginPage extends BasePage{
	private String URL=BASE_URL+"/#/login";
	private By dismissBtn=By.xpath("//button//span[text()='Dismiss']");
	private By meWantItBtn=By.xpath("//*[text()='Me want it!']");
	private By emailTxt=By.id("email");
	private By pswTxt=By.id("password");
	private By loginBtn= By.id("loginButton");
	private By errorMsg = By.xpath("//div[@class='error ng-star-inserted']");
	
	
	

	/*public JuiceShopLoginPage(String uRL, By dismissBtn, By meWantItBtn, By emailTxt, By pswTxt, By loginBtn) {
		URL = uRL;
		this.dismissBtn = dismissBtn;
		this.meWantItBtn = meWantItBtn;
		this.emailTxt = emailTxt;
		this.pswTxt = pswTxt;
		this.loginBtn = loginBtn;
	}*/
	
	@Override
	public void openPage() {
		driver.get(URL);
		driver.manage().window().maximize();
		waitFor();
		driver.findElement(dismissBtn).click();
		driver.findElement(meWantItBtn).click();  	
	}

	
	
	public void inputEmail(String emailId) {
		
		driver.findElement(emailTxt).sendKeys(emailId);
		
	}
	
	public void inputPassword(String password) {
		
		driver.findElement(pswTxt).sendKeys(password);
		
	}
	
	public void loginClick() {
		
		driver.findElement(loginBtn).click();
	}
	
	public String getErrorMsg() {
		
		
		return driver.findElement(errorMsg).getText(); 
	}
	
	
	public JuiceShopLoginPage() {
		
		
		
			
		
	}
}