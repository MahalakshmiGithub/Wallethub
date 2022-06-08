package com.wallethubassignment.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethubassignment.resources.BasePage;

public class SelectPageLocators extends BasePage {
	public SelectPageLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//div/span[@class='dropdown-placeholder'])[2]")
	private WebElement dropdownSelect;

	@FindBy(xpath = "//li[text()='Health Insurance']")
	private WebElement selectHealthInsurance;

	@FindBy(xpath = "//textarea[@placeholder='Write your review...']")
	private WebElement selectTextbox;

	@FindBy(xpath = "//sub-navigation/div/div[text()=' Submit ']")
	private WebElement submit;

	public WebElement getDropdownSelect() {
		return dropdownSelect;
	}

	public WebElement getSelectHealthInsurance() {
		return selectHealthInsurance;
	}

	public WebElement getSelectTextbox() {
		return selectTextbox;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
