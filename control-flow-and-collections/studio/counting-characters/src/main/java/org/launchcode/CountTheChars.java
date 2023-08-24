package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountTheChars {
    public static void countChars(String input) {
        char[] characters = input.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char letter : characters) {
            if (!counts.containsKey(letter)) {
                counts.put(letter, 1);
            } else {
                counts.put(letter, (counts.get(letter) + 1));
            }
        }
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(String.format("%s: %s", count.getKey(), count.getValue()));
        }
    }
}
