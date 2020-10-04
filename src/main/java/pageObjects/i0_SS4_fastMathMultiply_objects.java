package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class i0_SS4_fastMathMultiply_objects 
{
	WebDriver driver;
	
	private String xpathLeft = "//*[@id='grid']/table/tbody/tr/td[";
	private String xpathCenter = "]/table/tbody/tr[";
	private String xpathRight = "]/td[1]/div";
	
	private By waitElement = By.xpath("//*[@id='grid']/table/tbody/tr/td[4]/table/tbody/tr[6]/td[1]/div");
	private ExpectedCondition<WebElement> waitLocator = ExpectedConditions.visibilityOfElementLocated(waitElement);
	
	public i0_SS4_fastMathMultiply_objects(WebDriver driver) 
	{
		this.driver = driver;
	}

	public String xpathFramer(int colNumber, int rowNumber)
	{
		String xpathFinal = xpathLeft+colNumber+xpathCenter+rowNumber+xpathRight;
		return xpathFinal;	
	}
	
	public ExpectedCondition<WebElement> getWaitLocator()
	{
		return waitLocator;
	}
}
