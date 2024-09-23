package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Practise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.heroku.com/home");

        WebElement signupButton = driver.findElement(By.xpath("/html/body/div[1]/header/section/div/div/ul/li[3]/div/div[2]/div/a"));
        signupButton.click();






    }
}
