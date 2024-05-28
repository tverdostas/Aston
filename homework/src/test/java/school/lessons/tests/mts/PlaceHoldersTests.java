package school.lessons.tests.mts;


import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static common.ChromeSettings.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaceHoldersTests {

 /*   String sumText = driver.findElement(By.cssSelector("#connection-sum")).getAttribute("placeholder");
    String sumTextExpected = "Сумма";

    String emailText = driver.findElement(By.cssSelector("#connection-email")).getAttribute("placeholder");
    String emailTextExpected = "E-mail для отправки чека";*/

    @AfterEach
    @Step("Закрытие браузера")
    void AfterEach() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Story("Плейсхолдеры 'Услуги связи' верные")
    @Description("Плейсхолдеры 'Услуги связи' верные описание")
    @DisplayName("Плейсхолдеры 'Услуги связи' верные")
    public void communicationServicesPlaceholdersTest() {

        Allure.step("Проверка номера телефона", stepContext -> {
            String phoneNumberText = driver.findElement(By.cssSelector("#connection-phone")).getAttribute("placeholder");
            String phoneNumberExpectedText = "Номер телефона";

            Allure.step("Проверка", stepContext1 -> {
                assertEquals(phoneNumberText, phoneNumberExpectedText);
            });
        });

//        assertEquals(sumText, sumTextExpected);
//        assertEquals(emailText, emailTextExpected);
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Description("Плейсхолдеры 'Домашний интернет' верные")
    public void homeInternetPlaceholdersTest() {
        Allure.step("Нажатие на кнопку ", stepContext -> {
            driver.findElement(By.cssSelector(".select__arrow")).click();
        });

        driver.findElement(By.xpath("//li/p[contains(text(), 'Домашний интернет')]")).click();

        String subscriberNumberText = driver.findElement(By.cssSelector("#internet-phone")).getAttribute("placeholder");
        String subscriberNumberTextExpected = "Номер абонента";
        assertEquals(subscriberNumberText, subscriberNumberTextExpected);

/*        assertEquals(sumText, sumTextExpected);
        assertEquals(emailText, emailTextExpected);*/

        driver.quit();
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Description("Плейсхолдеры 'Рассрочка' верные")
    public void installmentPlanPlaceholdersTest() {
        driver.findElement(By.cssSelector(".select__arrow")).click();
        driver.findElement(By.xpath("//li/p[contains(text(), 'Рассрочка')]")).click();

        String accountNumberText = driver.findElement(By.cssSelector("#score-instalment")).getAttribute("placeholder");
        String accountNumberTextExpected = "Номер счета на 44";
        assertEquals(accountNumberText, accountNumberTextExpected);

/*        assertEquals(sumText, sumTextExpected);
        assertEquals(emailText, emailTextExpected);*/

        driver.quit();
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Description("Плейсхолдеры 'Задолженность' верные")
    public void debtPlaceholdersTest() {
        driver.findElement(By.cssSelector(".select__arrow")).click();
        driver.findElement(By.xpath("//li/p[contains(text(), 'Задолженность')]")).click();

        String debtAccountNumberText = driver.findElement(By.cssSelector("#score-arrears")).getAttribute("placeholder");
        String debtAccountNumberTextExpected = "Номер счета на 2073";
        assertEquals(debtAccountNumberText, debtAccountNumberTextExpected);

/*        assertEquals(sumText, sumTextExpected);
        assertEquals(emailText, emailTextExpected);*/

        driver.quit();
    }

    @Test
    @Epic("Сайт МТС")
    @Feature("Главная страница")
    @Description("В окне 'Услуги связи' отображаются данные из формы")
    public void iFrameCheck() {
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");

        WebElement sum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        sum.click();
        sum.sendKeys("100");

        WebElement buttonContinue = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        buttonContinue.click();

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frameElement);

        WebElement sumInFrameHeader = driver.findElement(By.xpath("//div/div/div/span[contains(text(), '100.00 BYN')]"));
        sumInFrameHeader.isDisplayed();

        WebElement sumInFrameButton = driver.findElement(By.xpath("//app-card-page/div/div/button[contains(text(), '100.00 BYN')]"));
        sumInFrameButton.isDisplayed();

        WebElement phoneNumberHeader = driver.findElement(By.cssSelector(".pay-description__text"));
        phoneNumberHeader.isDisplayed();

        String cardNumberFrameText = driver.findElement(By.xpath(".//*[text()='Номер карты']/..")).getText();
        String cardNumberFrameTextExpected = "Номер карты";
        assertEquals(cardNumberFrameTextExpected, cardNumberFrameText);

        WebElement iconsContainer = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div"));
        iconsContainer.isDisplayed();

        String validityOfCard = driver.findElement(By.xpath(".//*[text()='Срок действия']/..")).getText();
        String validityOfCardExp = "Срок действия";
        assertEquals(validityOfCard, validityOfCardExp);

        String cvcOfCard = driver.findElement(By.xpath(".//*[text()='CVC']/..")).getText();
        String cvcOfCardExp = "CVC";
        assertEquals(cvcOfCard, cvcOfCardExp);

        String cardholderName = driver.findElement(By.xpath(".//*[text()='Имя держателя (как на карте)']/..")).getText();
        String cardholderNameExp = "Имя держателя (как на карте)";
        assertEquals(cardholderName, cardholderNameExp);

        driver.quit();
    }
}