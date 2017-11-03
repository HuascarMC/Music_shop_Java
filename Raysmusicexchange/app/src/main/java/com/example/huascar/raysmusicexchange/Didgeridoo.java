package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public class Didgeridoo implements Playable {
    private String Tune;

    public Didgeridoo(String Tune) {
        this.Tune = Tune;
    }

    public String Play() {
        return "Brrroooop!!";
    }
}
