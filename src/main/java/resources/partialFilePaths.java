package resources;

public class partialFilePaths 
{
	private static String countriesAndCapitals_partialPath = "/src/main/java/excelFiles/countriesAndCapitals.xlsx";
	private static String urlResourceConfig_partialPath = "/src/main/java/config/urlResourceConfig.properties";
	private static String loginConfig_partialPath = "/src/main/java/config/loginConfig.properties";
	private static String browserConfig_partialPath = "/src/main/java/config/browserConfig.properties";
	private static String chromeDriver_partialPath = "/src/main/java/drivers/chromedriver";
	private static String geckoDriver_partialPath = "/src/main/java/drivers/geckodriver";
	private static String SS3_testDataConfig_partialPath = "/src/main/java/config/SS3_testDataConfig.properties";
	
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
