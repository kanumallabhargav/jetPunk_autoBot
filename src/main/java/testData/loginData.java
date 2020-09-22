package testData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class loginData 
{
	private static ArrayList<String> read_loginConfig() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/loginConfig.properties");
		prop.load(fis);
		
		ArrayList<String> propsList = new ArrayList<String>();
		propsList.add(prop.getProperty("jetpunkId"));
		propsList.add(prop.getProperty("jetpunkPassword"));
		
		return propsList;
	}
	
	public static String getID() throws IOException
	{
		ArrayList<String> retList = read_loginConfig();
		String userID = retList.get(0);
		return userID;
	}
	public static String getPassword() throws IOException
	{
		ArrayList<String> retList = read_loginConfig();
		String password = retList.get(1);
		return password;
	}
}
