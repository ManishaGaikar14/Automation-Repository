package dataDriverFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataInExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://127.0.0.1:81/login.do;jsessionid=aqgeh33ka601s");
		//Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		Thread.sleep(2000);
		Workbook wb = WorkbookFactory.create(fis);
		Thread.sleep(2000);
		Sheet sheet = wb.getSheet("IPL");
		Thread.sleep(2000);
		Row row = sheet.createRow(11);
		Thread.sleep(2000);
		Cell cell = row.createCell(0);
		Thread.sleep(2000);
		cell.setCellValue("pass@1234");
		Thread.sleep(2000);
		//create object of fileoutputStream
		FileOutputStream fos = new FileOutputStream("./src/main/resources/TestData.xlsx");
		wb.write(fos);
	}
}
