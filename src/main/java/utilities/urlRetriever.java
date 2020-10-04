package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class urlRetriever 
{
	private static ArrayList<String> read_urlConfig() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+partialFilePaths.getUrlResourceConfig_partialPath());
		prop.load(fis);
		
		ArrayList<String> propsList = new ArrayList<String>();
		propsList.add(prop.getProperty("homePage"));
		propsList.add(prop.getProperty("fieldSobrietyTest"));
		propsList.add(prop.getProperty("fastMathDouble"));
		propsList.add(prop.getProperty("allCountries"));
		propsList.add(prop.getProperty("fastMathMultiply"));
		propsList.add(prop.getProperty("fastMathDivide"));
		propsList.add(prop.getProperty("fastMathSquareRoot"));
		propsList.add(prop.getProperty("fastMathAddition"));
		
		return propsList;
	}
	
	public static String getHomePage_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String homePage_url = retList.get(0);
		return homePage_url;
	}
	public static String getFieldSobrietyTest_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String fieldSobrietyTest_url = retList.get(1);
		return fieldSobrietyTest_url;
	}
	public static String getFastMathDouble_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String fastMathDouble_url = retList.get(2);
		return fastMathDouble_url;
	}
	public static String getAllCountries_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String allCountries_url = retList.get(3);
		return allCountries_url;
	}
	public static String getFastMathMultiply_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String fastMathMultiply_url = retList.get(4);
		return fastMathMultiply_url;
	}
	public static String getFastMathDivide_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String fastMathDivide_url = retList.get(5);
		return fastMathDivide_url;
	}
	public static String getFastMathSquareRoot_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String fastMathSquareRoot_url = retList.get(6);
		return fastMathSquareRoot_url;
	}
	public static String getFastMathAdd_url() throws IOException
	{
		ArrayList<String> retList = read_urlConfig();
		String fastMathAdd_url = retList.get(7);
		return fastMathAdd_url;
	}
}
