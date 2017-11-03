package com.example.huascar.raysmusicexchange;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by huascar on 03/11/2017.
 */

public class Shop {

    private ArrayList<Item> Stock = new ArrayList<Item>();


    public Shop(ArrayList<Item> Stock) {
        this.Stock = Stock;
    }

    public int getStockSize() {
        return Stock.size();
    }

    public void addItem(Item item) {
        Stock.add(item);
    }

    public void deleteItem(Item item) {
        Stock.remove(item);
    }
}
