package school.lessons.tests.mts;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.mts.MtsHomePage;
import school.lessons.tests.base.BaseTest;

import static constants.Constant.TimeoutVariable.Urls.MTS_HOME_PAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.lessons.common.CommonActions.closeDriver;

public class HomePageTests extends BaseTest {

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Услуги связи' верные")
    @Description("Плейсхолдеры 'Услуги связи' верные")
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

        closeDriver(driver);
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Домашний интернет' верные")
    @Description("Плейсхолдеры 'Домашний интернет' верные")
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

        closeDriver(driver);
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Рассрочка' верные")
    @Description("Плейсхолдеры 'Рассрочка' верные")
    @DisplayName("Плейсхолдеры 'Рассрочка' верные")
    public void checkPlaceHolderOfInstallmentPlanChoiceTest() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);

        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();

        mtsHomePage.openArrow();

        mtsHomePage.chooseInstallmentPlan();

        mtsHomePage.readPlaceholderAccountNumber();

        assertEquals(mtsHomePage.getPlaceholderAccountNumber(), mtsHomePage.readPlaceholderAccountNumber());

        mtsHomePage.readPlaceholderSumField();

        assertEquals(mtsHomePage.getPlaceholderSumField(), mtsHomePage.readPlaceholderSumField());

        mtsHomePage.readPlaceholderEmail();

        assertEquals(mtsHomePage.getPlaceholderEmailField(), mtsHomePage.readPlaceholderEmail());

        closeDriver(driver);
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Задолженность' верные")
    @Description("Плейсхолдеры 'Задолженность' верные")
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

        closeDriver(driver);
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Story("")
    @Description("")
    @DisplayName("")
    public void iFrameCheck() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);
        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();
        mtsHomePage.findPhoneNumberField();
    }
}