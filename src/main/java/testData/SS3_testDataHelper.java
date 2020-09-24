package testData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import resources.partialFilePaths;

public class SS3_testDataHelper 
{
	public static String getCategory() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+partialFilePaths.getSS3_testDataConfig_partialPath());
		prop.load(fis);
		String category = prop.getProperty("category");
		return category;
	}
}
