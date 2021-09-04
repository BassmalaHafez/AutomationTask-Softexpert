package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static FileInputStream fileStream = null;

	public FileInputStream getFileInputStream() {

		String FilePath = System.getProperty("user.dir") + "/src/test/java/testData/testData.xlsx";

		File Srcfile = new File(FilePath);

		try {
			fileStream = new FileInputStream(Srcfile);
		} catch (FileNotFoundException e) {
			System.err.println("Test Data file not found !! :" + e.getMessage());
			e.printStackTrace();
		}

		return fileStream;
	}

	public Object[][] getExcelData() throws IOException {
		fileStream = getFileInputStream();
		XSSFWorkbook WB = new XSSFWorkbook(getFileInputStream());
		XSSFSheet sheet = WB.getSheetAt(0);

		int TotalNumberOfRows = (sheet.getLastRowNum() + 1);
		int TotalNumberOfColumns = 3;

		String[][] ExcelData = new String[TotalNumberOfRows][TotalNumberOfColumns];

		for (int i = 0; i < TotalNumberOfRows; i++) {

			for (int j = 0; j < TotalNumberOfColumns; j++) {
				XSSFRow row = sheet.getRow(i);
				ExcelData[i][j] = row.getCell(j).toString();
			}
		}

		WB.close();
		return ExcelData;
	}

}
