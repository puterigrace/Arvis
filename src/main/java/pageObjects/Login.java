package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	By menu_login = By.xpath("//a[@class='login']");
	By input_username = By.xpath("//input[@id='email']");
	By input_password = By.xpath("//input[@id='passwd']");
	By button_login = By.xpath("//button[@id='SubmitLogin']");
	By p_infoAccount = By.xpath("//p[@class='info-account']");
	
	public void clickMenuLogin() {
		driver.findElement(menu_login).click();
	}
	
	public void inputUsername(String username) {
		driver.findElement(input_username).sendKeys(username);
	}
	
	public void inputPassword(String password) {
		driver.findElement(input_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(button_login).click();
	}
	
	public void inputLoginForm() {
		inputUsername("pupu16@gmail.com");
		inputPassword("M4has!swa");
	}
	
	public void verifyLogin() {
		driver.findElement(p_infoAccount).isDisplayed();
	}
}
