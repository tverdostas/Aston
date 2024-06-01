package school.lessons.tests.mts;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.mts.MtsHomePage;
import school.lessons.tests.base.BaseTest;

import static constants.Constant.Urls.MTS_HOME_PAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTests extends BaseTest {

    @Test
    @Epic("UI тестирование сайта МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Услуги связи' верные без фокуса на полях")
    @Description("Позитивный кейс отображения плейсхолдеров")
    @DisplayName("Плейсхолдеры 'Услуги связи' верные")
    public void checkPlaceHolderOfPhoneNumberFieldTest() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);

        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();
        mtsHomePage.readPlaceholderPhoneNumberField();

        assertEquals(mtsHomePage.getPlaceholderPhoneNumberField(), mtsHomePage.readPlaceholderPhoneNumberField());

        mtsHomePage.readPlaceholderSumField();

        assertEquals(mtsHomePage.getPlaceholderSumField(), mtsHomePage.readPlaceholderSumField());

        mtsHomePage.readPlaceholderEmail();

        assertEquals(mtsHomePage.getPlaceholderEmailField(), mtsHomePage.readPlaceholderEmail());

    }

    @Test
    @Epic("UI тестирование сайта МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Домашний интернет' верные без фокуса на полях")
    @Description("Позитивный кейс отображения плейсхолдеров")
    @DisplayName("Плейсхолдеры 'Домашний интернет' верные")
    public void checkPlaceHolderOfHomeInternetFieldTest() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);

        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();

        mtsHomePage.openArrow();
        mtsHomePage.chooseHomeInternet();

        mtsHomePage.readPlaceholderAbonentNumber();

        assertEquals(mtsHomePage.getPlaceholderAbonentNumber(), mtsHomePage.readPlaceholderAbonentNumber());

        mtsHomePage.readPlaceholderSumField();

        assertEquals(mtsHomePage.getPlaceholderSumField(), mtsHomePage.readPlaceholderSumField());

        mtsHomePage.readPlaceholderEmail();

        assertEquals(mtsHomePage.getPlaceholderEmailField(), mtsHomePage.readPlaceholderEmail());

    }

    @Test
    @Epic("UI тестирование сайта МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Рассрочка' верные без фокуса на полях")
    @Description("Позитивный кейс отображения плейсхолдеров")
    @DisplayName("Плейсхолдеры 'Рассрочка' верные")
    public void checkPlaceHolderOfInstallmentPlanChoiceTest() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);

        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();

        mtsHomePage.openArrow();

        mtsHomePage.chooseInstallmentPlan();

        mtsHomePage.readPlaceholderAccountNumber();

        assertEquals(mtsHomePage.getPlaceholderScoreInstalmentSumField(), mtsHomePage.readPlaceholderAccountNumber());

        mtsHomePage.readPlaceholderSumField();

        assertEquals(mtsHomePage.getPlaceholderSumField(), mtsHomePage.readPlaceholderSumField());

        mtsHomePage.readPlaceholderEmail();

        assertEquals(mtsHomePage.getPlaceholderEmailField(), mtsHomePage.readPlaceholderEmail());

    }

    @Test
    @Epic("UI тестирование сайта МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Задолженность' верные без фокуса на полях")
    @Description("Позитивный кейс отображения плейсхолдеров")
    @DisplayName("Плейсхолдеры 'Задолженность' верные")
    public void checkPlaceHolderOfDebtChoiceTest() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);

        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();

        mtsHomePage.openArrow();

        mtsHomePage.chooseDebt();

        mtsHomePage.readPlaceholderAccountNumberDebt();

        assertEquals(mtsHomePage.getPlaceholderDebtSumField(), mtsHomePage.readPlaceholderAccountNumberDebt());

        mtsHomePage.readPlaceholderSumField();

        assertEquals(mtsHomePage.getPlaceholderSumField(), mtsHomePage.readPlaceholderSumField());

        mtsHomePage.readPlaceholderEmail();

        assertEquals(mtsHomePage.getPlaceholderEmailField(), mtsHomePage.readPlaceholderEmail());

    }
}