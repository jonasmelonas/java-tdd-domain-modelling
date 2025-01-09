package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        if(!items.containsKey(product)) {
            items.put(product, price);
            return true;
        } else {
            return false;
        }
    }

    public int total() {
        int totalCost = 0;
        for(String key : items.keySet()) {
            totalCost += items.get(key);
        }
        return totalCost;
    }
}
