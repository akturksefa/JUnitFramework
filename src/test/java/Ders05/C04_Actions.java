package Ders05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C04_Actions extends TestBaseBeforeAfter {

    @Test
    public void actionsTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(1100);
        WebElement cizgiliAlan = driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions action = new Actions(driver);
        action.contextClick(cizgiliAlan).perform();
        String actualResult = driver.switchTo().alert().getText();
        String expectedResult = "You selected a context menu";
        Assert.assertEquals(expectedResult, actualResult);
        Thread.sleep(1100);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(0));


    }
}
