package string.finalValueofVariableAfterPerformingOperations;

import java.util.Arrays;

public class Solution2 {

    public int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations).mapToInt(operation -> operation.charAt(1) == '+' ? 1 : -1).sum();
    }

}
