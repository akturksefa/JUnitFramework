package Ders07;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_ReadExcelPractice {

    @Test
    public void ReadExcelPractice() throws IOException {

        String excel = "src/resources/takimlar.xlsx";
        FileInputStream fis = new FileInputStream(excel);
        Workbook workbook = WorkbookFactory.create(fis);

        String takimA="";
        for (int i = 0; i <10 ; i++) {
            takimA=workbook.getSheet("sayfa1").getRow(i).getCell(1).toString();
            System.out.println(takimA);

        }
    }
}
