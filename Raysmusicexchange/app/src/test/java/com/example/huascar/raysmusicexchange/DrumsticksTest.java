package com.example.huascar.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by huascar on 03/11/2017.
 */

public class DrumsticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Wooden", 10, 17);
    }

    @Test
    public void TestgetType() {
        assertEquals("Wooden", drumSticks.getType());
    }

    @Test
    public void TestgetbuyPrice() {
        assertEquals(10.00, drumSticks.getbuyPrice(), 0.01);
    }

    @Test
    public void TestgetsellPrice() {
        assertEquals(17.00, drumSticks.getsellPrice(), 0.01);
    }

    @Test
    public void TestgetMarkUp() {
        assertEquals(7.00, drumSticks.getMarkUp(), 0.01);
    }
}
