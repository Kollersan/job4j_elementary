package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3to1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4to4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}