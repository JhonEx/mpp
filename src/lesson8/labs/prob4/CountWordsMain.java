package lesson8.labs.prob4;

import java.util.ArrayList;
import java.util.List;

public class CountWordsMain{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("abc");
        words.add("afr");
        words.add("fgh");
        words.add("dct");
        words.add("oku");
        words.add("jkl");

        System.out.println(countWords(words, 'c', 'd', 3));
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        return (int)words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains(c + ""))
                .filter(word -> !word.contains(d + ""))
                .count();
    }
}
