package Ders06;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseBeforeAfter;

public class C02_FileExistDownload extends TestBaseBeforeAfter {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//*[text()='sample.pdf']"));
        Thread.sleep(1500);


    }
}
