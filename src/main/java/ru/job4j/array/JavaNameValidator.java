package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean check = !(name.isEmpty()) && isLowerLatinLetter(name.codePointAt(0));
        if (check) {
            for (int i = 1; i < name.length(); i++) {
                if (!(isSpecialSymbol(name.codePointAt(i))) && !(isUpperLatinLetter(name.codePointAt(i))) && !(isLowerLatinLetter(name.codePointAt(i))) && !(Character.isDigit(name.codePointAt(i)))) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static boolean isSpecialSymbol(int code) {
         return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}