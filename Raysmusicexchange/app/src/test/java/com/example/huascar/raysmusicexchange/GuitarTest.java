package com.example.huascar.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by huascar on 03/11/2017.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Steel", "Backwood", 12);
    }

    @Test
    public void getType() {
        assertEquals("Steel", guitar.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Backwood", guitar.getMaterial());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(12, guitar.getNumberOfStrings());
    }
}
