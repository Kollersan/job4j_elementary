package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2to0Then2() {
        Max max = new Max();
        int result = max.max(2, 0);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10to100Then100() {
        Max max = new Max();
        int result = max.max(10, 100);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }
}