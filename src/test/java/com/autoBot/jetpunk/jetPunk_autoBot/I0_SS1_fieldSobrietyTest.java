package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.commonObjects;
import utilities.Base;
import utilities.loginHelper;
import utilities.urlRetriever;

public class I0_SS1_fieldSobrietyTest extends Base
{
	WebDriver driver;
	
	@Test
	public void SS1_fieldSobrietyTest() throws IOException
	{
		driver = driverInitialize();
		driver.get(urlRetriever.getFieldSobrietyTest_url());
		
		loginHelper login = new loginHelper(driver);
		login.login();
		
		commonObjects commons = new commonObjects(driver);
		commons.clickOnStartButton();
		
		char alphabet[]= new char[26];
		int checkSum=0;
		
		for (char letter='Z';letter>='A';letter--)
		{
			alphabet[checkSum]=letter;
			String stub = Character.toString(alphabet[checkSum]);
			commons.getTextAnswerBox().sendKeys(stub);
			checkSum++;
		}
	}
}
