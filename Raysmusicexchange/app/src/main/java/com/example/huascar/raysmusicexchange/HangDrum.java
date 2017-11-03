package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class HangDrum implements Playable {
    private String Tune;

    public HangDrum(String Tune) {
        this.Tune = Tune;
    }

    public String Play() {
        return "Tuuuuuuummmm!";
    }
}
