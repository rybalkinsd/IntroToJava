package ru.mail.sphere.poetry;

import java.util.List;
import java.util.Random;

public abstract class Author {
    protected static final DataMiner dataMiner;
    protected static final Random randomGenerator = new Random();

    static {
        dataMiner = new DataMiner(Author.class.getResource("/WordsSet.txt").getPath());
    }

    protected final List<Integer> lengths;
    protected final String rhyme;

    protected Author(List<Integer> lengths, String rhyme) {
        this.lengths = lengths;
        this.rhyme = rhyme;
    }

    public abstract String write();
}
