package moneyfyTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.PropertUtil;
import io.appium.java_client.android.AndroidDriver;

public class TestRandom {
	
	static String test = "Deposits: 2850.12 added";
	
	public static void main (String []args) throws ParseException {
		
		String[] liststr = test.split(" ");
		
//		Number num = NumberFormat.getCurrencyInstance(Locale.US).parse(liststr[1]);
//		System.out.println(num);
		
		Double a = Double.valueOf(liststr[1]);
		System.out.println(a);
		
		
	}

}
