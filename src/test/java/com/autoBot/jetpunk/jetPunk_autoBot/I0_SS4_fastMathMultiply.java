package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.loginHelper;
import utilities.urlRetriever;

public class I0_SS4_fastMathMultiply extends Base
{
	WebDriver driver;
	@Test
	public void SS4_fastMathMultiply() throws IOException
	{
		driver = driverInitialize();
		driver.get(urlRetriever.getFastMathMultiply_url());
		
		loginHelper login = new loginHelper(driver);
		login.login();
		
		
	}
}
