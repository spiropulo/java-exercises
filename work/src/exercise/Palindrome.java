package exercise;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static boolean isPalindrome(String input1) {
        input1 = input1.replace(" ", "");

        char[] word = input1.toCharArray();
        Map<Character, Integer> tracker = new HashMap<>();
        int count = 0;

        for (Character c : word) {
            if (tracker.containsKey(c)) {
                int val = tracker.get(c) + 1;
                if (val % 2 == 0) {
                    count -= 1;
                } else {
                    count += 1;
                }
            } else {
                tracker.put(c, 1);
                count += 1;
            }
        }

        return count <= 1;
    }
}
