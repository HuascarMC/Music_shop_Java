package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

public abstract class Instrument implements Sellable {
    private String Type;
    private String Material;

    public Instrument(String Type, String Material) {
        this.Type = Type;
        this.Material = Material;
    }
}
