package com.slokam.moodle.test.commons.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelManager {

	File file;
	FileInputStream fis = null;
	Workbook book = null;
	Sheet sheet = null;

	public ExcelManager() {
		init();
	}

	private void init() {
		file = new File("D:\\newExcel.xls");

		try {
			fis = new FileInputStream(file);
			book = new HSSFWorkbook(fis);
			sheet = book.getSheet("Bharath");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getNumberofRows() {
		return sheet.getPhysicalNumberOfRows();
	}

	public String getCellData(int rownum, int columnnum) {
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(columnnum);

		CellType type = cell.getCellTypeEnum();
		String data = "";
		switch (type) {
		case NUMERIC:
				int value = (int)cell.getNumericCellValue();
				data = String.valueOf(value);
			break;
		case STRING:
				data = cell.getStringCellValue();
			break;
		case BOOLEAN:
				data =String.valueOf(cell.getBooleanCellValue());
			break;
		case BLANK:

			break;
		default:
			break;
		}

		
		return data;
	}

	public void tearDown() {
		try {
			book.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
