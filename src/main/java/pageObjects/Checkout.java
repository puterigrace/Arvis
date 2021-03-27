package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	WebDriver driver;
	
	public Checkout(WebDriver driver) {
		this.driver = driver;
	}
	
	By span_processToCheckout = By.xpath("//div[@class='button-container']//a[@title='Proceed to checkout']/span");
	By input_quantity = By.xpath("//input[@name='quantity_1_1_0_472358']");
	By span_processToCheckoutSummary  = By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']/span");
	By textarea_comment = By.xpath("//textarea[@name='message']");
	By span_processToCheckoutAddress = By.xpath("//button[@name='processAddress']/span");
	By checkbox_terms = By.xpath("//input[@name='cgv']");
	By span_processToCheckoutShipping = By.xpath("//button[@name='processCarrier']/span");
	
	public void clickProcessToCheckout() {
		driver.findElement(span_processToCheckout).click();
	}
	
	public void summary(int quantity) {
		String qtty = String.valueOf(quantity);
		driver.findElement(input_quantity).clear();
		driver.findElement(input_quantity).sendKeys(qtty);
		driver.findElement(span_processToCheckoutSummary).click();
	}
	
	public void address(String comment) {
		driver.findElement(textarea_comment).sendKeys(comment);
		driver.findElement(span_processToCheckoutAddress).click();
	}
	
	public void shipping() {
		driver.findElement(checkbox_terms).click();
		driver.findElement(span_processToCheckoutShipping).click();;
	}
	
	
}
