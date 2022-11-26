package cz.czechitas.automation;

import org.junit.jupiter.api.Test;

/**
 * Example test class for functionality showcase
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
final class Heckathon extends TestRunner {

    @Test
    void OverPrihlaseniUzivatele() {
        prohlizec.prihlasovani.klikniNaTlacitkoSignIn();
        prohlizec.prihlasovani.vyplnEmail("kzuchnicka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Katka123");
        prohlizec.prihlasovani.provedPrihlaseni();
        overeni.overPrihlaseniUzivatele();
    }

    @Test
    void OverOdhlaseniUzivatele() {
        prohlizec.prihlasovani.klikniNaTlacitkoSignIn();
        prohlizec.prihlasovani.vyplnEmail("kzuchnicka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Katka123");
        prohlizec.prihlasovani.provedPrihlaseni();
        overeni.overPrihlaseniUzivatele();
        prohlizec.prihlasovani.provedOdhlaseni();
    }

    @Test
    void ZobrazDetailPokoje() {
        prohlizec.sekceOurRooms.klikniNaBookNow();
    }






}
