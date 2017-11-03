package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class Guitar extends Instrument implements Playable {
    private int NumberOfStrings;

    public Guitar(String Type, String Material, int NumberOfStrings) {
        super(Type, Material);
        this.NumberOfStrings = NumberOfStrings;
    }

    public String Play() {
        return "Breeeeeemm!";
    }

    public void Sell() {

    }

    public int getNumberOfStrings() {
        return NumberOfStrings;
    }
}
