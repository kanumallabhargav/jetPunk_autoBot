package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.I0_SS2_fastMathDouble_objects;
import pageObjects.commonObjects;
import resources.urlRetriever;
import utilities.Base;
import utilities.loginHelper;

public class I0_SS2_fastMathDouble extends Base
{
	WebDriver driver;
	
	@Test
	public void SS2_fastMathDouble() throws IOException
	{
		driver = driverInitialize();
		driver.get(urlRetriever.getFastMathDouble_url());
		
		//login
		loginHelper login = new loginHelper(driver);
		login.login();
		
		commonObjects commons = new commonObjects(driver);
		commons.clickOnStartButton();
		
		I0_SS2_fastMathDouble_objects fastMathObjects = new I0_SS2_fastMathDouble_objects();
		
		for (int colNumber=1;colNumber<=4;colNumber++)
		{
			for (int rowNumber=2;rowNumber<=6;rowNumber++)
			{
				WebElement table = driver.findElement(By.xpath(fastMathObjects.xpathFramer(colNumber, rowNumber)));
				String inputString = table.getText();
				int input = Integer.parseInt(inputString);
				int output = fastMathObjects.add(input);
				String outputString = String.valueOf(output);
				commons.getTextAnswerBox().sendKeys(outputString);
			}
		}	
	}
}
