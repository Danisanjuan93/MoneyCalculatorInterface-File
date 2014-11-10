package model;

import java.util.Date;

public class Exchange {

    private final Money money;
    private final Date date;
    private final Currency currency;

    public Exchange(Money money, Date date, Currency currency) {
        this.money = money;
        this.date = date;
        this.currency = currency;
    }

    public Money getMoney() {
        return money;
    }

    public Date getDate() {
        return date;
    }

    public Currency getCurrency() {
        return currency;
    }

}
