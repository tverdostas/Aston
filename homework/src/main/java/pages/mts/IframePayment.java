package pages.mts;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class IframePayment extends BasePage {
    public IframePayment(WebDriver driver) {
        super(driver);
    }
    private final By sumInFrameHeader = By.xpath("//div/div/div/span[contains(text(), '100.00 BYN')]"); // можно сделать рефакторинг, чтобы сумма была переменной
    private final By sumInPaymentButtonIsDisplayed = By.xpath("//app-card-page/div/div/button[contains(text(), '100.00 BYN')]");
    private final By phoneNumberHeaderIsDisplayed = By.cssSelector(".pay-description__text");
    private final By cardNumberFrameText = By.xpath(".//*[text()='Номер карты']/..");
    private String cardNumberFrameTextExpected = "Номер карты";
    private final By validityOfCard = By.xpath(".//*[text()='Срок действия']/..");
    private String cvcOfCardExpected = "CVC";
    private String validityOfCardExpected = "Срок действия";
    private final By cvcField = By.xpath(".//*[text()='CVC']/..");
    private final By cardOwner = By.xpath(".//*[text()='Имя держателя (как на карте)']/..");
   public String cardholderNameExpected = "Имя держателя (как на карте)";

   // странный xpath оставила, т.к. не нашла "за что зацепиться"
    private final By iconsContainer = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div");
    public IframePayment sumInFrameHeaderIsDisplayed() {
        driver.findElement(sumInFrameHeader).isDisplayed();
        return this;
    }

    public IframePayment sumInFrameButtonIsDisplayed() {
        driver.findElement(sumInPaymentButtonIsDisplayed).isDisplayed();
        return this;
    }

    public IframePayment phoneNumberHeaderIsDisplayed() {
        driver.findElement(phoneNumberHeaderIsDisplayed).isDisplayed();
        return this;
    }

    public IframePayment iconsContainerIsDisplayed() {
        driver.findElement(iconsContainer).isDisplayed();
        return this;
    }

    @Step("Получение плейсхолдера поля Номер карты")
    public String readPlaceholderCardNumber() {
        String value = driver.findElement(cardNumberFrameText).getText();
        return value;
    }

    @Step("Получение плейсхолдера поля Срок действия")
    public String readPlaceholdervalidityOfCard() {
        String value = driver.findElement(validityOfCard).getText();
        return value;
    }

    @Step("Получение плейсхолдера поля CVC карты")
    public String readPlaceholderCvcOfCard() {
        String value = driver.findElement(cvcField).getText();
        return value;
    }

    @Step("Получение плейсхолдера поля CVC карты")
    public String readPlaceholderCardOwnerName() {
        String value = driver.findElement(cardOwner).getText();
        return value;
    }

    public String getCardNumberFrameTextExpected() {
        return cardNumberFrameTextExpected;
    }
    public String getValidityOfCardExpected() {
        return validityOfCardExpected;
    }
    public String getCvcOfCardExpected() {
        return cvcOfCardExpected;
    }
    public String getCardholderNameOwnerExpected() {
        return cardholderNameExpected;
    }
}
