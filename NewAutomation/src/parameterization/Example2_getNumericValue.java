package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_getNumericValue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\Software testing\\parameterization.xlsx");
		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value);//101.0
		
		int newvalue = (int)value;//Explicit Casting
		System.out.println(newvalue);//101
	}
}
