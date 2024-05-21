import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTests {

    static WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
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

    @Test
    @Description("Ссылка «Подробнее о сервисе» работает")
    public void linkIsWorking() {
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

        link.click();

        String actualText = driver.findElement(By.xpath("//h3[contains(text(), 'Оплата банковской картой')]")).getText();
        String expectedText = "Оплата банковской картой";

        assertEquals(expectedText, actualText, "Текст не отображается корректно на странице");

        String currentUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, currentUrl, "URL не совпадает с ожидаемым");
    }

    @Test
    @Description("Ссылка «Подробнее о сервисе» работает")
    public void buttonIsWorking() {
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");

        WebElement sum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        sum.click();
        sum.sendKeys("100");

        WebElement buttonContinue = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        buttonContinue.click();

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frameElement);

        WebElement fieldTextPayment = driver.findElement(By.xpath("//span[contains(text(), 'Оплата')]"));
        assertTrue(fieldTextPayment.isDisplayed());

    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
