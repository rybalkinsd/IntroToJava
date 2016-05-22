package ru.mail.sphere.poetry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataMiner {

    private List<String> rawLines = new ArrayList<>();
    private List<String> lines;

    public DataMiner(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                rawLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        lines = purgeLines();
    }

    private List<String> purgeLines() {
        return rawLines.stream()
                .map(x -> x.replaceAll("[-.,!?'\";:)(0-9A-Za-z\\*]", ""))
                .map(String::trim)
                .filter(x -> x.length() > 0)
                .collect(Collectors.toList());
    }

    public Map<Integer, List<PoetryString>> mine() {
        return lines.stream()
                .map(PoetryString::new)
                .collect(Collectors.groupingBy(PoetryString::getLength));
    }

}
