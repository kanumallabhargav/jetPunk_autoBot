package utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testData.loginData;

public class loginHelper
{
	WebDriver driver;

	private By loginButton = By.xpath("//*[@id=\"inner-page\"]/div[1]/div/div[4]/div[1]/a");
	private By userNameBox = By.xpath("//*[@id=\"login-modal\"]/div/div[2]/div[1]/input");
	private By passwordBox = By.xpath("//*[@id=\"login-modal\"]/div/div[2]/div[2]/input");
	private By submitButton = By.xpath("//*[@id=\"login-modal\"]/div/div[2]/div[3]/button");
	private By closeMark = By.xpath("/html/body/div/div/div[6]/div[2]/div/div[1]/div[2]/span");

	public loginHelper(WebDriver driver) 
	{
		this.driver = driver;
	}

	@SuppressWarnings("deprecation")
	public void login() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.findElement(loginButton).click();
		driver.findElement(userNameBox).sendKeys(loginData.getID());
		driver.findElement(passwordBox).sendKeys(loginData.getPassword());
		driver.findElement(submitButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(closeMark));
		
		driver.findElement(closeMark).click();
	}
}
