package pages;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import Utils.PropertUtil;


public class BasePage {
	
	WebDriver driver;
	int timeout = 0;
	
	protected BasePage(WebDriver driver) {
		this.driver = driver;
		timeout = Integer.valueOf(PropertUtil.get("timeout"));
	}

	
	protected boolean isElementisible(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	

}
