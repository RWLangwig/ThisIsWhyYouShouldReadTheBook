package com.dtcc.exams.part3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class SpeedComparatorTest {

    @Test
    public void testArraySort(){
        Animal horse = (Animal)new Horse();
        Animal peregrinFalcon = (Animal)new PeregrineFalcon();
        Animal redRobin = (Animal)new RedRobin();

        Animal[] animals = {redRobin, horse, peregrinFalcon};
        Comparator comparator = (Comparator)new SpeedComparator();
        Arrays.sort(animals, comparator);

        Assert.assertEquals(horse, animals[0]);
        Assert.assertEquals(peregrinFalcon, animals[1]);
        Assert.assertEquals(redRobin, animals[2]);
    }

}
