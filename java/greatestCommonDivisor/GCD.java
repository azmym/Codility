package greatestCommonDivisor;

import java.util.Arrays;

public class GCD {
    public int generalizedGCD(int num, int[] arr) {
        Arrays.sort(arr);
        int gcd = 1;

        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) gcd = i;
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.print(new GCD().generalizedGCD(5, new int[]{2, 4, 6, 8, 10}));
    }
}