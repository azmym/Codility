package string.jewelsAndStones;

public class Solution3 {
    public int numJewelsInStones(String jewels, String stones) {
        return stones.replaceAll("[^" + jewels + "]", "").length();
    }
}
