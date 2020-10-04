package com.autoBot.jetpunk.jetPunk_autoBot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.commonObjects;
import utilities.Base;

public class testRunner extends Base
{
	//WebDriver driver;
	
	@Test
	public void test1() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jetpunk.com/quizzes/fast-math-multiplication-quiz");
		
		//commonObjects commons = new commonObjects(driver);
		//commons.clickOnStartButton();
		
		/*
		char i;
		char j[]= new char[26];
		int checkSum=0;
		
		for (i='Z';i>='A';i--)
		{
			j[checkSum]=i;
			String x = Character.toString(j[checkSum]);
			commons.getTextAnswerBox().sendKeys(x);
			checkSum++;
		}*/
		Thread.sleep(2000);
		String rawValue = driver.findElement(By.xpath("//*[@id='grid']/table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]/div")).getText();
		System.out.println(rawValue);
		
		
		String[] array = rawValue.split("x");
		String rawFirstNumber = array[0];
		String rawSecondNumber = array[1];
		String firstNumber = rawFirstNumber.trim();
		String secondNumber = rawSecondNumber.trim();
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		int first = Integer.parseInt(firstNumber);
		int second = Integer.parseInt(secondNumber);
		
		int finalValue = first*second;
		
		System.out.println("The multiplication result is: "+finalValue);
		
		
		
	}
}
