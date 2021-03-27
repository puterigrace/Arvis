package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddToCart;
import pageObjects.Checkout;
import pageObjects.Login;
import pageObjects.Payment;

public class ArvisGlue {
	private static WebDriver driver;
	
	@Given("User is login page")
	public void user_is_login_page() {
		System.setProperty("webdriver.chrome.driver","src//test//webdriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		Login login = new Login(driver);
		login.clickMenuLogin();
	}

	@When("User input username password")
	public void user_input_username_password() {
		Login login = new Login(driver);
		login.inputLoginForm();
	}

	@When("Click login button")
	public void click_login_button() {
		Login login = new Login(driver);
		login.clickLogin();
	}

	@Then("User successfully login")
	public void user_successfully_login() {
		Login login = new Login(driver);
		login.verifyLogin();
	}

	@Given("User is on site")
	public void user_is_on_site() {
	    AddToCart ac = new AddToCart(driver);
	    ac.clickMenuShirt();
	}

	@When("User choosing item category")
	public void user_choosing_item_category() {
		AddToCart ac = new AddToCart(driver);
		ac.chooseShirt();
		
	}

	@When("Click add to cart button")
	public void click_add_to_cart_button() {
		AddToCart ac = new AddToCart(driver);
		ac.clickAddToCart();
	}

	@Then("Item successfully choosen")
	public void item_successfully_choosen() {
		AddToCart ac = new AddToCart(driver);
		ac.verifySuccess();
	}
	
	@Given("Item already in the cart")
	public void item_already_in_the_cart() {
		AddToCart ac = new AddToCart(driver);
		ac.verifySuccess();
	}

	@When("User click process to checkout button")
	public void user_click_process_to_checkout_button() {
	    Checkout co = new Checkout(driver);
	    co.clickProcessToCheckout();
	}

	@When("Input amount of quantity")
	public void input_amount_of_quantity() {
		Checkout co = new Checkout(driver);
		co.summary(3);
	}

	@When("User Choose address")
	public void user_Choose_address() {
		Checkout co = new Checkout(driver);
		co.address("sesuai aplikasi");
	}

	@When("Click terms checkbox")
	public void click_terms_checkbox() {
		Checkout co = new Checkout(driver);
		co.shipping();
	}

	@When("Confirm the payment")
	public void confirm_the_payment() {
	   Payment py = new Payment(driver);
	   py.choosePaymentMethod();
	}

	@Then("Order is complete")
	public void order_is_complete() {
		Payment py = new Payment(driver);
		py.verifyOderComplete();
	}
}
