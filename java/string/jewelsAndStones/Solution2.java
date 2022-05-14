package string.jewelsAndStones;

public class Solution2 {
    public int numJewelsInStones(String jewels, String stones) {
        int result= 0;
        for(char stone : stones.toCharArray()){
            if (jewels.contains(String.valueOf(stone))) result++;
        }
        return result;
    }
}
