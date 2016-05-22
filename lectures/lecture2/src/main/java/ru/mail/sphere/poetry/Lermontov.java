package ru.mail.sphere.poetry;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//assertEquals(9, new PoetryString("Скажи ка дядя ведь не даром").getLength());
//        assertEquals(9, new PoetryString("Москва спаленная пожаром").getLength());
//        assertEquals(6, new PoetryString("Французу отдана").getLength());
//        assertEquals(9, new PoetryString("Ведь были ж схватки боевые").getLength());
//        assertEquals(9, new PoetryString("Да говорят, еще какие").getLength());
//        assertEquals(9, new PoetryString("Недаром помнит вся Россия").getLength());
//        assertEquals(6, new PoetryString("Про день Бородина").getLength());
public class Lermontov extends Author {

    public Lermontov() {
        super(Arrays.asList(9, 9, 6, 9, 9, 9, 6), "aabcccb");
    }

    @Override
    public String write() {
        {
            Map<Integer, List<PoetryString>> mind = dataMiner.mine();


            int first = lengths.get(0);
            List<PoetryString> allOfLength = mind.get(first);
            PoetryString firstLine = allOfLength.get(randomGenerator.nextInt(allOfLength.size()));
            String planeLine = firstLine.getOriginalString();
            String lastTwo = planeLine.substring(planeLine.length() - 2);


            String savedLine = null;
            int second = lengths.get(1);
            List<PoetryString> allOfLength1 = mind.get(second);
            for (PoetryString poetryString : allOfLength1) {
                if (poetryString.equals(firstLine)) {
                    continue;
                }

                String planeLine1 = poetryString.getOriginalString();
                String lastTwo1 = planeLine1.substring(planeLine1.length() - 2);
                if (lastTwo1.equals(lastTwo)) {
                    savedLine = planeLine1;
                }
            }

            System.out.println(planeLine);
            System.out.println(savedLine);

            //PoetryString secondLine = allOfLength.get(randomGenerator.nextInt(allOfLength.size()));



//            StringBuilder builder = new StringBuilder();
//            for (Integer length : lengths) {
//                List<PoetryString> allOfLength = mind.get(length);
//                builder.append(allOfLength.get(randomGenerator.nextInt(allOfLength.size())).getOriginalString())
//                        .append('\n');
//            }

            return null;//builder.toString();
        }
    }
}
