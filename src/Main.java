import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String[] words = {"Red", "Blue", "Green", "Yellow",
                "Red", "Orange", "Purple", "Pink",
                "Hello", "Black", "Green", "Orange"};

        UniqueWordsAndTheirCounting(words);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add(12345, "Ivan");
        telephoneDirectory.add(321, "Vlad");
        telephoneDirectory.add(2222, "Ivan");

        telephoneDirectory.get("Ivan");

    }

    // Вывод уникальных слов и их подсчет
    static void UniqueWordsAndTheirCounting(String[] arrayOfWords) {
        Map<String, Integer> wordsSet = new HashMap<>();

        for (String word : arrayOfWords) {
            wordsSet.merge(word, 1, Integer::sum);
        }

        System.out.println("Уникальные слова: " + wordsSet.keySet());

        System.out.println("Количество вхождений каждого слова:");
        for (String word : wordsSet.keySet()) {
            System.out.println(word + " - " + wordsSet.get(word));
        }
    }
}