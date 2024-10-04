package Ders08;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;

public class C02_GetScreenShotWE extends TestBaseBeforeAfter {

    @Test
    public void test() throws IOException {

        driver.get("https://www.amazon.com.tr");
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);

        WebElement aramaSonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));

        File aramaSonucu1 = aramaSonucu.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(aramaSonucu1,new File("target/WEScreenshot/WESS"+tarih+".jpeg"));

    }
}
