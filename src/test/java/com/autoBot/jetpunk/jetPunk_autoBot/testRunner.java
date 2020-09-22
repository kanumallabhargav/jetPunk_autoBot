package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Base;

public class testRunner extends Base
{
	WebDriver driver;
	
	@Test
	public void test1() throws IOException
	{
		driver = driverInitialize();
		driver.get("https://www.wikipedia.org/");
	}
}
