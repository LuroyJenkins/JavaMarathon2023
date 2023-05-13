package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        Map<String, Integer> words = dictionary(file);
        popularWords(words);
    }

    public static Map<String, Integer> dictionary(File file) {
        try {
            Map<String, Integer> map = new HashMap<>();
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!map.containsKey(word))
                    map.put(word, 1);
                else
                    map.replace(word, map.get(word), map.get(word) + 1);
            }
            return map;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }

    public static void popularWords(Map<String, Integer> map) {
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .limit(100)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
