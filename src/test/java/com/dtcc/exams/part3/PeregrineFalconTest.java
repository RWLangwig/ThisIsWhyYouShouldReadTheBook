package com.dtcc.exams.part3;

import org.junit.Assert;
import org.junit.Test;

public class PeregrineFalconTest {

    @Test
    public void testMove() {
        Bird peregrinFalcon = (Bird)(Object)new PeregrineFalcon();
        String expected = "fly";

        String actual = peregrinFalcon.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal peregrinFalcon = (Animal)(Object)new PeregrineFalcon();
        String expected = "brown";

        String actual = peregrinFalcon.color();

        Assert.assertEquals(expected, actual);
    }
}
