package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.JuiceShopLoginPage;

public class JuiceShop_BDD {
	
	
	
	JuiceShopLoginPage juiceShop = new JuiceShopLoginPage();


	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {
		
		
		juiceShop.openPage();
		
	}

	@When("User login into application email {string} and Password {string}")
	public void user_login_into_application_and1_password(String string, String string2) {
		

		
		juiceShop.inputEmail("febi@gmail.com");
		juiceShop.inputPassword("febi");
		    
	}

	@When("User clicks login Button")
	public void user_clicks_login_button() {
		
		
		juiceShop.loginClick();
		
	}

	@Then("Products page is Populated")
	public void products_page_is_populated() {
		
		
	   
	}


	@Then("Error message is Populated")
	public void error_message_is_populated() {
	    if(!juiceShop.getErrorMsg().equals("Invalid email or password.") ){
	    	throw new RuntimeException();
	    }
	   
	}
	

}
