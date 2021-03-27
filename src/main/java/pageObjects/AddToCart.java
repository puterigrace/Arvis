package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {
	WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	By menu_shirt = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
	By list_shirts = By.xpath("//ul[@class='product_list grid row']/li");
	By span_addToChart = By.xpath("//div[@class='button-container']//a[@title='Add to cart']/span");
	By i_iconOk = By.xpath("//i[@class='icon-ok']");
	
	public void clickMenuShirt() {
		driver.findElement(menu_shirt).click();
	}
	
	public void chooseShirt() {
		WebElement shirt = driver.findElement(list_shirts);
		Actions action = new Actions(driver);
		action.moveToElement(shirt).perform();
	}
	
	public void clickAddToCart() {
		driver.findElement(span_addToChart).click();
	}
	
	public void verifySuccess() {
		driver.findElement(i_iconOk).isDisplayed();
	}
}
