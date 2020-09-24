package excelReaders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import resources.partialFilePaths;

public class countriesReader 
{
	@SuppressWarnings("resource")
	//public static void main(String[] args) throws IOException
	public ArrayList<String> countriesAndCapitalsList(String category) throws IOException
	{
		FileInputStream countriesFile = new FileInputStream(System.getProperty("user.dir")+partialFilePaths.getcountriesAndCapitals_partialPath());
		XSSFWorkbook workbook = new XSSFWorkbook(countriesFile);
		
		int sheetCount = workbook.getNumberOfSheets();
		
		ArrayList<String> cList = new ArrayList<String>();
		
		for (int i=0;i<sheetCount;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.iterator();
				int col=0, grab=0;
				while (ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase(category))
					{
						col=grab;
					}
					grab++;
				}
				while (rows.hasNext())
				{
					Row r = rows.next();
					Cell c = r.getCell(col);
					cList.add(c.getStringCellValue());
				}
			}
		}
		return cList;
	}
}
