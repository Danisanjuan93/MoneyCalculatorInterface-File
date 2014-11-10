package ui;

import java.util.Date;
import model.Currency;
import model.Exchange;
import model.Money;

public class ExchangeDialog {
    Date date = new Date();
    public Exchange execute(Currency out, Money money){
        return new Exchange (money, date,out);
    }
}
