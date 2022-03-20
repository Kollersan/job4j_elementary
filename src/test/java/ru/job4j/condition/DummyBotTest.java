package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, бот.";
        String result = DummyBot.answer(in);
        String excepted = "Привет, умник.";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String excepted = "До скорой встречи.";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String result = DummyBot.answer(in);
        String excepted = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(excepted, result);
    }
}