package school.lessons.tests.mts;


import org.junit.jupiter.api.Test;
import pages.mts.MtsHomePage;
import school.lessons.tests.base.BaseTest;

import static constants.Constant.TimeoutVariable.Urls.MTS_HOME_PAGE;

public class HomePageTests extends BaseTest {

    @Test
    public void checkPlaceHolderOfPhoneNumberFieldTest() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);

        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();
        mtsHomePage.getPlaceholderPhoneNumberField();

       // assertEquals(mtsHomePage.placeholderPhoneNumberField, mtsHomePage.getPlaceholderPhoneNumberField());
    }
}