package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return -1;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        float in = 140;
        float outEu = Converter.rubleToEuro(in);
        float outDol = Converter.rubleToDollar(in);
        float expected = 2;
        boolean passedEu = expected == outEu;
        boolean passedDol = expected == outDol;
        System.out.println("140 rub are 2 Eu. Test result: " + passedEu);
        System.out.println("140 rub are 2 doll. Test result: " + passedDol);
    }
}
