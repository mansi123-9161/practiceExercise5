package com.stackroute.pe5;
import java.util.*;
public class CountWordFrequency {
    public String checkFrequency(String input) {
        if (input == null)
            return null;
        List<String> stringList = Arrays.asList(input.split("[\\W_]+"));
        Map<String, Integer> countFrequency = new HashMap<>();
        for (String string : stringList) {
            if (countFrequency.containsKey(string)) {
                countFrequency.replace(string, countFrequency.get(string) + 1);
            } else {
                countFrequency.put(string, 1);
            }
        }
        return countFrequency.toString();
    }
}
