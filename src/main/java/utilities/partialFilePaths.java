package utilities;

import resources.filePathHelper;

public class partialFilePaths 
{
	private static String separator  = filePathHelper.getSeparator();
	private static String srcMainJava = separator+"src"+separator+"main"+separator+"java";
	private static String countriesAndCapitals_partialPath = srcMainJava+separator+"excelFiles"+separator+"countriesAndCapitals.xlsx";
	private static String urlResourceConfig_partialPath = srcMainJava+separator+"config"+separator+"urlResourceConfig.properties";
	private static String loginConfig_partialPath = srcMainJava+separator+"config"+separator+"loginConfig.properties";
	private static String browserConfig_partialPath = srcMainJava+separator+"config"+separator+"browserConfig.properties";
	private static String chromeDriver_partialPath = srcMainJava+separator+"drivers"+separator+"chromedriver";
	private static String geckoDriver_partialPath = srcMainJava+separator+"drivers"+separator+"geckodriver";
	private static String SS3_testDataConfig_partialPath = srcMainJava+separator+"config"+separator+"SS3_testDataConfig.properties";
	
	public static String getcountriesAndCapitals_partialPath()
	{
		return countriesAndCapitals_partialPath;
	}
	public static String getUrlResourceConfig_partialPath()
	{
		return urlResourceConfig_partialPath;
	}
	public static String getLoginConfig_partialPath()
	{
		return loginConfig_partialPath;
	}
	public static String getBrowserConfig_partialPath()
	{
		return browserConfig_partialPath;
	}
	public static String getChromeDriver_partialPath()
	{
		return chromeDriver_partialPath;
	}
	public static String getGeckoDriver_partialPath()
	{
		return geckoDriver_partialPath;
	}
	public static String getSS3_testDataConfig_partialPath()
	{
		return SS3_testDataConfig_partialPath;
	}
}
