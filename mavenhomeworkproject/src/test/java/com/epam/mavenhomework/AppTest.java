package com.epam.mavenhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App testApp = new App();

    @Test
    public void testGetInfo()
    {
        assertEquals("OK", testApp.getInfo());
        assertNotEquals("NotOk", testApp.getInfo());
    }
}
