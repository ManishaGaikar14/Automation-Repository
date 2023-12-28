package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataInExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//create object of fileInputStream
	FileInputStream fis = new FileInputStream("./src/main/resources/TestDate.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("IPL");
	Row row = sheet.createRow(2);
	Cell col = row.createCell(2);
	col.setCellValue("Sr.No");
	//create object of fileoutputstream
	FileOutputStream fos = new FileOutputStream("./src/main/resources/TestData.xlsx");
	wb.write(fos);
}
}
