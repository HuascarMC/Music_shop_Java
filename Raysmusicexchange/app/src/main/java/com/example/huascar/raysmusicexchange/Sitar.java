package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class Sitar implements Playable{
    private int NumberOfStrings;

    public Sitar(int NumberOfStrings) {
        this.NumberOfStrings = NumberOfStrings;
    }

    public String Play() {
        return "Taaan Tiin Tooon Tutaataraaan!";
    }
}
