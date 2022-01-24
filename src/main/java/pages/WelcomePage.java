package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage extends BasePage {

	By btn_get_started = By.xpath("//android.widget.Button[@resource-id='com.monefy.app.lite:id/buttonContinue']");
	By btn_amazing = By.xpath("//android.widget.Button[@resource-id='com.monefy.app.lite:id/buttonContinue'][contains(@text,'AMAZING')]");
	By btm_i_am_ready = By.xpath("//android.widget.Button[@resource-id='com.monefy.app.lite:id/buttonContinue'][contains(@text,'READY')]");
	By btn_close = By.id("com.monefy.app.lite:id/buttonClose");
	By welcome_page_header = By.xpath("//android.widget.TextView[@resource-id='com.monefy.app.lite:id/textViewHeader']");
	By second_pageheader = By.xpath("//android.widget.TextView[@resource-id='com.monefy.app.lite:id/textViewHeader'][contains(@text,'Control your spend and start saving')]");


	public WelcomePage (WebDriver driver) {	
		super(driver);
	}

	public void click_get_started() {

		if (isElementisible(welcome_page_header)) {
			WebElement el = driver.findElement(btn_get_started);
			el.click();
		}
	}

	public void click_amazing() {

		if (isElementisible(second_pageheader)) {
//			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(btn_amazing));
			WebElement el = driver.findElement(btn_amazing);
			el.click();
		}
	}

	public void click_i_am_ready() {
		if (isElementisible(btm_i_am_ready)) {
			WebElement el = driver.findElement(btm_i_am_ready);
			el.click();
		}
	}

	public void click_close() {
		if (isElementisible(btn_close)) {
			WebElement el = driver.findElement(btn_close);
			el.click();
		}
	}

}
