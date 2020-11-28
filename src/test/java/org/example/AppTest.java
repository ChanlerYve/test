package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

/*
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

   @Test
    public void checkMonth1() {
        App app = new App();
        app.setMonth(1);
        app.checkMonth();
        assertEquals(1, app.getMonFlag());


    }

    @Test
    public void checkMonth2() {
        App app = new App();
        app.setMonth(0);
        app.checkMonth();
        assertEquals(0, app.getMonFlag());


    }*/

    @Test
    public void checkDay1() {
        App app = new App();
        app.setMonth(12);
        app.setDay(31);
        app.checkMonth();
        assertEquals(1, app.getMonFlag());
        assertEquals(1, app.getDayFlag());
    }

    @Test
    public void checkDay2() {
        App app = new App();
        app.setMonth(12);
        app.setDay(-1);
        app.checkDay();
        assertEquals(1, app.getMonFlag());
        assertEquals(0, app.getDayFlag());
    }

    @Test
    public void checkDay3() {
        App app = new App();
        app.setMonth(13);
        app.setDay(1);
        app.judgeAll();
        assertEquals(0, app.getMonFlag());
        assertEquals(0, app.getDayFlag());
    }

    @Test
    public void checkDay4() {
        App app = new App();
        app.setMonth(0);
        app.setDay(0);
        app.judgeAll();
        assertEquals(0, app.getMonFlag());
        assertEquals(0, app.getDayFlag());
    }

}
