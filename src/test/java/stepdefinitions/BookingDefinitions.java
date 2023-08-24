package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.BookingPage;
import utilities.Driver;
import utilities.Reusablemethods;

public class BookingDefinitions {
    BookingPage bookingPage = new BookingPage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getAndroidDriver().get(url);
    }
    @Given("Cookies i kabul eder")
    public void cookies_i_kabul_eder() {
        bookingPage.isCookiesAcceptButtonShown();
        Reusablemethods.waitS(2);
    }
    @Given("sag ust uc cizgi menuye tiklar")
    public void sag_ust_uc_cizgi_menuye_tiklar() {
        bookingPage.headerMobileMenuButton.click();
        Reusablemethods.waitS(1);
    }
    @Given("para birimi bolumunde degisiklik yaparak {string} secer")
    public void para_birimi_bolumunde_degisiklik_yaparak_usd_secer(String currency) {
        bookingPage.currencyPickerButton.click();
        Reusablemethods.waitS(1);
        bookingPage.wantedCurrency(currency);

    }
    @Given("dil i {string} olarak degistirir")
    public void dil_i_turkce_olarak_degistirir(String language) {
        Reusablemethods.waitS(2);
        bookingPage.languagePickerButton.click();
        Reusablemethods.waitS(2);
        bookingPage.wantedLanguage(language);
    }
    @Given("arama bolume {string} yazilir ve arama yapilir")
    public void arama_bolume_antalya_yazilir_ve_arama_yapilir(String area) {
       Reusablemethods.waitS(2);
       bookingPage.searchBoxHomepage.click();
       Reusablemethods.waitS(1);
       bookingPage.searchBoxHomepage.sendKeys(area + Keys.ENTER);
       Reusablemethods.waitS(1);

    }
    @Given("gelen otel puanin {int} den yuksek oldugu dogrulanir")
    public void gelen_otel_puanin_den_yuksek_oldugu_dogrulanir(int rank) {
        bookingPage.assertionForRank(rank);
        Reusablemethods.waitS(1);
    }
    @Given("uygulama kapatilir")
    public void uygulama_kapatilir() {
       Driver.quitAppiumDriver();
    }

}
