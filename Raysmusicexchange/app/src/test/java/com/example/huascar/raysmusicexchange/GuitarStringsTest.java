package com.example.huascar.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by huascar on 03/11/2017.
 */

public class GuitarStringsTest {

        GuitarStrings guitarStrings;

        @Before
        public void before() {
            guitarStrings = new GuitarStrings("Bronze", 6, 11);
        }

        @Test
        public void TestgetType() {
            assertEquals("Bronze", guitarStrings.getType());
        }

        @Test
        public void TestgetbuyPrice() {
            assertEquals(6.00, guitarStrings.getbuyPrice(), 0.01);
        }

        @Test
        public void TestgetsellPrice() {
            assertEquals(11.00, guitarStrings.getsellPrice(), 0.01);
        }
    }
