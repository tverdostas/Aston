package school.lessons.tests.mts;


import org.junit.jupiter.api.Test;
import pages.mts.MtsHomePage;
import school.lessons.tests.base.BaseTest;

import static constants.Constant.TimeoutVariable.Urls.MTS_HOME_PAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTests extends BaseTest {

    @Test
    public void checkPlaceHolderOfPhoneNumberFieldTest() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);

        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();
        mtsHomePage.getPlaceholderPhoneNumberFieldFromPage();

        assertEquals(mtsHomePage.getPlaceholderPhoneNumberField(), mtsHomePage.getPlaceholderPhoneNumberFieldFromPage());
    }
}