package ru.mail.sphere.poetry;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;

public class PoetryString implements Comparable<PoetryString> {
    private static final HashSet<Character> VOWELS = new HashSet<>(Arrays.asList('а', 'о', 'у', 'э', 'ы', 'я', 'ю', 'ё', 'е', 'и', 'и', 'и'));

    private final String originalString;
    private final int length;

    PoetryString(String originalString) {
        this.originalString = originalString;
        this.length = calculateLength(originalString);
    }

    public int calculateLength(String string) {
        int length = 0;
        for (char vowel : VOWELS) {
            length += StringUtils.countMatches(string.toLowerCase(), vowel);
        }
        return length;
    }

    @Override
    public int compareTo(PoetryString o) {
        return this.length == o.length
                ? this.originalString.compareTo(o.originalString)
                : this.length - o.length;
    }

    @Override
    public String toString() {
        return "PoetryString{" +
                "originalString='" + originalString + '\'' +
                ", length=" + length +
                '}';
    }

    public int getLength() {
        return length;
    }
    public String getOriginalString() {
        return originalString;
    }
}
