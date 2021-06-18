package JavaHard.Collections.SetInterface;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String, Integer> word = new HashMap<>();
        System.out.println("Please enter some text");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String[] arrString = string.replaceAll("[^а-яА-Я]", "").split(" ");
        for (String token : arrString) {
            String lowerCase = token.toLowerCase();
            Integer integer = word.get(lowerCase);
            if (integer == null) {
                word.put(lowerCase, 1);
            } else {
                word.put(lowerCase, integer + 1);
            }
        }
        Set<WordWrapper> wordWrappers = convertToSet(word);
        printSet(wordWrappers);
    }

    private static void printSet(Set<WordWrapper> wordWrappers) {
        for (WordWrapper wordWrapper : wordWrappers) {
            System.out.println(wordWrapper);
        }
    }

    private static Set<WordWrapper> convertToSet(Map<String, Integer> word) {
        Set<WordWrapper> wordWrappers = new TreeSet<>();
        for (Map.Entry<String, Integer> e : word.entrySet()) {
            wordWrappers.add(new WordWrapper(e.getKey(), e.getValue()));
        }
        return Collections.unmodifiableSet(wordWrappers);
    }

    private static void printMap(Map<String, Integer> word) {
        Map<String, Integer> map = new TreeMap<>(word);
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.printf("%-10s%-10s\n", key, word.get(key));
        }
    }
}
