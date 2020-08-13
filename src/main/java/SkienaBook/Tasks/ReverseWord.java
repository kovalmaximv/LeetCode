package SkienaBook.Tasks;

import java.util.LinkedList;
import java.util.List;

public class ReverseWord {

    public List<Character> reverse(String sentence) {
        List<Character> list = new LinkedList<>();
        int n = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                list.add(0, ' ');
                n = 0;
            } else {
                list.add(n, sentence.charAt(i));
                n++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        System.out.println(reverseWord.reverse("My name is Kris").toString());
    }
}
