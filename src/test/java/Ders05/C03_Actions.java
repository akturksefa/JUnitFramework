package Ders05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C03_Actions extends TestBaseBeforeAfter {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"sp-cc-rejectall-link\"]")).click();
        Thread.sleep(1000);
        WebElement hesaplar = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        WebElement listeOlustur = driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hesaplar).click(listeOlustur).perform();
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        actions.click(searchBox).keyDown(Keys.SHIFT).sendKeys("i").keyUp(Keys.SHIFT).sendKeys("phone").sendKeys(" ").sendKeys("15").sendKeys(" ").keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("lus").sendKeys(Keys.ENTER).perform();
        String actualTitle = driver.getTitle();
        String ExpectedTitle = "Iphone 15 Plus";
        Assert.assertTrue(actualTitle.contains(ExpectedTitle));


    }
}
