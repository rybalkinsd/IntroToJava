package ru.mail.sphere.collection;

import java.util.*;

public abstract class PositiveNumbersCollection<T extends Number & Comparable<T>>
        extends AbstractCollection<T>
        implements Collection<T> {

    private List<T> elements = new ArrayList<>();

    public abstract boolean predicate(T t);

    @Override
    public boolean add(T t) {
        if (t == null) {
            throw new UnsupportedArgumentException("PositiveNumbersCollection::add - null is not supported");
        }
        if (!predicate(t)) {
            throw new UnsupportedArgumentException("PositiveNumbersCollection::add - !predicate(t)");
        }

        return elements.add(t);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c == null) {
            return false;
        }

        boolean modified = false;
        for (T t : c) {
            modified |= add(t);
        }

        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedArgumentException("PositiveNumbersCollection::remove - Object type is not supported");
    }

    public boolean remove(T t) {
        if (t == null) {
            return elements.remove(null);
        }
        if (!predicate(t)) {
            return false;
        }

        return elements.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

}
