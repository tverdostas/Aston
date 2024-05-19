import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTests {

    static WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
        driver.get("https://www.mts.by/");

        WebElement cookieAgree = driver.findElement(By.id("cookie-agree"));
        cookieAgree.click();
    }

    @Test
    @Description("Заголовок блока верный")
    public void titleCheckTest() {
        WebElement blockTitle = driver.findElement(By.xpath("//*[contains(text(), 'Онлайн пополнение')]"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        assertEquals(blockTitle.getText(), expectedTitle);
    }

    @Test
    @Description("Логотипы платежных систем отображаются")
    public void logosCheckTest() {
        WebElement paymentPartnersBlock = driver.findElement(By.xpath("//div[contains(@class, 'pay__partners')]"));
        assertTrue(paymentPartnersBlock.isDisplayed()); // блок вообще отображается, далее все лого отдельно

        WebElement visaLogo = paymentPartnersBlock.findElement(By.xpath("//img[@alt='Visa']"));
        assertTrue(visaLogo.isDisplayed());

        WebElement verifiedByVisaLogo = paymentPartnersBlock.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        assertTrue(verifiedByVisaLogo.isDisplayed());

        WebElement mastercardLogo = paymentPartnersBlock.findElement(By.xpath("//img[@alt='MasterCard']"));
        assertTrue(mastercardLogo.isDisplayed());

        WebElement mastercardSecureCodeLogo = paymentPartnersBlock.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        assertTrue(mastercardSecureCodeLogo.isDisplayed());

        WebElement maestroLogo = paymentPartnersBlock.findElement(By.xpath("//img[@alt='Белкарт']"));
        assertTrue(maestroLogo.isDisplayed());
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
