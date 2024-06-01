package pages.base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыть сайт {url}")
    public void open(String url) {
        driver.get(url);
    }
}
