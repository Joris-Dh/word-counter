package org.joris;

import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.HashMap;

@Component
public class WordCounter {
    private String sentence;

    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    public void wordCounter() {
        sentence = sentence.toLowerCase().replace(".", "").replace(",", "");
        String[] words = sentence.split(" ");

        // Use a HashMap to store each word and its frequency
        Map<String, Integer> hashmap = new HashMap<>();

        for (String word : words) {
            // Increment the count for each word in the map
            hashmap.put(word, hashmap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Occurrences");
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
