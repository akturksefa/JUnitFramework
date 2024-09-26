package Ders04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WindowHandlePractice {

    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() {
        // driver.quit();
    }

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.amazon.com.tr");
        String amazonHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String bestBuy = driver.getWindowHandle();
        Assert.assertTrue(driver.getTitle().contains("Best Buy"));
        Thread.sleep(2000);
        driver.switchTo().window(amazonHandle);
        WebElement searchBox =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("java", Keys.ENTER);
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getText().contains("java"));
        driver.switchTo().window(bestBuy);







    }
}
