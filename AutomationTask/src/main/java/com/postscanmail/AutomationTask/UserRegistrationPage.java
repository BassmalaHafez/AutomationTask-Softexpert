package com.postscanmail.AutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends BasePage {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
		

	}

	@FindBy(id = "first_name")
	WebElement firstNametxt;

	@FindBy(id = "last_name")
	WebElement lastNametxt;

	@FindBy(id = "email")
	WebElement emailbox;

	@FindBy(id = "phone")
	WebElement phoneNumber;

	@FindBy(id = "password")
	WebElement enterpassword;

	@FindBy(id = "confirm_password")
	WebElement confirmPass;

	@FindBy(id = "business_name")
	WebElement addCompany;

	@FindBy(className = "plans-expander")
	WebElement changePlan;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-registration/div[2]/div[1]/div[2]/div[1]/app-create-account/form/div[1]/div[5]/div[3]")
	WebElement standardPlan;
	
	@FindBy(xpath = "//label[@class='checkbox ng-tns-c50-4']/i[@class='ng-tns-c50-4']")
	WebElement checkTermsAndConditions;
	
	@FindBy(xpath = " /html//app-root[@class='ng-tns-c16-0']/div/div/app-registration//app-create-account/form//button[@type='submit']")
	WebElement nextButton;
	
	@FindBy(css = "[title='United States'] > .truncate")
	WebElement openDDL;
	
	@FindBy(id="dropdown-item-1-64")
	WebElement selectEgypt;
	
	@FindBy(id = "address1")
	WebElement addAdress;
	
	@FindBy(id = "city")
	WebElement addCity ;
	
	@FindBy(css = "By.cssSelector(\".us-citizen > div:nth-of-type(3) > .radio > i\")")
	WebElement USSocialSecurityNumber;
	
	@FindBy(id = "card_number")
	WebElement addCardNum ;
	
	@FindBy(xpath = "//span[@class='truncate ng-tns-c52-19']")
	WebElement selectMonth ;
	
	@FindBy(xpath = "//div[.='February']")
	WebElement selectFab ;
	
	@FindBy(xpath = "//span[@class='truncate ng-tns-c52-20']")
	WebElement selectYear ;
	
	@FindBy(css = "[title='2023'] > .truncate")
	WebElement select2023 ;
	
	@FindBy(id = "security_code")
	WebElement addSecurityCode ;
	
	@FindBy(css = "\"button:nth-of-type(2)\"")
	WebElement placeOrderBtn ;
	
	@FindBy(xpath = "//button[@class='btn-blue ng-tns-c54-6']")
	WebElement GotoMailBox ;
	

	public void registerUser(String firstName, String lastName, String phone, String email, String password,
			String passConfirmation) {

		setElementText(firstNametxt, firstName);
		setElementText(lastNametxt, lastName);
		setElementText(phoneNumber, phone);
		setElementText(emailbox, email);
		setElementText(enterpassword, password);
		setElementText(confirmPass, passConfirmation);
		setElementText(addCompany, "SoftExpert");
		clickButton(changePlan);
		ClickCheckBox(standardPlan);
		ClickCheckBox(checkTermsAndConditions);
		clickButton(nextButton);
		openDDL.click();
		selectEgypt.click();
		setElementText(addAdress, "laurent,Alex");
		setElementText(addCity, "Alexandria");
		ClickCheckBox(USSocialSecurityNumber);
		setElementText(addCardNum,  "4000000000002024");
		selectMonth.click();
		selectFab.click();
		select2023.click();
		setElementText(addSecurityCode, "234");
		placeOrderBtn.click();
		GotoMailBox.click();

	}
}
