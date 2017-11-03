package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class Guitar extends Instrument implements Playable {
    private int NumberOfStrings;

    public Guitar(int NumberOfStrings) {
        this.NumberOfStrings = NumberOfStrings;
    }

    public String Play() {
        return "Breeeeeemm!";
    }
}
