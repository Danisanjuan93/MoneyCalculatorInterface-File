package application;

import console.CurrencyDisplay;
import console.MoneyDisplay;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import persistence.mock.CurrencySetLoader;
import process.Exchanger;
import swing.ApplicationFrame;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        final CurrencyDisplay display = new CurrencyDisplay();
        frame.register(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                ExchangeRate exchangeRate = new ExchangeRate(frame.getExchangeDialog().getExchange().getMoney().getCurrency(),frame.getExchangeDialog().getExchange().getCurrency(), 1.2);
                //System.out.println(exchanger.exchange(frame.getExchangeDialog().getExchange().getMoney(), exchangeRate).getAmount());
                
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(), exchangeRate);
                operation.execute();
            }
        });
    }

}
