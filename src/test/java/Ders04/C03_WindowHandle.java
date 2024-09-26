package Ders04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C03_WindowHandle {

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

        driver.get("https://the-internet.herokuapp.com/windows");
        String heroWindowHandle = driver.getWindowHandle();
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("The Internet"));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        for (String windowHandle : windowsList) {
            System.out.println(windowHandle);
        }
        driver.switchTo().window(windowsList.get(1));
        Thread.sleep(2000);

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/h3")).getText().contains("New Window"));
        driver.switchTo().window(windowsList.get(0));
        Assert.assertTrue(driver.getTitle().contains("The Internet"));


    }
}

