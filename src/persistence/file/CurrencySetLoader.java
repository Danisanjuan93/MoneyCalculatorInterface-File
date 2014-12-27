package persistence.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements persistence.CurrencySetLoader{

    @Override
    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        String[] currency = new String[3];
        String aux = "";
        int pos = 0;
        try {
            FileReader file = new FileReader("C:\\Users\\Daniel\\Desktop\\Divisas.csv");
            int value = file.read();
            while(value != -1){
                if(((char)value) == ';' || ((char)value) == '\n'){
                    currency[pos] = aux;
                    pos++;
                    aux = "";
                    value = file.read();
                }
                
                if (pos == 3){
                    set.add(new Currency(currency[0],currency[1],currency[2]));
                    pos = 0;
                }
                
                aux += ((char)value);
                value = file.read();
            
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CurrencySetLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CurrencySetLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;
    }
}