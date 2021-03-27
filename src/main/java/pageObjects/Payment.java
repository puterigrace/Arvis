package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {
	WebDriver driver;
	
	public Payment(WebDriver driver) {
		this.driver = driver;
	}
	
	By span_paymentMethod = By.xpath("//p[@class='payment_module']//a[@title='Pay by bank wire']/span");
	By span_confirmMyOder = By.xpath("//p[@id='cart_navigation']//button[contains(@class,'button-medium')]/span");
	By p_orderComplete = By.xpath("//div[@class='box']//p[@class='cheque-indent']");
	
	public void choosePaymentMethod() {
		driver.findElement(span_paymentMethod).click();
		driver.findElement(span_confirmMyOder).click();
	}
	
	public void verifyOderComplete() {
		if(driver.findElement(p_orderComplete).getText().equalsIgnoreCase("Your order on My Store is complete.")) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}
}
