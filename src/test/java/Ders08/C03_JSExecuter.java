package Ders08;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C03_JSExecuter extends TestBaseBeforeAfter {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();

        WebElement kariyerButon = driver.findElement(By.xpath("//*[text()='Kariyer']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", kariyerButon);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", kariyerButon);
    }


}
