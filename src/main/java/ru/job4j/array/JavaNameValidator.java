package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || isUpperLatinLetter(name.codePointAt(0)) || isDigit(name.codePointAt(0))) {
            return false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!isSpecialSymbol(code) && !isDigit(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }

    public static boolean isDigit(int code) {
        return (code >= 48 && code <= 57);
    }
}
