package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("Super Mario".equals(name)) {
            System.out.println("Start - Super Mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
