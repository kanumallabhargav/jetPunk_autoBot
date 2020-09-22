package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonObjects 
{
	WebDriver driver;

	private By startTestButton = By.id("start-button");
	private By textAnswerBox = By.id("txt-answer-box");
	
	public commonObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void clickOnStartButton()
	{
		driver.findElement(startTestButton).click();
	}
	public WebElement getTextAnswerBox()
	{
		return driver.findElement(textAnswerBox);
	}
}
