package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1To2() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2To4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 5, 4, 3, 6};
        Assert.assertArrayEquals(expected, result);
    }
}