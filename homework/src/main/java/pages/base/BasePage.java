package pages.base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыть сайт {url}")
    public void open(String url) {
        driver.get(url);
    }

/*    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }*/
}
