package com.example.huascar.raysmusicexchange;

import java.util.ArrayList;

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

    public String getType() {
        return Type;
    }

    public double getbuyPrice() {
        return buyPrice;
    }

    public double getsellPrice() {
        return sellPrice;
    }

    public double getMarkUp() {
        return (sellPrice - buyPrice);
    }
}
