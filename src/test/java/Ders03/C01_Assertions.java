package Ders03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertions {

    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"sp-cc-rejectall-link\"]"));
        cookies.click();
    }

    @After

    public void tearDown() {
        // driver.quit();
    }

    @Test
    public void test() {

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "amazon";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @Test
    public void test2() {

        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        Assert.assertFalse(actualTitle.contains(expectedTitle));
    }

    @Test
    public void test3() {
        WebElement amazonSymbol = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
        Assert.assertTrue(amazonSymbol.isDisplayed());

    }

}
