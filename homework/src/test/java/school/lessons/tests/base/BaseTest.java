package school.lessons.tests.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import school.lessons.common.CommonActions;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = CommonActions.createDriver();

        if (CLEAR_COOKIES_AND_STORAGE) {
            CommonActions.clearCookiesAndLocalStorage(driver);
        }
    }

    @AfterEach
    public void afterEac(){
        if (!HOLD_BROWSER_OPEN){
            CommonActions.closeDriver(driver);
        }
    }
}
