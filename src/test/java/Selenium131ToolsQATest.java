import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

        driver.get("https://kbkronix.ru/");

        System.out.println(driver.getTitle());

        Thread.sleep(1000);

        WebElement container = driver.findElement(By.xpath("//*[@id='rec1305990721']/div[2]/div"));
        System.out.println(container.getText());
        container.click();

        WebElement catalog = driver.findElement(By.xpath("//*[@id='nav1305990721']/div/div[3]/nav/ul/li[1]/a"));
        System.out.println(catalog.getText());
        catalog.click();

        WebElement Fon = driver.findElement(By.cssSelector(
                <a class="t-btn t-btnflex t-btnflex_type_button t-btnflex_xs js-store-prod-btn t-store__card__btn" href="http://kbkronix.ru/tproduct/700392037192-fotofonar-starlight-c2"><span class="t-btnflex__text t-store__card__btn-text">Подробнее</span> <style>#rec1306356621 .t-btnflex.t-btnflex_type_button {color:#ffffff;background-color:#000000;--border-width:0px;border-style:none !important;border-radius:4px;box-shadow:none !important;transition-duration:0.2s;transition-property:background-color,color,border-color,box-shadow,opacity,transform,gap;transition-timing-function:ease-in-out;}</style></a>
                        className("t-btn t-btnflex t-btnflex_type_button t-btnflex_xs js-store-prod-btn t-store__card__btn")

                http://kbkronix.ru/tproduct/700392037192-fotofonar-starlight-c2
        document.querySelector("#rec1306356621 > div.t951 > div > div.js-store-cont-w-filter.t951__cont-w-filter.t-store__grid-cont.t-store__grid-cont_col-width_stretch.t-store__grid-cont_indent > div.t951__cont-wrapper > div.t951__grid-cont.js-store-grid-cont.t-store__grid-cont_col-width_stretch.t-store__grid-cont_indent.t-store__grid-cont_mobile-grid.t-store__mobile-two-columns.mobile-two-columns.t951__container_mobile-grid > div > div:nth-child(4) > div > div.t-store__card__btns-wrapper.js-store-buttons-wrapper > a.t-btn.t-btnflex.t-btnflex_type_button.t-btnflex_xs.js-store-prod-btn.t-store__card__btn > span")
        <span class="t-btnflex__text t-store__card__btn-text">Подробнее</span>

// работает
//        driver.get("https://kronix.tilda.ws/tproduct/700392037192-fotofonar-starlight-c2");
//
//        System.out.println(driver.getTitle());
// WebElement pointer = driver.findElement(By.xpath("//*[@id=\"rec1306389121\"]/div[1]/div[1]/div/div/div[2]/div[8]/div/form/label[4]/span"));
//        pointer.click();
//        System.out.println(pointer.getText());

        //WebElement span = driver.findElement(By.xpath("//*[@id="rec1306356621"]/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/a[1]/span"));
        //WebElement span = driver.findElement(By.cssSelector("#rec1306356621 > div.t951 > div > div.js-store-cont-w-filter.t951__cont-w-filter.t-store__grid-cont.t-store__grid-cont_col-width_stretch.t-store__grid-cont_indent > div > div.t951__grid-cont.js-store-grid-cont.t-store__grid-cont_col-width_stretch.t-store__grid-cont_indent.t-store__grid-cont_mobile-grid.t-store__mobile-two-columns.mobile-two-columns.t951__container_mobile-grid > div > div > div > div.t-store__card__btns-wrapper.js-store-buttons-wrapper > a.t-btn.t-btnflex.t-btnflex_type_button.t-btnflex_xs.js-store-prod-btn.t-store__card__btn > span"));
        // span.submit();

//        WebElement Fon4000 = driver.findElement(By.xpath("//*[@id=\"rec1306356621\"]/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[3]/div/form/label[4]/input"));
//        Fon4000.click();

//        WebElement spanCountPlus = driver.findElement(By.xpath("//*[@id=\"rec1306356621\"]/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[5]/div/div[2]/span"));
//        spanCountPlus.click();
//
//        WebElement inputCount = driver.findElement(By.xpath("//*[@id=\"rec1306356621\"]/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[5]/div/input"));
//        System.out.println(inputCount.getText());

        //        driver.get("https://demoqa.com/text-box");
//        System.out.println(driver.getTitle());
//        WebElement textBoxFullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
//        textBoxFullName.sendKeys("Selenium Ivanovsky");

//        WebElement butSubmit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        butSubmit.click();
//        Thread.sleep(3000);
//        WebElement testElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]/svg"));
//
//        testElement.click();
//        Thread.sleep(1000);
//
//        WebElement textBoxFullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
//        textBoxFullName.sendKeys("Selen Ivanov");
//        WebElement butSubmit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        butSubmit.click();
//
//        Thread.sleep(1000);
//        WebElement textBoxEnter = driver.findElement(By.xpath("//*[@id=\"name\"]"));
//        Assert.assertEquals(textBoxEnter.getText(), "Selen Ivanov");
//        System.out.println(textBoxEnter.getText());
//
        driver.quit();
    }
}
