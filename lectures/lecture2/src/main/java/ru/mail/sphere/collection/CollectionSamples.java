package ru.mail.sphere.collection;

import com.sun.javafx.binding.StringFormatter;

import java.util.*;

public class CollectionSamples {

    public static List<Integer> descendingSort(List<Integer> numbers) {
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return y - x;
            }
        });
        return numbers;
    }

    /**
     * Эквивалентная версия с использование лямбда-выражения
     */
    public static List<Integer> descendingSort_FunctionalWay(List<Integer> numbers) {
        Collections.sort(numbers, (Integer x, Integer y) -> y - x);
        return numbers;
    }

    public static <T> List<T> getUnique(List<T> ts) {
        if (ts == null) {
            return null;
        }

        Set<T> unique = new HashSet<>(ts);
        return new LinkedList<>(unique);
    }

    public static void printList_bad(List<Object> list) {
        for (Object elem : list) {
            System.out.println("elem " + elem);
        }
    }

    public static void printList_good(List<?> list) {
        for (Object elem : list) {
            System.out.println("elem " + elem);
        }
    }

    public static String toString(Map<?, ?> anyMap) {
        StringBuilder builder = new StringBuilder("Map: {");
        for (Map.Entry<?, ?> entry : anyMap.entrySet()) {
            builder.append(String.format("( %s -> %s ), ", entry.getKey(), entry.getValue()));
        }
        builder.append("}");
        return builder.toString();
    }

}
