package pages.mts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MtsHomePage extends BasePage {

    public MtsHomePage(WebDriver driver) {
        super(driver);
    }
    private final By cookieAgree  = By.id("cookie-agree");
    private final By phoneNumberField = By.cssSelector("#connection-phone");
    private final By homeInternetField = By.xpath("//li/p[contains(text(), 'Домашний интернет')]");
    private final By openArrow = By.cssSelector(".select__arrow");
    private final By installmentPlanButton = By.cssSelector("#score-instalment");
    private final By debtButton = By.xpath("//li/p[contains(text(), 'Задолженность')]");

    public MtsHomePage clickCookieAgree() {
        driver.findElement(cookieAgree).click();
        return this;
    }
    public By getPhoneNumberField() {
        return phoneNumberField;
    }

    private final String placeholderPhoneNumberField = "Номер телефона";

    public MtsHomePage findPhoneNumberField() {
        driver.findElement(phoneNumberField).click();
        return this;
    }

    public MtsHomePage getPlaceholderPhoneNumberField() {
        driver.findElement(phoneNumberField).getAttribute("placeholder");
        return this;
    }


/*    public MtsHomePage fillPhoneNumber(String phoneNumber){
        driver.findElement(phoneNumberField).click();
        return this;
    }*/

    public MtsHomePage findHomeInternet() {
        driver.findElement(homeInternetField).click();
        return this;
    }

    public MtsHomePage openArrow() {
        driver.findElement(openArrow).click();
        return this;
    }

    public MtsHomePage findInstallmentPlan() {
        driver.findElement(installmentPlanButton).click();
        return this;
    }

    public MtsHomePage findDebtButton() {
        driver.findElement(debtButton).click();
        return this;
    }

/*    public MtsHomePage clickToFind(){
        WebElement
    }*/
}
