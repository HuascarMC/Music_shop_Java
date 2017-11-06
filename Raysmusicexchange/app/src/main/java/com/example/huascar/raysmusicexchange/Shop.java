package com.example.huascar.raysmusicexchange;

import java.util.ArrayList;

/**
 * Created by huascar on 03/11/2017.
 */

public class Shop {

    private ArrayList<Item> stock;


    public Shop(ArrayList<Item> stock) {
        this.stock = stock;
    }

    public int getStockSize() {
        return stock.size();
    }

    public void addItem(Item item) {
        stock.add(item);
    }

    public void deleteItem(Item item) {
        stock.remove(item);
    }

    public double potentialProfit() {
        double profit = 0;
        for (Item accessory : stock) {
           profit += accessory.getMarkUp();

        }
        return profit;
    }
}
