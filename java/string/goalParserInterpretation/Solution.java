package string.goalParserInterpretation;

public class Solution {

    //Runtime: 1 ms, faster than 81.83% of Java online submissions for Goal Parser Interpretation.
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
