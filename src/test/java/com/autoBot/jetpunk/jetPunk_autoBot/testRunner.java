package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.commonObjects;
import utilities.Base;

public class testRunner extends Base
{
	WebDriver driver;
	
	@Test
	public void test1() throws IOException
	{
		driver = driverInitialize();
		driver.get("https://www.jetpunk.com/user-quizzes/44173/jetpunk-field-sobriety-test");
		
		commonObjects commons = new commonObjects(driver);
		commons.clickOnStartButton();
		
		
		char i;
		char j[]= new char[26];
		int checkSum=0;
		
		for (i='Z';i>='A';i--)
		{
			j[checkSum]=i;
			String x = Character.toString(j[checkSum]);
			commons.getTextAnswerBox().sendKeys(x);
			checkSum++;
		}
	}
}
