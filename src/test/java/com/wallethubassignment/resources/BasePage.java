package com.wallethubassignment.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	protected static WebDriver driver;
	static String driverPath = " ";

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static WebElement find(String ele1, String locator) {
		String loc = ele1;
		By b = null;
		if (loc.equals("id")) {
			b = By.id(locator);
		}
		if (loc.equals("xpath")) {
			b = By.xpath(locator);
		}
		if (loc.equals("cssSelector")) {
			b = By.cssSelector(locator);
		}
		return driver.findElement(b);

	}

	public static void closeBrowser() {
		driver.close();
	}

}
