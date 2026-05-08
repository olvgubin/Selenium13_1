import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class Selenium131ToolsQATest {
    @Test
    public void testQATest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
                driver.get("https://kbkronix.ru/");

                System.out.println(driver.getTitle());

                Thread.sleep(1000);

                WebElement container = driver.findElement(By.xpath("//*[@id='rec1305990721']/div[2]/div"));
                System.out.println(container.getText());
                container.click();

                WebElement catalog = driver.findElement(By.xpath("//*[@id='nav1305990721']/div/div[3]/nav/ul/li[1]/a"));
                System.out.println(catalog.getText());
                catalog.click();
            }
        finally {
            driver.quit();
        }
    }
}
