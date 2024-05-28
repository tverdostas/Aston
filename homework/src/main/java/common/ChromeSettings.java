package common;

import io.qameta.allure.Step;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeSettings {
    public static WebDriver driver;

    // Отсюда это лучше убрать
    @Before("")
    @Step("Настройка браузера")
    void BeforeEach() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.get("https://www.mts.by/");

        WebElement cookieAgree = driver.findElement(By.id("cookie-agree"));
        cookieAgree.click();
    }
}
