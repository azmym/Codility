package string.maximumNumberOfWordsFoundInSentences;

import java.util.Arrays;

public class Solution {

    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences).mapToInt(s -> s.split(" ").length).max().orElse(0);
    }
}
