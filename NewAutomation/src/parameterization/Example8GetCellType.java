package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8GetCellType {
	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\Software testing\\parameterization.xlsx");
		CellType celltype = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getCellType();
		System.out.println(celltype);
	}
	
}
