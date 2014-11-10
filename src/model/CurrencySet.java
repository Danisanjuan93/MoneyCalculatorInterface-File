package model;

import java.util.HashMap;

public class CurrencySet {
    HashMap<String,Currency> hashmap = new HashMap<>();

    public CurrencySet() {
    }
    
    public void add(Currency in){
        hashmap.put(in.getCode(),in);
    }
}
