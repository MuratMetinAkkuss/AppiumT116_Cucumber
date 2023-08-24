package pages;


import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Reusablemethods;

import java.util.List;

public class BookingPage {

    public BookingPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesAcceptButton;

    @FindBy(xpath = "//button[@data-testid='header-mobile-menu-button']")
    public WebElement headerMobileMenuButton;

    @FindBy(xpath = "//button[@data-testid='header-mobile-menu-currency-picker-menu-item']")
    public WebElement currencyPickerButton;

    @FindBy(xpath = "(//div[@class='aca0ade214 ebac6e22e9 c2931f4182 e7d9f93f4d d79e71457a'])[2]")
    public WebElement languagePickerButton;

    @FindBy(xpath = "//input[@class='eb46370fe1']")
    public WebElement searchBoxHomepage;

    @FindBy(xpath = "(//div[@class='abf093bdfe d86cee9b25'])[1]")
    public WebElement firstHotelRankResult;

    public void assertionForRank(int wantedRank){
        int actualRank = Integer.parseInt(firstHotelRankResult.getText().replaceAll("\\D",""));
        int expectedRank= wantedRank*10;
        // in this case we aimed the ranks of each parameter, so that way dosen't seem on user screen but make assertion in true way
        Assert.assertTrue(actualRank>wantedRank);
    }


    public void isCookiesAcceptButtonShown(){
        try {
            if (cookiesAcceptButton.isDisplayed()){
                cookiesAcceptButton.click();
            }
        } catch (Exception e) {

        }
    }

    public void wantedCurrency(String currency) {
        try {
            for (int i = 1; i <=5; i++) {
                String webPath =  "(//div[@class=' ea1163d21f bc6c5feac2'])[" + i + "]";
                WebElement currencyElement = Driver.getAndroidDriver().findElement(By.xpath(webPath));
                if (currencyElement.getText().equals(currency.toUpperCase())){
                    currencyElement.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Currency doesn't exist");
        }
    }

    public void wantedLanguage(String language) {
        try {
            for (int i = 1; i <=50; i++) {
                String webPath =  "(//span[@class='cf67405157'])[" + i + "]";
                WebElement langaugeElement = Driver.getAndroidDriver().findElement(By.xpath(webPath));
                if (langaugeElement.getText().contains(language)){
                    langaugeElement.click();
                    break;
                } else if (i==8) {
                    Reusablemethods.screenScrollDown(400);
                }
            }
        } catch (Exception e) {
            System.out.println("Language doesn't exist");
        }
    }
}
