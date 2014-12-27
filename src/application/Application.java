package application;

import console.CurrencyDisplay;
import swingdisplay.MoneyDisplay;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Currency;
import model.CurrencySet;
import persistence.ExchangeRateLoader;
import persistence.file.CurrencySetLoader;
import swing.ApplicationFrame;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        final CurrencyDisplay display = new CurrencyDisplay();
        frame.register(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                Currency in = frame.getExchangeDialog().getExchange().getMoney().getCurrency();
                Currency out = frame.getExchangeDialog().getExchange().getCurrency();
                ExchangeRateLoader rateLoader = new ExchangeRateLoader();
                //System.out.println(exchanger.exchange(frame.getExchangeDialog().getExchange().getMoney(), exchangeRate).getAmount());
                
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(frame), rateLoader.load(in, out));
                operation.execute();
            }
        });
    }
}
