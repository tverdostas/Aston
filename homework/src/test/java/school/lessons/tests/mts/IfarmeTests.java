package school.lessons.tests.mts;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.mts.IframePayment;
import pages.mts.MtsHomePage;
import school.lessons.tests.base.BaseTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.lessons.common.CommonActions.info;
import static school.lessons.common.CommonActions.warn;

public class IfarmeTests extends BaseTest {
    @Test
    @Epic("UI тестирование сайта МТС")
    @Feature("Окно 'Онлайн пополнение без комиссии'")
    @Story("Плейсхолдеры и данные, введенные в окне на главной странице верные")
    @Description("Позитивный кейс отображения плейсхолдеров, суммы оплаты и номера телефона")
    @DisplayName("Для полей Номер телефона и сумма оплаты плейсхолдеры верны")
    public void iFrameCheck() {
        info("Авторизация не нужна");
        IframePayment iframePayment = new MtsHomePage(driver)
            .open()
            .clickCookieAgree()
            .findPhoneNumberField()
            .fillPhoneNumberField("297777777")
            .fillSumPaymentField("100")
            .clickContinueButton()
            .moveToFrame()
            .sumInFrameHeaderIsDisplayed()
            .sumInFrameButtonIsDisplayed()
            .phoneNumberHeaderIsDisplayed()
            .iconsContainerIsDisplayed();

        Allure.step("Ожидание прогрузки полей окна", stepContext -> {
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(d -> iframePayment.readPlaceholderCardNumber().equals(iframePayment.getCardNumberFrameTextExpected()));
        });


        warn("На следующей строке падает, если форма не успела прогрузится");
        assertEquals(iframePayment.getCardNumberFrameTextExpected(), iframePayment.readPlaceholderCardNumber());
        assertEquals(iframePayment.getValidityOfCardExpected(), iframePayment.readPlaceholdervalidityOfCard());
        assertEquals(iframePayment.getCvcOfCardExpected(), iframePayment.readPlaceholderCvcOfCard());
        assertEquals(iframePayment.getCardholderNameOwnerExpected(), iframePayment.readPlaceholderCardOwnerName());

    }
}
