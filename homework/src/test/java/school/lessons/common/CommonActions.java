package school.lessons.common;

import constants.Constant;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;

public class CommonActions {
    @Step("Настройка браузера")
    public static WebDriver createDriver() {
        // Тут тоже самое, и там, дважды одно и тоже делать нельзя. Надо сделать тут и все. И возможно, вынестри
        // ChromeSettings сюда, или если там они нужны, то оставить там их
        WebDriver driver = null;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constant.TimeoutVariable.IMPLICIT_WAIT, TimeUnit.SECONDS);

        return driver;
    }

    @Step("Очистка крошек")
    public static void clearCookiesAndLocalStorage(WebDriver driver) {
        if (!driver.getCurrentUrl().equals("data:,")) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @Step("Закрытие браузера")
    public static void closeDriver(WebDriver driver) {
        driver.quit();
    }
}
