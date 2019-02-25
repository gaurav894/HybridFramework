package com.demo.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() {
		File src = new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getStringData(String sheetname, int row, int col) {
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(String sheetname, int row, int col) {
		return wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	}
}
