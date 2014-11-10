package control;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import persistence.ExchangeRateLoader;
import process.Exchanger;
import ui.ExchangeDialog;
import ui.MoneyDisplay;

public class ExchangeOperation {
    
    public double rate;
    Currency in,out;
    CurrencySet currencySet = new CurrencySet();
    ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader();
    ExchangeDialog exchangeDialog = new ExchangeDialog();
    Money money = new Money(200,in);
    Exchanger exchanger = new Exchanger();
    MoneyDisplay moneydisplay = new MoneyDisplay();
    public ExchangeOperation() {
    }
    
    public void execute(){
        readExchangeRate();
        readExchangeDialog();
        Money mon = conversorCurrency();
        moneydisplay.execute(mon);
    }

    private ExchangeRate readExchangeRate(){
        return exchangeRateLoader.load(in,out);
    }
        
    private Exchange readExchangeDialog(){
        return exchangeDialog.execute(out,money);
    }
    
    private Money conversorCurrency(){
        return exchanger.exchange(money, readExchangeRate());
    }
   
    
    
    
    
    
    
    
    
}
