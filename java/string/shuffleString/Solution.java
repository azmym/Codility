package string.shuffleString;

public class Solution {

    /**
     * Runtime: 1 ms.
     * faster than 94.05% of Java online submissions for Shuffle String.
     * Memory Usage: 42.5 MB
     */
    public String restoreString(String s, int[] indices) {
        final char[] chars = s.toCharArray();
        final char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[indices[i]] = chars[i];
        }
        return new String(result);
    }

    /**
     * Runtime: 1 ms.
     * faster than 94.05% of Java online submissions for Shuffle String.
     * Memory Usage: 42.1 MB
     */
    public String restoreString2(String s, int[] indices) {
        final char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
