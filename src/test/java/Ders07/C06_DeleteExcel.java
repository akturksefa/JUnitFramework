package Ders07;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_DeleteExcel {

    @Test
    public void test() throws IOException {

        String excel = "src/resources/takimlar.xlsx";
        FileInputStream fis = new FileInputStream(excel);
        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(6);
        row.removeCell(cell);

        FileOutputStream fos = new FileOutputStream(excel);
        workbook.write(fos);


    }
}
