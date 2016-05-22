package ru.mail.sphere.poetry;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LiBo extends Author {

    public LiBo() {
        super(Arrays.asList(5, 7, 5), null);
    }

    @Override
    public String write() {
        {
            Map<Integer, List<PoetryString>> mind = dataMiner.mine();

            StringBuilder builder = new StringBuilder();

            for (Integer length : lengths) {
                List<PoetryString> allOfLength = mind.get(length);
                builder.append(allOfLength.get(randomGenerator.nextInt(allOfLength.size())).getOriginalString())
                        .append('\n');
            }

            return builder.toString();
        }
    }
}
