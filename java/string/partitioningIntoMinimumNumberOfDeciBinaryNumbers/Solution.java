package string.partitioningIntoMinimumNumberOfDeciBinaryNumbers;

import java.math.BigInteger;

public class Solution {

    public int minPartitions(String n) {
        int maximum = 0;
        for(int i=0;i<n.length();i++){
            maximum = Math.max(maximum, n.charAt(i)-'0');
        }
        return maximum;
    }

    public int minPartitions1(String n) {
        int result =0;
        for(int i=9;i<=0;i--){
            if(n.contains(String.valueOf(i))){
                result = i;
                break;
            }
        }
        return result;
    }
}
