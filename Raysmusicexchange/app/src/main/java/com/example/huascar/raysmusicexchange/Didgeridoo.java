package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class Didgeridoo extends Instrument implements Playable {
    private String Tune;

    public Didgeridoo(String Type, String Material, String Tune) {
        super(Type, Material);
        this.Tune = Tune;
    }

    public String Play() {
        return "Brrroooop!!";
    }

    public void Sell() {

    }
}
