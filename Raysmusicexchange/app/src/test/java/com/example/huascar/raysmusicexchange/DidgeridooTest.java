package com.example.huascar.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by huascar on 03/11/2017.
 */

public class DidgeridooTest {

    Didgeridoo didgeridoo;

    @Before
    public void before() {
        didgeridoo = new Didgeridoo("Aboriginal", "Bamboo", "D");
    }

    @Test
    public void TestgetType() {
        assertEquals("Aboriginal", didgeridoo.getType());
    }

    @Test
    public void TestgetMaterial() {
        assertEquals("Bamboo", didgeridoo.getMaterial());
    }

    @Test
    public void TestgetTune() {
        assertEquals("D", didgeridoo.getTune());
    }



}
