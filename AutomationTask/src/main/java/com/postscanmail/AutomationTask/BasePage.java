package com.postscanmail.AutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	protected WebDriver driver;

	// create constructor
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	protected static void clickButton(WebElement button) {
		button.click();

	}

	protected static void setElementText(WebElement elementText, String value) {
		elementText.sendKeys(value);

	}

	protected static void ClickCheckBox(WebElement checkBox) {
		checkBox.click();
	}

	protected void SelectFromCountryDDL(WebElement selectFromDDL) {
		selectFromDDL.click();

	}

}
