package pages.mts;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MtsHomePage extends BasePage {

    public MtsHomePage(WebDriver driver) {
        super(driver);
    }

    private final By cookieAgree = By.id("cookie-agree");
    private final By phoneNumberField = By.cssSelector("#connection-phone");
    private final By homeInternetField = By.xpath("//li/p[contains(text(), 'Домашний интернет')]");
    private final By openArrow = By.cssSelector(".select__arrow");
    // private final By installmentPlanButtonField = By.cssSelector("#score-instalment");
    private final By debtChoice = By.xpath("//li/p[contains(text(), 'Задолженность')]");

    private final By installmentPlanChoice = By.xpath("//li/p[contains(text(), 'Рассрочка')]");

    private final By sumField = By.cssSelector("#connection-sum");

    private final By emailField = By.cssSelector("#connection-email");
    private final String placeholderPhoneNumberField = "Номер телефона";
    private final String placeholderEmailField = "E-mail для отправки чека";
    private final String placeholderSumField = "Сумма";
    private final String placeholderScoreInstalmentSumField = "Номер счета на 44";
    private final String placeholderDebtSumField = "Номер счета на 2073";
    private final String placeholderAbonentNumber = "Номер абонента";
    private final By abonentNumber = By.cssSelector("#internet-phone");
    private final By accountNumberField = By.cssSelector("#score-instalment");
    private final By placeholderAccountNumber = By.cssSelector("#score-instalment");

    public String getPlaceholderDebtSumField() {
        return placeholderDebtSumField;
    }
    public String getPlaceholderAbonentNumber() {
        return placeholderAbonentNumber;
    }

    public String getPlaceholderEmailField() {
        return placeholderEmailField;
    }

    public String getPlaceholderSumField() {
        return placeholderSumField;
    }


    public By getPlaceholderAccountNumber() {
        return placeholderAccountNumber;
    }

    @Step("Нажатие на Принять в окне Обработка файлов cookie")
    // думаю, окно можно вынести отдельным блоком и расписать кнопки и степы для него
    public MtsHomePage clickCookieAgree() {
        driver.findElement(cookieAgree).click();
        return this;
    }

/*    public By getPhoneNumberField() {
        return phoneNumberField;
    }*/

    public String getPlaceholderPhoneNumberField() {
        return placeholderPhoneNumberField;
    }

        public MtsHomePage findPhoneNumberField() {
        driver.findElement(phoneNumberField).click();
        return this;
    }

    public MtsHomePage fillPhoneNumberField(String phoneNumber2) {
        WebElement phoneNumber1 = driver.findElement(phoneNumberField);
        phoneNumber1.sendKeys(phoneNumber2);
        return this;
    }

    @Step("Получение плейсхолдера поля Номер телефона")
    public String readPlaceholderPhoneNumberField() {
        String value = driver.findElement(phoneNumberField).getAttribute("placeholder");
        return value;
    }

    @Step("Получение плейсхолдера поля E-mail")
    public String readPlaceholderEmail() {
        String value = driver.findElement(emailField).getAttribute("placeholder");
        return value;
    }

    @Step("Получение плейсхолдера поля Сумма")
    public String readPlaceholderSumField() {
        String value = driver.findElement(sumField).getAttribute("placeholder");
        return value;
    }

    @Step("Получение плейсхолдера поля Номер абонента")
    public String readPlaceholderAbonentNumber() {
        String value = driver.findElement(abonentNumber).getAttribute("placeholder");
        return value;
    }

    @Step("Получение плейсхолдера поля Номер счёта")
    public String readPlaceholderAccountNumber() {
        String value = driver.findElement(accountNumberField).getAttribute("placeholder");
        return value;
    }

    @Step("Получение плейсхолдера поля Номер счета на 2073")
    public String readPlaceholderAccountNumberDebt() {
        String value = driver.findElement(accountNumberField).getAttribute("placeholder");
        return value;
    }

/*    public MtsHomePage fillPhoneNumber(String phoneNumber){
        driver.findElement(phoneNumberField).click();
        return this;
    }*/

    @Step("Выбрать из выпадающего списка Домашний интернет")
    public void chooseHomeInternet() {
        driver.findElement(homeInternetField).click();
    }
    @Step("Выбрать из выпадающего списка Рассрочка")
    public void chooseInstallmentPlan() {
        driver.findElement(installmentPlanChoice).click();
    }
    @Step("Выбрать из выпадающего списка Задолженность")
    public void chooseDebt() {
        driver.findElement(debtChoice).click();
    }

    @Step("Нажать на стрелку выпадающего списка услуг")
    public void openArrow() {
        driver.findElement(openArrow).click();
    }


/*    public MtsHomePage findInstallmentPlanField() {
        driver.findElement(scoreInstalmentField).click();
        return this;
    }*/

    public MtsHomePage findDebtButton() {
        driver.findElement(debtChoice).click();
        return this;
    }

/*    public MtsHomePage clickToFind(){
        WebElement
    }*/

    public MtsHomePage findSumField() {
        driver.findElement(sumField).click();
        return this;
    }

}