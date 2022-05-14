package string.jewelsAndStones;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        Set<Character> jSet = new HashSet();
        for (char j : jewels.toCharArray()) {
            jSet.add(j);
        }
        for (char stone : stones.toCharArray()) {
            if (jSet.contains(stone)) {
                result++;
            }
        }
        return result;
    }
}
