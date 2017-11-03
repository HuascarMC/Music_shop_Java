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
    public void getType() {
        assertEquals("Aboriginal", didgeridoo.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Bamboo", didgeridoo.getMaterial());
    }

    @Test
    public void getTune() {
        assertEquals("D", didgeridoo.getTune());
    }
}
