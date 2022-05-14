package string.maximumNumberOfWordsFoundInSentences;

public class Solution2 {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences){
            max = Math.max(max,sentence.split(" ").length);
        }
        return max;
    }
}
