package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class Item {
    private String Type;
    private double buyPrice;
    private double sellPrice;

    public Item(String Type, double buyPrice, double sellPrice) {
        this.Type = Type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
