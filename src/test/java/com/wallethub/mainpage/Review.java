package com.wallethub.mainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wallethubassignment.objectrepository.ReviewPageLocators;
import com.wallethubassignment.objectrepository.SelectPageLocators;
import com.wallethubassignment.resources.BasePage;

public class Review extends BasePage {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://wallethub.com/profile/test-insurance-company-13732055i";
		WebDriver driver = getDriver();
		loadUrl(url);
		driver.manage().window().maximize();

		// Creating obj for ReviewPageLocators to make use of the methods
		ReviewPageLocators loc = new ReviewPageLocators(driver);
		loc.getReviewButton().click();

		String str1 = loc.getReviewText().getText();
		if (str1.equals("What's Your Rating?")) {

			WebElement ele = loc.getSelectingFourthStar();

			// Checking whether the element is enabled
			if (ele.isEnabled() == true) {

				Actions act = new Actions(driver);
				Thread.sleep(2000);
				act.moveToElement(ele).click().perform();

			}
		} else {
			System.out.println("No such rating option present");
		}

		// Creating obj for SelectPageLocators to make use of the methods
		SelectPageLocators selLoc = new SelectPageLocators(driver);
		selLoc.getDropdownSelect().click();

		WebDriverWait selectWait = new WebDriverWait(driver, 200);
		selectWait.until(ExpectedConditions.elementToBeClickable(selLoc.getSelectHealthInsurance())).click();

		WebElement text = selLoc.getSelectTextbox();
		text.click();
		text.sendKeys(
				"The best ever insurance provided by them.The best ever insurance provided by them.The best ever insurance provided by them.The best ever insurance provided by them.The best ever insurance provided by ");

		// getting the count of text entered in textbox
		int count = selLoc.getSelectTextbox().getAttribute("value").length();

		try {
			if (count >= 200) {
				selLoc.getSubmit().submit();
			}

		} catch (Exception e) {
			String excptionMessage = e.getMessage();
			System.out.println(excptionMessage);
		}
		closeBrowser();
	}
}
