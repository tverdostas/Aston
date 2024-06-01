package school.lessons.common;

import constants.Constant;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonActions {
    @Step("Настройка браузера")
    public static WebDriver createDriver() {

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

    @AfterEach
    @Step("Закрытие браузера")
    public static void closeDriver(WebDriver driver) {
        driver.quit();
    }

    @Step("Внимание: {msg}")
    public static void warn(String msg) {
        System.out.println(msg);
    }

    @Step("Сообщение: {msg}")
    public static void info(String msg) {
        System.out.println(msg);
    }
}
