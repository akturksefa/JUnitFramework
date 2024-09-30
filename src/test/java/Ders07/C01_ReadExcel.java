package Ders07;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void testReadExcel() throws IOException {

        String excel = "src/resources/takimlar.xlsx";

        FileInputStream fis = new FileInputStream(excel);

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheet("Sayfa1");

        Row row = sheet.getRow(3);

        Cell cell = row.getCell(2);

        String actualData = cell.toString();

        String expecteddata = "Norvec";

        Assert.assertEquals(expecteddata, actualData);

        System.out.println(actualData);




    }
}
