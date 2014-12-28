package application;

import console.CurrencyDisplay;
import swingdisplay.MoneyDisplay;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Currency;
import model.CurrencySet;
import persistence.file.CurrencySetLoader;
import persistence.file.ExchangeRateLoader;
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
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(frame), new ExchangeRateLoader().load(in, out));
                operation.execute();
            }
        });
    }
}
