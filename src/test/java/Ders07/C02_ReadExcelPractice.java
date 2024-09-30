package Ders07;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_ReadExcelPractice {

    @Test
    public void testReadExcelPractice() throws IOException {

        String excel = "src/resources/takimlar.xlsx";
        FileInputStream fis = new FileInputStream(excel);
        Workbook workbook = WorkbookFactory.create(fis);

        String actualData = workbook.getSheet("Sayfa1").getRow(8).getCell(1).toString();
        System.out.println(actualData);
    }
}
