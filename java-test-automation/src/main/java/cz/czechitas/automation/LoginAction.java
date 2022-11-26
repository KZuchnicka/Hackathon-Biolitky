package cz.czechitas.automation;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

/**
 * Login/logout specific selenium actions
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
@ParametersAreNonnullByDefault
final class LoginAction {

    private final ElementFinder elementFinder;

    LoginAction(ElementFinder elementFinder)
    {
        this.elementFinder = Objects.requireNonNull(elementFinder);
    }

    void klikniNaTlacitkoSignIn() {
        var loginButton = elementFinder.findByXPath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a");
        loginButton.click();
    }

    void klikniNaProfil() {
        var profilButton = elementFinder.findByXPath("//*[@id=\"user_info_acc\"]/span[1]");
        profilButton.click();
    }

    void vyplnEmail(String email) {
        Objects.requireNonNull(email);

        var emailInputBox = elementFinder.findByXPath("//*[@id=\"email\"]");
        emailInputBox.sendKeys(email);
    }

    void vyplnHeslo(String heslo) {
        Objects.requireNonNull(heslo);

        var passwordInputBox = elementFinder.findByXPath("//*[@id=\"passwd\"]");
        passwordInputBox.sendKeys(heslo);
    }

    void provedPrihlaseni() {
        var loginButton = elementFinder.findByXPath("//*[@id=\"SubmitLogin\"]/span");
        loginButton.click();
    }

    void provedOdhlaseni() {
        var signedInUserElement = elementFinder.findByXPath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li");
        signedInUserElement.click();
        var logoutButton = elementFinder.findByXPath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/ul/li[3]/a");
        logoutButton.click();
    }

    void klikniNaPrihlasit () {
        var tlacitkoPrihlasit = elementFinder.findByXPath("/html/body/div/div/div/div/div/div/form/div[3]/div/button");
        tlacitkoPrihlasit.click();
    }

    void VyplnLogin (String Login){
        var vyplnLogin = elementFinder.findByXPath("//*[@id=\"email\"]");
        vyplnLogin.sendKeys(Login);
    }
}
