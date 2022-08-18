package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_getbooleanValue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\Software testing\\parameterization.xlsx");
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue();
		System.out.println(value);
	}
}
