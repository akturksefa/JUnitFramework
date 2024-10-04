package Ders07;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C05_WriteExcel {

    @Test
    public void testWriteExcel() throws IOException {

        String excel = "src/resources/takimlar.xlsx";
        FileInputStream fis = new FileInputStream(excel);
        Workbook workbook = WorkbookFactory.create(fis);

        workbook.getSheet("Sayfa1").getRow(0).createCell(5).setCellValue("Deneme");
        workbook.getSheet("Sayfa1").getRow(0).createCell(6).setCellValue("Girdi");

        // Dosya Kayıt
        FileOutputStream fos = new FileOutputStream(excel);
        workbook.write(fos);
        // Dosyayı Kapatma
        fos.close();
        fis.close();
        workbook.close();
    }
}
