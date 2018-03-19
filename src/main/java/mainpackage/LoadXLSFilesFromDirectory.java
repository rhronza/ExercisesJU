package mainpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoadXLSFilesFromDirectory {

	// public String XLSFILE = "C:\\_p\\s\\Banán.xlsx";
	public String PATH = "C:\\Users\\roman\\Disk Google\\104_Srovnavač hladu\\30_Funkční specifikace\\10_PRODUCT_GROUPS\\";
	public String XLSFile = "Banán.xlsx";

	public LoadXLSFilesFromDirectory() throws EncryptedDocumentException, InvalidFormatException, IOException {

		File folder = new File(PATH);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				if (listOfFiles[i].getName().lastIndexOf(".xlsx") > -1) {
					String nameFile = listOfFiles[i].getName();
					String nameGroup = nameFile.substring(0, nameFile.lastIndexOf(".xlsx"));
					System.out.println(nameFile+","+nameGroup);
					 
					String selectStatement= showContentXLSFile(listOfFiles[i].getName()); 
					System.out.println(selectStatement+"\n");
				}

			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("NEBRAT Directory " + listOfFiles[i].getName());
			}
		}
	}

	public String showContentXLSFile(String file) throws EncryptedDocumentException, InvalidFormatException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(this.PATH + file));

		// Getting the Sheet at index zero
		Sheet sheet = workbook.getSheetAt(0);

		// Create a DataFormatter to format and get each cell's value as String
		//DataFormatter dataFormatter = new DataFormatter();

		// 1. You can obtain a rowIterator and columnIterator and iterate over them

		String urlAdress = "";
		// System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
		Iterator<Row> rowIterator = sheet.rowIterator();

		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();

			// Now let's iterate over the columns of the current row
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				//String cellValue = dataFormatter.formatCellValue(cell);
				// System.out.print(cellValue + "\t");
				urlAdress = urlAdress + cell;

			}
		}
		return urlAdress;

	}

}
