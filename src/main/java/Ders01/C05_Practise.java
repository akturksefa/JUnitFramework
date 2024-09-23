package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Practise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Match");
        }
        else {
            System.out.println(driver.getTitle());
        }

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Url Match");
        }
        else {
            System.out.println(actualUrl);
        }

        driver.navigate().to("https://www.walmart.com");
         if (driver.getTitle().contains("Walmart.com")) {
             System.out.println("Title Match");
         }

         else {}

         driver.navigate().back();
         driver.navigate().refresh();
         driver.manage().window().maximize();
         driver.close();
    }
}
