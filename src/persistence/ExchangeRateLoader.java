package persistence;

import model.Currency;
import model.ExchangeRate;
public class ExchangeRateLoader {

    public ExchangeRate load(Currency in, Currency out) {
        return new ExchangeRate(new Currency("Euro","EUR","€"),new Currency("Libras","GBD","£"), 1.2);
    }

}
