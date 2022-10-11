package LeetCode.Strings.Medium;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Medium

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    // O(n^2)
    /*
     * Идея: Берем точку i и точку j = i + 1. Пытаемся собрать максимально длинную строку с началом в точке i.
     * Так до тех пор, пока i < s.length() - 1.
     */
    public int slowApproach(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int i = 0;
        int j = 0;
        int maxCount = 0;

        Set<Character> uniqueSymbols = new HashSet<>();

        for(i = 0; i < s.length() - 1; i++) {
            uniqueSymbols.clear();
            uniqueSymbols.add(s.charAt(i));
            for (j = i + 1; j < s.length(); j++) {
                if (!uniqueSymbols.contains(s.charAt(j))) {
                    uniqueSymbols.add(s.charAt(j));
                } else {
                    if (uniqueSymbols.size() > maxCount) {
                        maxCount = uniqueSymbols.size();
                    }
                    break;
                }
            }

            if (j == s.length()) {
                if (uniqueSymbols.size() > maxCount) {
                    maxCount = uniqueSymbols.size();
                }
            }
        }

        return maxCount;
    }

    // O(2*n)
    /*
     * Идея: В Map будем хранить символ и количество раз, которое символ нам встретился.
     * Храним две точки самой длинной подстроки left и right.
     * Идем по строке слева направо увеличивая right. Если какой-то символ встретился минимум 2 раза, то двигаем левую
     * точку правее. Не забываем при этом уменьшить счетчик самого левого символа.
     *
     * На каждом шаге проверяем настоящую длину подстроки с максимальной.
     */
    public int fastApproach(String s) {
        Map<Character, Integer> data = new HashMap<>();

        int left = 0;
        int right = 0;
        int result = 0;

        while (right < s.length()) {
            Character currentChar = s.charAt(right);
            data.put(currentChar, data.getOrDefault(currentChar, 0) + 1);

            while (data.get(currentChar) > 1) {
                Character mostLeftCharacter = s.charAt(left);
                data.put(mostLeftCharacter, data.get(mostLeftCharacter) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);


            right++;
        }

        return result;
    }

}
