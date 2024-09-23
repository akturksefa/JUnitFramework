package Ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(2000);
        addElement.click();
        WebElement removeElement = driver.findElement(By.xpath("//button[text()='Delete']"));
        if (removeElement.isDisplayed()) {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }
        Thread.sleep(2000);

        removeElement.click();

        WebElement addRemoveElement = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        if (addRemoveElement.isDisplayed()) {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }
        driver.close();
    }


}
