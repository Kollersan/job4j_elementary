package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {2, 3, 5, 8, 11};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then2() {
        int[] data = {2, 3, 5, 8, 11};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayFrom3To5Has4Then5() {
        int[] data = {1, 2, 3, 4, 5, 6};
        int el = 4;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayFrom3To5Has6ThenMinusOne() {
        int[] data = {1, 2, 3, 4, 5, 6};
        int el = 6;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}