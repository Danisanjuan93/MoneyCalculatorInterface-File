package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public void load(){
        CurrencySet currencySet = new CurrencySet(); //Cambiarlo
        currencySet.add(new Currency("Euro","EUR", "€"));
        currencySet.add(new Currency("Libra","GBP","£"));
        currencySet.add(new Currency("Dólar","USD","$"));
    }
}
