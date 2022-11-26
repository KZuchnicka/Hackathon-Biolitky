package cz.czechitas.automation;

import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;

/**
 * Test class for custom student tests
 *
 * @author Jiri Koudelka
 * @since 1.0.0
 */
final class LowCodeAutomationTest extends TestRunner {

    /**
    @Test
    void VypisIcoDoFormulare () {
        prohlizec.horniMenu.jdiDoSekceObjednavkaProMSZS();
        prohlizec.sekceObjednavky.vyplnICO("75027712");
        prohlizec.sekceObjednavky.vyberMoznostSkolaVPrirode();
        prohlizec.sekceObjednavky.vyplnPocetDeti(25);
    }

    @Test
    void NajdiSloupce () {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("admin@czechitas-app.loc");
        prohlizec.prihlasovani.vyplnHeslo("Czechitas123");
        prohlizec.prihlasovani.klikniNaPrihlasit();
        prohlizec.interniMenu.jdiDoSekcePrihlasky();
        overeni.overPritomnostSloupceJmeno();
        overeni.overPritomnostSloupceDatumKonani();
    }

    /**
     * 1. Napište test, který bude plnit následující posloupnost úkonů:
     * a. Přihlaste se do aplikace
     * b. Přejděte pomocí horního menu do sekce Přihlášky
     * c. Klikněte zde na tlačítko Vytvořit novou přihlášku.
     * d. Vyberte období akce programování
     * e. Klikněte na tlačítko Vytvořit přihlášku pro akcí JavaScript a NodeJS.
     * f. Vyplňte pole ve formuláři (Termín, Křestní jméno, Příjmení, Datum narození, Poznámka) pro vytvoření přihlášky (Jako způsob platby zvolte možnost hotově) a na závěr přihlášku vytvořte.
     * g. Ověřte, že nově vytvořená přihláška má Vámi nastavené hodnoty (Termín, Křestní jméno, Příjmení, Datum narození, Poznámka) správně uložené.
     */
    /**
    @Test
    void UkolKomplexPrvni() {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.VyplnLogin("kzuchnicka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Katka89");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.sekcePrihlasky.klikniNaVytvoreniNovePrihlasky();
        prohlizec.sekcePrihlasky.vyberObdobiProgramovani();
        prohlizec.sekcePrihlasky.vyberKurzJava();
        prohlizec.detailPrihlasky.vyberTermin("21.11. - 30.11.2022");
        prohlizec.detailPrihlasky.vyplnKrestniJmenoZaka("Katka");
        prohlizec.detailPrihlasky.vyplnPrijmeniZaka("Biolitka");
        prohlizec.detailPrihlasky.vyplnDatumNarozeni("16.7.2016");
        prohlizec.detailPrihlasky.zvolZpusobUhradyHotove();
        prohlizec.detailPrihlasky.vyplnPoznamku("Už mě bolí hlava");
        prohlizec.detailPrihlasky.klikniNaSouhlasSPodminkami();
        prohlizec.detailPrihlasky.klikniNaVytvoritPrihlasku();

    }
    /**
     2. Vytvořte ručně přihlášku, kde jako příjmení žáka uveďte Tester214. (Toto jméno by v rámci testovacích dat mělo být unikátní).
     3. Napište test, který bude plnit následující posloupnost úkonů:
     a. Přihlaste se do aplikace
     b. Přejděte pomocí horního menu do sekce Přihlášky
     c. Do vyhledávacího pole nad tabulkou přihlášek zadejte příjmení žáka z předcházejícího úkolu
     d. Pro vyhledanou přihlášku zvolte možnost upravit a nastavte způsob platby na Bankovní převod
     e. Uložte otevřenou přihlášku
     f. Opět pomocí vyhledávacího pole nad tabulkou vyhledejte příjmení žáka z předchozího úkolu
     g. Pro vyhledanou přihlášku otevřete její detail
     h. Ověřte, že způsob platby je nastaven na Bankovní převod
     i. Ověřte, že zbývající částka k uhrazení je 1 500 Kč
     j. Ověřte, že zpráva pro příjemce obsahuje příjmení žáka z předchozího úkolu
     */
    /**
    @Test
    void UkolCisloTri() {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.VyplnLogin("kzuchnicka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Katka89");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.sekcePrihlasky.VyhledejPrihlasku("Tester214");
        prohlizec.sekcePrihlasky.klikniNaUpravitUPrvniPrihlasky();
        prohlizec.detailPrihlasky.zvolZpusobUhradyBankovnimPrevodem();
        prohlizec.detailPrihlasky.klikniNaUpravitPrihlasku();
        prohlizec.sekcePrihlasky.klikniNaDetailUPrvniPrihlasky();
        overeni.detailPrihlasky.overZpusobUhradyPrihlasky("Bankovní převod");
        overeni.detailPrihlasky.overZbyvajiciCastkuKUhrazeni("1 500 Kč");
        overeni.detailPrihlasky.overPoznamku("Tester214");

    }

    /**
     4. Vytvořte ručně druhého uživatele, pomocí kterého se budete moci přihlásit
     biolitkakatka@seznam.cz
     Biolitka123
     5. Prodiskutujte s lektorem nebo kouči, jak se dá v Java programu uložit hodnota k opakovanému použití.
     6. Přihlaste se pod jedním z Vámi založených uživatelů a vytvořte přihlášku pro žáka s náhodně vygenerovaným příjmením (lze použít metodu prohlizec.vygenerujNahodnePrijmeni()).
     Ověřte, že v tabulce přihlášek nově založená přihláška skutečně existuje. Následně se odhlaste a přihlaste pod druhým uživatelem.
     Nyní ověřte, že se přihláška prvního uživatele nezobrazuje mezi přihláškami uživatele druhého.
     7. Napište test, který ověří, že v aplikaci funguje funkcionalita změny hesla.
     */
    /**
    @Test
    void vytvorPrihlaskuNahodne () {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("biolitkakatka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Biolitka123");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.sekcePrihlasky.klikniNaVytvoreniNovePrihlasky();
        prohlizec.sekcePrihlasky.vyberObdobiProgramovani();
        prohlizec.sekcePrihlasky.vyberKurzJava();
        prohlizec.detailPrihlasky.vyberTermin("21.11. - 30.11.2022");
        prohlizec.detailPrihlasky.vyplnKrestniJmenoZaka("Pepik");
        prohlizec.detailPrihlasky.vyplnPrijmeniZaka(prohlizec.vygenerujNahodnePrijmeni(6));
        prohlizec.detailPrihlasky.vyplnDatumNarozeni("10.09.2015");
        prohlizec.detailPrihlasky.zvolZpusobUhradyBankovnimPrevodem();
        prohlizec.detailPrihlasky.klikniNaSouhlasSPodminkami();
        prohlizec.detailPrihlasky.klikniNaVytvoritPrihlasku();
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
        prohlizec.prihlasovani.provedOdhlaseni();
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();

    }

    @Test
    void overeniNeexistujiciPrihlasky () {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.VyplnLogin("kzuchnicka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Katka89");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.sekcePrihlasky.VyhledejPrihlasku("Pepik");
        overeni.overSekcePrihlaskyNeobsahujePrihlasky();
    }

    @Test
    void overZmenuHesla () {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("biolitkakatka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Biolitka123");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.profil.otevriProfil();
        prohlizec.profil.vyplnHeslo("Katka89");
        prohlizec.profil.vyplnKontroluHesla("Katka89");
        prohlizec.profil.klikniNaZmenit();
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
        prohlizec.prihlasovani.provedOdhlaseni();
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.vyplnEmail("biolitkakatka@seznam.cz");
        prohlizec.prihlasovani.vyplnHeslo("Katka89");
        prohlizec.prihlasovani.provedPrihlaseni();
        overeni.overPrihlaseniUzivatele();
        prohlizec.profil.otevriProfil();
        prohlizec.profil.vyplnHeslo("Biolitka123");
        prohlizec.profil.vyplnKontroluHesla("Biolitka123");
        prohlizec.profil.klikniNaZmenit();

    }


     * Simple Code automation – zadání povinného úkolu:

     1.      Manuálně si založte nového uživatele na https://czechitas-app.kutac.cz
     2.      V našem projektu v IntelliJ Idea vytvořte automatizovaný test:
     a)      Přihlaste se s uživatelem vytvořeným v kroku 1.
     b)     Vyplňte a vytvořte novou přihlášku (volitelně – vygenerujte žákovi náhodné příjmení).
     c)      Po vytvoření přihlášky přejděte do seznamu přihlášek.
     d)     Ověřte, že se u záznamu přihlášky zobrazuje tlačítko Detail.
     e)     Otevřete profil přihlášeného uživatele (vpravo nahoře)
     f)       Ověřte, že jméno a příjmení v profilu plně odpovídá jménu a příjmení vašeho zaregistrovaného uživatele, kterého jste si manuálně zaregistrovaly v kroku č.1.
     g)      Přejděte do sekce Kontakt
     h)     Ověřte, že část kontaktní adresy obsahuje řetězec „Horní Dolní“.
     Zkontrolujte si test, je všechno v pořádku? Dělají kroky to co mají? Nezdá se vám něco? Napište mi své poznámky a přiložte do wordu.
     Odevzdejte screenshot výsledného testu. Pokud jste dělaly nějakou úpravu metody nebo psaly uplně nové metody, odevzdejte také screenshoty těchto úprav. Přidejte odkaz na úložiště.

    @Test
    void domaciUkol () {
        prohlizec.prihlasovani.klikniNaTlacitkoSignIn();
        prohlizec.prihlasovani.vyplnEmail("katkazuch@ukol.cz");
        prohlizec.prihlasovani.vyplnHeslo("Ukol123");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.sekcePrihlasky.klikniNaVytvoreniNovePrihlasky();
        prohlizec.sekcePrihlasky.vyberObdobiProgramovani();
        prohlizec.sekcePrihlasky.vyberKurzJava();
        prohlizec.detailPrihlasky.vyberTermin("21.11. - 30.11.2022"); /**vybere první termín
        prohlizec.detailPrihlasky.vyplnKrestniJmenoZaka("Ludva");
        prohlizec.detailPrihlasky.vyplnPrijmeniZaka(prohlizec.vygenerujNahodnePrijmeni(5));
        prohlizec.detailPrihlasky.vyplnDatumNarozeni("10.09.2015");
        prohlizec.detailPrihlasky.zvolZpusobUhradyBankovnimPrevodem();
        prohlizec.detailPrihlasky.klikniNaSouhlasSPodminkami();
        prohlizec.detailPrihlasky.klikniNaVytvoritPrihlasku();
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
        overeni.overPritomnostTlacitkaDetail();
        prohlizec.profil.otevriProfil();
        overeni.overRegistrovaneJmeno();
        prohlizec.horniMenu.jdiDoSekcePrihlasky();
    }
    @Test
    void overeniKontaktniAdresa () {
        prohlizec.horniMenu.jdiDoSekceKontakt();
        overeni.overAdresuKontakt("Horní Dolní");
        prohlizec.prihlasovani.klikniNaTlacitkoSignIn();
        prohlizec.prihlasovani.vyplnEmail("katkazuch@ukol.cz");
        prohlizec.prihlasovani.vyplnHeslo("Ukol123");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.horniMenu.jdiDoSekceKontakt();
        overeni.overAdresuKontakt("Horní Dolní");
    }
    @Test
    void overJmenoPrijmeni() {
        prohlizec.prihlasovani.klikniNaTlacitkoPrihlasit();
        prohlizec.prihlasovani.VyplnLogin("katkazuch@ukol.cz");
        prohlizec.prihlasovani.vyplnHeslo("Ukol123");
        prohlizec.prihlasovani.provedPrihlaseni();
        prohlizec.profil.otevriProfil();
        overeni.overRegistrovaneJmeno();
    }
    */
}

