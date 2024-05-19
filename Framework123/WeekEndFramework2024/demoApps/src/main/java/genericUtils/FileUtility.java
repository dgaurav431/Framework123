package genericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_December_WeekendBatch2023\\demoApps\\src\\test\\resources\\testData\\demoApps.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
	}
	
	public String fetchDataFromExcelSheet(String sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_December_WeekendBatch2023\\demoApps\\src\\test\\resources\\testData\\ExcelData.xlsx");
		
		return WorkbookFactory.create(fis).getSheet(sheetname).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}

}
