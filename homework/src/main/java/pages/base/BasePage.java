package pages.base;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static constants.Constant.Urls.MTS_HOME_PAGE;

public abstract class BasePage<T> {
    protected WebDriver driver;

    protected String pageUrl;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыть страницу")
    public T open() {
        String url = MTS_HOME_PAGE + this.pageUrl;
        Allure.step("Открыта страница: " + url);
        driver.get(url);
        return (T) this;
    }

    @Step("Открыть сайт {url}")
    public T open(String url) {
        driver.get(url);
        return (T) this;
    }
}
