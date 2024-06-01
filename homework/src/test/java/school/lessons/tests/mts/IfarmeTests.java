package school.lessons.tests.mts;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.mts.IframePayment;
import pages.mts.MtsHomePage;
import school.lessons.tests.base.BaseTest;

import static constants.Constant.TimeoutVariable.Urls.MTS_HOME_PAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfarmeTests extends BaseTest {
    @Test
    @Epic("UI тестирование сайта МТС")
    @Feature("Окно 'Онлайн пополнение без комиссии'")
    @Story("Плейсхолдеры и данные, введенные в окне на главной странице верные")
    @Description("Позитивный кейс отображения плейсхолдеров, суммы оплаты и номера телефона")
    @DisplayName("Плейсхолдеры, номер телефона и сумма оплаты в окне верные")
    public void iFrameCheck() {
        MtsHomePage mtsHomePage = new MtsHomePage(driver);
        mtsHomePage.open(MTS_HOME_PAGE);
        mtsHomePage.clickCookieAgree();
        mtsHomePage.findPhoneNumberField();
        mtsHomePage.fillPhoneNumberField("297777777");
        mtsHomePage.fillSumPaymentField("100");
        mtsHomePage.clickContinueButton();

        mtsHomePage.moveToFrame();

        IframePayment iframePayment = new IframePayment(driver);
        iframePayment.sumInFrameHeaderIsDisplayed();
        iframePayment.sumInFrameButtonIsDisplayed();
        iframePayment.phoneNumberHeaderIsDisplayed();
        iframePayment.iconsContainerIsDisplayed();

        assertEquals(iframePayment.getCardNumberFrameTextExpected(), iframePayment.readPlaceholderCardNumber());
        assertEquals(iframePayment.getValidityOfCardExpected(), iframePayment.readPlaceholdervalidityOfCard());
        assertEquals(iframePayment.getCvcOfCardExpected(), iframePayment.readPlaceholderCvcOfCard());
        assertEquals(iframePayment.getCardholderNameOwnerExpected(), iframePayment.readPlaceholderCardOwnerName());

    }
}
