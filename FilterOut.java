import java.util.*;

class FilterOut {
    void filterWords(String[] words, String letter) {
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].contains(letter))) {
                System.out.print(words[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        FilterOut obj = new FilterOut();
        String[] words = { "the", "dog", "got", "a", "bone", "great", "cot" };
        String letter = "o";
        obj.filterWords(words, letter);
    }
}