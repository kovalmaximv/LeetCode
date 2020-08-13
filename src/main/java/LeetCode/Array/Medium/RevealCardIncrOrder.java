package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/reveal-cards-in-increasing-order/
// Medium
// a little bit problem with my bad solution and problem with best solution
public class RevealCardIncrOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        List<Integer> res = new ArrayList<>(deck.length);
        for (int i = deck.length - 1; i >= 0; i--) {
            shiftArray(res);
            res.add(0, deck[i]);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    private void shiftArray(List<Integer> list){
        if (list.size() == 0 || list.size() == 1) return;
        int lastElem = list.get(list.size() - 1);

        for (int i = list.size() - 1; i > 0; i--) {
            list.set(i, list.get(i - 1));
        }

        list.set(0, lastElem);
    }
}
