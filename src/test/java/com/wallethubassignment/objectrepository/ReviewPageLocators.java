package com.wallethubassignment.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethubassignment.resources.BasePage;

public class ReviewPageLocators extends BasePage {
	public ReviewPageLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//span[text()='Reviews'])[1]")
	private WebElement reviewButton;
	@FindBy(xpath = "//div/h3[text()=\"What's Your Rating?\"]")
	private WebElement reviewText;
	@FindBy(xpath = "(//div/review-star/div[@class='rating-box-wrapper']/*[name()='svg']/*[name()='g']/*[name()='path']) [24]")
	private WebElement selectingFourthStar;

	public WebElement getReviewButton() {
		return reviewButton;
	}

	public WebElement getReviewText() {
		return reviewText;
	}

	public WebElement getSelectingFourthStar() {
		return selectingFourthStar;
	}

}
