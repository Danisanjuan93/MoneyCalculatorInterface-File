package control;

import ui.CurrencyDisplay;
import ui.ExchangeDialog;
import ui.MoneyDisplay;

public class ExchangeOperation{
 
    private final ExchangeDialog dialog;
    private final MoneyDisplay display;
    private final CurrencyDisplay currencyDisplay;

    public ExchangeOperation(ExchangeDialog dialog, MoneyDisplay display, CurrencyDisplay currencyDisplay) {
        this.dialog = dialog;
        this.display = display;
        this.currencyDisplay = currencyDisplay;
    }
    
    public void execute(){
        display.display(dialog.getExchange().getMoney());
        currencyDisplay.getCurrencyFrom(dialog.getExchange());
    }
}