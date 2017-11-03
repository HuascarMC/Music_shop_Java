package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class Sitar extends Instrument implements Playable {
    private int NumberOfStrings;

    public Sitar(String Type, String Material, int NumberOfStrings) {
        super(Type, Material);
        this.NumberOfStrings = NumberOfStrings;
    }

    public String Play() {
        return "Taaan Tiin Tooon Tutaataraaan!";
    }

    public void Sell() {

    }
}
