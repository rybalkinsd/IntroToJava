package ru.mail.sphere.Stack;

import ru.mail.sphere.Stack.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class StackImpl<T> implements Stack<T> {

    private List<T> elements = new ArrayList<>();

    @Override
    public void push(T elem) {
        elements.add(elem);
    }

    @Override
    public T pop() {
        T elem = peek();
        if (elem == null) {
            throw new NoSuchElementException();
        }
        elements.remove(elements.size() - 1);
        return elem;
    }

    @Override
    public T peek() {
        return elements.size() == 0
                ? null
                : elements.get(elements.size() - 1);
    }
}










