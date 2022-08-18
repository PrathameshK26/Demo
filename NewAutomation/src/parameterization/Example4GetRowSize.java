package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4GetRowSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\Software testing\\parameterization.xlsx");
	 	int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	 	System.out.println(rowsize+1);//row is counted as index-Starts from 0
	}
}
