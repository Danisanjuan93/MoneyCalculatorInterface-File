package swingdisplay;

import java.text.DecimalFormat;
import model.Money;
import swing.ApplicationFrame;

public class MoneyDisplay implements ui.MoneyDisplay{

    private final ApplicationFrame frame;
    private final DecimalFormat df = new DecimalFormat("0.00");
    
    public MoneyDisplay(ApplicationFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void display(Money money) {
        frame.getTextArea().getArea().setText("El cambio es " + df.format(money.getAmount()) + " " + money.getCurrency() + "\n");
    }
}
