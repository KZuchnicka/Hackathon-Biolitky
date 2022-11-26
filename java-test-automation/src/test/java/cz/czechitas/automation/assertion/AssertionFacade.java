package cz.czechitas.automation.assertion;

import cz.czechitas.automation.ElementFinder;
import org.openqa.selenium.WebDriver;

import javax.annotation.ParametersAreNonnullByDefault;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setExtractBareNamePropertyMethods;

/**
 * Assertion facade for user-friendly assertions
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
@ParametersAreNonnullByDefault
public final class AssertionFacade {

    private final ElementFinder elementFinder;
    public final ApplicationAssertion sekcePrihlasky;
    public final ApplicationDetailAssertion detailPrihlasky;

    public AssertionFacade(WebDriver webDriver)
    {
        this.elementFinder = new ElementFinder(webDriver);
        this.sekcePrihlasky = new ApplicationAssertion(elementFinder);
        this.detailPrihlasky = new ApplicationDetailAssertion(elementFinder);
    }

    public void overAdresuWwwStranky(String wwwAdresa) {
        var url = elementFinder.findByXPath("/html/body/div/div/div/div/div/div/div/div[1]/p[2]/a");
        assertThat(url.getText()).isEqualTo(wwwAdresa);
    }

    public void overPrihlaseniUzivatele() {
        var loggedInText = elementFinder.findByXPath("//*[@id=\"center_column\"]/h1");
        assertThat(loggedInText.getText()).isEqualTo("MY ACCOUNT");
    }

    public void overOdhlaseniUzivatele() {
        var loggedoutText = elementFinder.findByXPath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span");
        assertThat(loggedoutText.getText()).isEqualTo("Sign in");
    }

    public void overExistenciDlazdiceProgramovani() {
        var programmingText = elementFinder.findByXPath("/html/body/div/div/div[1]/div/div/div[1]/div");
        assertThat(programmingText.getText()).isEqualTo("Programování");
    }

    public void overPritomnostTlacitkaZaregistrujteSe() {
        var registerButton = elementFinder.findByXPath("/html/body/div/div/div/div/div/div[2]/form/div[4]/div/a");
        assertThat(registerButton.getText()).isEqualTo("Zaregistrujte se");
    }

    public void overPritomnostPokojeVKosiku() {
        var roomReservation = elementFinder.findByXPath("//*[@id=\"shopping-cart-summary-head\"]/h5/span");
        assertThat(roomReservation.getText()).isEqualTo("Rooms & Price Summary");
    }

    public void overSpravnyOdkazNavodyProUcitele(String WwwAdresa) {
        var url = elementFinder.findByXPath("/html/body/div/div/div/div/div/div/ul/li/a");
        assertThat(url.getAttribute("href")).isEqualTo(WwwAdresa);
    }

    public void overPritomnostSloupceJmeno(){
        var JmenoText = elementFinder.findByXPath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]");
        assertThat(JmenoText.getText()).contains("Jméno");
    }

    public void overPritomnostSloupceDatumKonani(){
        var KategorieText = elementFinder.findByXPath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]");
        assertThat(KategorieText.getText()).contains("Datum konání");
    }

    public void overSekcePrihlaskyNeobsahujePrihlasky(){
        var KategorieText = elementFinder.findByXPath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td");
        assertThat(KategorieText.getText()).contains("Žádné záznamy nebyly nalezeny");
    }

    public void overPritomnostNadpiduInterior() {
        var detailInterior = elementFinder.findByXPath("//*[@id=\"hotelInteriorBlock\"]/div/div[1]/div/p[1]");
        assertThat(detailInterior.getText()).isEqualTo("Interior");
    }

    public void overRegistrovaneJmeno() {
        var nameSurname = elementFinder.findByXPath("//*[@id=\"name\"]");
        var profilName = elementFinder.findByXPath("//*[@id=\"navbarSupportedContent\"]/div[2]/div/a");
        assertThat(nameSurname.getCssValue("value")).isEqualTo(profilName.getCssValue("title"));
    }

    public void overAdresuKontakt(String Adresa) {
        var adresaKontakt = elementFinder.findByXPath("/html/body/div/div/div/div/div/div/div/div[1]");
        assertThat(adresaKontakt.getText()).contains(Adresa);
    }



  }