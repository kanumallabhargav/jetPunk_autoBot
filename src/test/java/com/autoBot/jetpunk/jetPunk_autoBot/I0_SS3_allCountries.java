package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import excelReaders.countriesReader;
import pageObjects.commonObjects;
import testData.SS3_testDataHelper;
import utilities.Base;
import utilities.loginHelper;
import utilities.urlRetriever;

public class I0_SS3_allCountries extends Base
{
	WebDriver driver;

	@Test
	public void SS3_allCountries() throws IOException
	{
		driver = driverInitialize();
		driver.get(urlRetriever.getAllCountries_url());

		//login
		loginHelper login = new loginHelper(driver);
		login.login();

		commonObjects commons = new commonObjects(driver);
		commons.clickOnStartButton();

		ArrayList<String> fullCountriesList = countriesReader.countriesAndCapitalsList(SS3_testDataHelper.getCategory());
		for(int i=0;i<=fullCountriesList.size();i++)
		{
			commons.getTextAnswerBox().sendKeys(fullCountriesList.get(i));
		}
	}
}
