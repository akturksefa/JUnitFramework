package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com.tr");

        WebElement cerezButonu = driver.findElement(By.id("sp-cc-accept"));
        cerezButonu.click();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys("notebook");
        // searchBox.sendKeys("notebook" + Keys.Enter);
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        //Amazon sayfasindaki taglari a olanlarinin sayisini yazdir
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println(tag.size());

        driver.quit();




    }
}
