package com.example.huascar.raysmusicexchange;

/**
 * Created by huascar on 03/11/2017.
 */

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<Item> Stock = new ArrayList<Item>();
    DrumSticks drumsticks;
    GuitarStrings guitarStrings;
    Pedal pedal;

    @Before
    public void before() {
        shop = new Shop(Stock);
        drumsticks = new DrumSticks("Wooden", 10, 1);
        guitarStrings = new GuitarStrings("Bronze", 6, 11);
        pedal = new Pedal("Loop", 50.00, 99.00);

    }

    @Test
    public void TestgetStockSize() {
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void TestAddItem() {
        shop.addItem(drumsticks);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void TestDeleteItem() {
        shop.deleteItem(drumsticks);
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void TestPotentialProfit() {
        shop.addItem(drumsticks);
        shop.addItem(guitarStrings);
        shop.addItem(pedal);
        assertEquals(45.00, shop.potentialProfit(), 0.01);
    }
}
