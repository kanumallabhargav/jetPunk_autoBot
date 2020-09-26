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
}