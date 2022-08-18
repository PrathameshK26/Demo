package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5GetCellSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\Software testing\\parameterization.xlsx");
		short CellSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(CellSize);// cell size not counted in index
		
	}
}
