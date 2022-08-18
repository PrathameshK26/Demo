package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6Print1Row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fil = new FileInputStream("F:\\Software testing\\parameterization.xlsx");
		Sheet sh = WorkbookFactory.create(fil).getSheet("Sheet2");
		short cellsize = sh.getRow(0).getLastCellNum();
		
		for(int i=0; i<=cellsize-1;i++) {
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}
}
