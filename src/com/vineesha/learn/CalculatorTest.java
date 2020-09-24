package com.vineesha.learn;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal=new Calculator();
    }
    @Test
    public void add() {
        int a=2;
        int b=1;
        int expected =3;
        int actual;
        actual= cal.add(a,b);
        assertEquals(expected, actual);
    }
    @Test
    public void sub() {
        int a=2;
        int b=1;
        int expected =1;
        int actual;
        actual= cal.sub(a,b);
        assertEquals(expected, actual);
    }
    @Test
    public void multiply() {
        int a=2;
        int b=1;
        int expected =2;
        int actual;
        actual= cal.multiply(a,b);
        assertEquals(expected, actual);
    }
    @Test
    public void div() {
        int a=2;
        int b=1;
        int expected =2;
        int actual;
        actual= cal.div(a,b);
        assertEquals(expected, actual);
    }
}