package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringNumericBoolean {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\Software testing\\parameterization.xlsx");
		//String stringvalue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		//System.out.println(stringvalue);
		//double numericvalue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getNumericCellValue();
		//System.out.println(numericvalue);
		
		//int value = (int)numericvalue;
		//System.out.println(value);
		 boolean tf = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(2).getBooleanCellValue();
		 System.out.println(tf);
	}
}
