package com.example.huascar.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by huascar on 03/11/2017.
 */

public class PedalTest {

        Pedal pedal;

        @Before
        public void before() {
            pedal = new Pedal("Loop", 50.00, 99.00);
        }

        @Test
        public void TestgetType() {
            assertEquals("Wooden", pedal.getType());
        }

        @Test
        public void TestgetbuyPrice() {
            assertEquals(50.00, pedal.getbuyPrice(), 0.01);
        }

        @Test
        public void TestgetsellPrice() {
            assertEquals(99.00, pedal.getsellPrice(), 0.01);
        }
    }

