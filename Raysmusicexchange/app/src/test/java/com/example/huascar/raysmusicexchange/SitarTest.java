package com.example.huascar.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by huascar on 03/11/2017.
 */

public class SitarTest {

    Sitar sitar;

    @Before
    public void before() {
        sitar = new Sitar("Gayaki", "Toon wood", 21);
    }

    @Test
    public void TestgetType() {
        assertEquals("Gayaki", sitar.getType());
    }

    @Test
    public void TestgetMaterial() {
        assertEquals("Toon wood", sitar.getMaterial());
    }

    @Test
    public void TestgetNumberOfStrings() {
        assertEquals(21, sitar.getNumberOfStrings());
    }


}
