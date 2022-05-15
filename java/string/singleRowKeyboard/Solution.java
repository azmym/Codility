package string.singleRowKeyboard;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     *
     * Runtime: 8 ms
     * faster than 52.67% of Java online submissions for Single-Row Keyboard.
     * Memory Usage: 42.9 MB.
     */
    public int calculateTime(String keyboard, String word) {
        final Map<Character,Integer> storage = new HashMap<>();
        for(int i = 0; i<keyboard.length();i++){
            storage.put(keyboard.charAt(i),i);
        }
        int currentFinger = 0;
        int result =0;
        for(char c : word.toCharArray()){
            int nextMovement = storage.get(c);
            result += Math.abs(currentFinger - nextMovement);
            currentFinger = nextMovement;
        }

        return result;
    }

    /**
     *
     * Runtime: 4 ms
     * faster than 92.48% of Java online submissions for Single-Row Keyboard.
     * Memory Usage: 42.6 MB
     */
    public int calculateTime2(String keyboard, String word) {
        int[] keyIndex = new int[26];
        for(int i = 0; i<keyboard.length();i++){
            keyIndex[keyboard.charAt(i)-'a']=i;
        }
        int currentFinger = 0;
        int result =0;
        for(char c : word.toCharArray()){
            int nextMovement = keyIndex[c-'a'];
            result += Math.abs(currentFinger - nextMovement);
            currentFinger = nextMovement;
        }

        return result;
    }
}
