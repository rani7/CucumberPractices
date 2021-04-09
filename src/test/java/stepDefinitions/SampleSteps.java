package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoToCart;

public class SampleSteps {
	GoToCart goToCart;
	int billamount;
	String taxamount;
	int finalamount;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	   System.out.println("I am on home page"); 
	}

	@When("user clicks on the cart")
	public void user_clicks_on_the_cart() {
	   goToCart=new GoToCart();
	   goToCart.clickCart();
	}

	@Then("cart details open")
	public void cart_details_open() {
		System.out.println("Cart details are displayed");  
	}
	
	@When("user clicks on the cart2")
	public void user_clicks_on_the_cart2() {
		System.out.println("Cart2 is clicked");  
	}

	@Then("cart details2 open")
	public void cart_details2_open() {
		System.out.println("Cart2 details are displayed");   
	}

	@When("user clicks on the cart3")
	public void user_clicks_on_the_cart3() {
		System.out.println("Cart3 is clicked"); 
	}

	@Then("cart details3 open")
	public void cart_details3_open() {
		System.out.println("Cart3 details are displayed");  
	}
	
// int,string values in scenario 
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
		System.out.println("Billing page is displayed");     
	}

	@When("user enters bill amount {int}")
	public void user_enters_bill_amount(Integer billamount) {
	  this.billamount=billamount;  
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxamount) {
	  this.taxamount=taxamount; 
	}

	@When("user clicks on submit")
	public void user_clicks_on_submit() {
		System.out.println("Submit is clicked");   
	}

	@Then("final bill {int} is shown")
	public void final_bill_is_shown(Integer finalamount) {
	   this.finalamount=this.billamount+Integer.parseInt(this.taxamount);
	   Assert.assertTrue(this.finalamount==finalamount);
	}

}
