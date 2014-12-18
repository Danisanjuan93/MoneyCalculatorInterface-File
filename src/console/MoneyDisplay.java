package console;

import model.Money;

public class MoneyDisplay implements ui.MoneyDisplay{

    @Override
    public void display(Money money) {
        System.out.print(money.getAmount() + " " + money.getCurrency());
    }
    
}
