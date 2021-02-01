package jbased.test;

public class Base64Increment {
    char[] base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] chars;

    public Base64Increment(int size) {
        chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = 'A';
        }
    }

    public void increment() {
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 'z') {
                chars[i] = 'A';
            } else {
                chars[i] = next(chars[i]);
                return;
            }
        }
    }

    private char next(char start) {
        for (int i = 0; i < base64chars.length - 1; i++) {
            if (base64chars[i] == start) return base64chars[i + 1];
        }
        return 'A';
    }

    public String getCurrentValue() {
        return new String(chars);
    }
}
