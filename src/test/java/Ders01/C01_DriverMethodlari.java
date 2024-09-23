package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        // System.out.println(driver.getPageSource());

        String actualData = driver.getPageSource();
        String expectedData = "Gateway";

        if (actualData.contains(expectedData)) {
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }

        System.out.println("Window Handle: " + driver.getWindowHandle());

        driver.close();
    }

}
