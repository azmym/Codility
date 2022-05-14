package string.removeVowelsFromAString;

public class Solution {
    public static String removeVowels(String s) {
        char[] result = new char[s.length()];
        int index =0 ;
        for(char c : s.toCharArray()){
            if (c != 'a' && c != 'e' && c != 'i' && c !='o' && c != 'u') {
                result[index++] = c;
            }
        }
        return new String(result,0,index);
    }
}
