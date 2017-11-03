package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class HangDrum extends Instrument implements Playable {
    private String Tune;

    public HangDrum(String Type, String Material, String Tune) {
        super(Type, Material);
        this.Tune = Tune;
    }

    public String Play() {
        return "Tuuuuuuummmm!";
    }

    public void Sell() {

    }

    public String getTune() {
        return Tune;
    }
}
