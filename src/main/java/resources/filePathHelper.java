package resources;

public class filePathHelper 
{
	public static String getSeparator()
	{
		String os = System.getProperty("os");
		String separator;
		
		if(os.equalsIgnoreCase("windows"))
				{
			separator = "\\";
			return separator;
				}
		else if(os.equalsIgnoreCase("macos"))
		{
			separator = "/";
			return separator;
		}
		else if (os.equalsIgnoreCase("linux"))
		{
			separator = "/";
			return separator;
		}
		return null;
	}
}
