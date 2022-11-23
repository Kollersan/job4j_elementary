package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (!name.isEmpty()) {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isUpperCase(name.codePointAt(0)) || isDigit(name.codePointAt(0))) {
                    valid = false;
                    break;
                } else if (isSpecialSymbol(code) || isDigit(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)) {
                    valid = true;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valid = false;
        if (code == 36 || code == 95) {
            valid = true;
        }
        return valid;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = false;
        if (code >= 65 && code <= 90) {
            valid = true;
        }
        return valid;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean valid = false;
        if (code >= 97 && code <= 122) {
            valid = true;
        }
        return valid;
    }

    public static boolean isDigit(int code) {
        boolean valid = false;
        if (code >= 48 && code <= 57) {
            valid = true;
        }
        return valid;
    }

    public static boolean isUpperCase(int code) {
        boolean valid = false;
        if (code >= 65 && code <= 90) {
            valid = true;
        }
        return valid;
    }
}
