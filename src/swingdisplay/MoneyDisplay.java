package swingdisplay;

import model.Money;
import swing.ApplicationFrame;

public class MoneyDisplay implements ui.MoneyDisplay{

    private ApplicationFrame frame;

    public MoneyDisplay(ApplicationFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void display(Money money) {
        frame.getTextArea().getArea().setText("El cambio es " + money.getAmount() + " " + money.getCurrency() + "\n");
    }
}
