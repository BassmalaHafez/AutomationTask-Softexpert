package com.postscanmail.AutomationTask;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import testData.ExcelReader;

public class UserRegistrationTest extends TestBase {

	UserRegistrationPage registrationform;

	// Generate dynamic test data by using faker java library
	Faker fakeData = new Faker();

	// Read data from excel sheet
	@DataProvider(name = "ExcelData")
	public Object[][] getUserRegistrationData() throws IOException {
		ExcelReader er = new ExcelReader();
		return er.getExcelData();
	}

	@Test(priority = 1)
	public void UserCanRegisterSuccssfully() throws IOException {

		String firstname = fakeData.name().firstName();
		String lastname = fakeData.name().lastName();
		String phone = fakeData.phoneNumber().cellPhone();

		Object[][] sheet = getUserRegistrationData();

		String email = (String) sheet[0][0];
		String password = (String) sheet[0][1];
		String passwordConfirmation = (String) sheet[0][2];

		registrationform = new UserRegistrationPage(driver);

		registrationform.registerUser(firstname, lastname, phone, email, password, passwordConfirmation);

	}

}
