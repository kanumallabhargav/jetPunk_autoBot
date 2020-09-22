package pageObjects;

public class I0_SS2_fastMathDouble_objects 
{
	private String xpathLeft = "//*[@id=\"grid\"]/table/tbody/tr/td[";
	private String xpathCenter = "]/table/tbody/tr[";
	private String xpathRight = "]/td[1]/div";
	
	public String xpathFramer(int colNumber, int rowNumber)
	{
		String xpathFinal = xpathLeft+colNumber+xpathCenter+rowNumber+xpathRight;
		return xpathFinal;
	}
	
	public int add(int input)
	{
		int output = input*2;
		return output;
	}
}
