package application;

import control.ExchangeOperation;
import persistence.CurrencySetLoader;

public class Application {

    public static void main(String[] args) {
        CurrencySetLoader currencySetLoader = new CurrencySetLoader();
        currencySetLoader.load();
        ExchangeOperation exchangeOperation = new ExchangeOperation();
        exchangeOperation.execute();
    }

}
