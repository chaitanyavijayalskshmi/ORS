package com.dyt.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	//====================Class properties=======================
			static FileInputStream inpstr = null;
			static XSSFWorkbook workbook = null;

			//===========================================================
			public static String getCellValue(String filepath, String sheetname, int rowIndex, int colIndex)
			{
				String strCellValue = null;


				try{	

					File file = new File(filepath);
					inpstr = new FileInputStream(file);
					workbook = new XSSFWorkbook(inpstr);					

					XSSFSheet worksheet = workbook.getSheet(sheetname);	
					Row row = worksheet.getRow(rowIndex);
					strCellValue = row.getCell(colIndex).getStringCellValue();										
				}				

				catch(IOException e)	{
					System.out.println("File not found or unable to read/write data..");
				}

				catch(Exception e)	{
					System.out.println(e.getMessage());
					System.out.println("unknown exception");
				}		

				return strCellValue;
			}
}
