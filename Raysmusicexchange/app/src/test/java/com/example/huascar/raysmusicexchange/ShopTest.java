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

    @Before
    public void before() {
        shop = new Shop(Stock);
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

}
