package persistence;

import model.Currency;
import model.ExchangeRate;
public class ExchangeRateLoader {

    public ExchangeRate load(Currency in, Currency out) {
        return new ExchangeRate(in,out,1.2);
    }

}
