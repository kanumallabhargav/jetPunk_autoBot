package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.commonObjects;
import pageObjects.i0_SS4_fastMathMultiply_objects;
import utilities.Base;
import utilities.loginHelper;
import utilities.urlRetriever;

public class I0_SS4_fastMathMultiply extends Base
{
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void SS4_fastMathMultiply() throws IOException
	{
		//Get browser and URL
		driver = driverInitialize();
		driver.get(urlRetriever.getFastMathMultiply_url());

		//Login
		loginHelper login = new loginHelper(driver);
		login.login();

		commonObjects commons = new commonObjects(driver);
		commons.clickOnStartButton();

		i0_SS4_fastMathMultiply_objects pageObjects = new i0_SS4_fastMathMultiply_objects(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(pageObjects.getWaitLocator());

		for (int colNumber=1;colNumber<=4;colNumber++)
		{
			for (int rowNumber=2;rowNumber<=6;rowNumber++)
			{
				//Get text as a string
				String rawValue = driver.findElement(By.xpath(pageObjects.xpathFramer(colNumber, rowNumber))).getText();
				String[] array = rawValue.split("x");
				String rawFirstNumberString = array[0];
				String rawSecondNumberString = array[1];
				String firstNumberString = rawFirstNumberString.trim();
				String secondNumberString = rawSecondNumberString.trim();

				//Convert string to integer
				int firstNumber = Integer.parseInt(firstNumberString);
				int secondNumber = Integer.parseInt(secondNumberString);
				int finalValue = firstNumber*secondNumber;

				//Convert integer to character sequence
				String outputString = String.valueOf(finalValue);
				commons.getTextAnswerBox().sendKeys(outputString);
			}
		}	

	}
}
