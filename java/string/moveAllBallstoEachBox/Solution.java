package string.moveAllBallstoEachBox;

public class Solution {

    /**
     * Runtime: 385 ms.
     * faster than 12.76% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
     * Memory Usage: 48 MB.
     */
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int sum = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (i != j && boxes.charAt(j) == '1') {
                    sum += Math.abs(j - i);
                }
            }
            result[i] = sum;
        }
        return result;
    }

    /**
     * Runtime: 3 ms.
     * faster than 91.78% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
     * Memory Usage: 43.1 MB
     */
    public static int[] minOperations1(String boxes) {
        int[] res = new int[boxes.length()];
        for (int i = 0, ops = 0, cnt = 0; i < boxes.length(); ++i) {
            res[i] = ops;
            cnt += boxes.charAt(i) == '1' ? 1 : 0;
            ops += cnt;
        }
        for (int i = boxes.length() - 1, ops = 0, cnt = 0; i >= 0; --i) {
            res[i] += ops;
            cnt += boxes.charAt(i) == '1' ? 1 : 0;
            ops += cnt;
        }
        return res;
    }
}
