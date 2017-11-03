package com.example.huascar.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by huascar on 03/11/2017.
 */

public class HangDrumTest {

    HangDrum hangDrum;

    @Before
    public void before() {
        hangDrum = new HangDrum("Internal hang", "Steel", "D");
    }

    @Test
    public void TestgetType() {
        assertEquals("Internal hang", hangDrum.getType());
    }

    @Test
    public void TestgetMaterial() {
        assertEquals("Steel", hangDrum.getMaterial());
    }

    @Test
    public void TestgetTune() {
        assertEquals("D", hangDrum.getTune());
    }
}
