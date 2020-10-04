package pageObjects;

public class i0_SS4_fastMathMultiply_opbects 
{
	private String xpathLeft = "//*[@id='grid']/table/tbody/tr/td[";
	private String xpathCenter = "]/table/tbody/tr[";
	private String xpathRight = "]/td[1]/div";
	
	public String xpathFramer(int colNumber, int rowNumber)
	{
		String xpathFinal = xpathLeft+colNumber+xpathCenter+rowNumber+xpathRight;
		return xpathFinal;
	}
}
