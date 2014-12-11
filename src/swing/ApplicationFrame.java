package swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Currency;
import ui.ExchangeDialog;

public class ApplicationFrame extends JFrame {
    private ExchangeDialogPanel exchangeDialog;
    ActionListener actionListener;
    private Currency[] currencies;
    
    
    public ApplicationFrame(Currency[] currencies){
        this.currencies = currencies;
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 300));
        createWidgets();
        setVisible(true);
    }

    private void createWidgets() {
        add(createExchangeDialog(), BorderLayout.WEST);
        add(createCalculateButton(), BorderLayout.SOUTH);
    }

    private Component createExchangeDialog() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencies);
        this.exchangeDialog = panel;
        return panel;
    }

    public ExchangeDialog getExchangeDialog(){
        return exchangeDialog;
    }
    
    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
                        
            }
        });
        return button;
    }
    
    public void register(ActionListener actionListener){
        this.actionListener= actionListener;
    }
    
    
}
