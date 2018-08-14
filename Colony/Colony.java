import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Colony {

    public List<Integer> cellCompete(int[] states, int days) {
        for (int j = 0; j < days; days--) {
            int[] temp = new int[states.length];
            int prevCell = 0;
            for (int i = 0; i < states.length; i++) {
                int nextCell = (i == (states.length) - 1) ? 0 : states[i+1];
                temp[i] = statesRule(prevCell, nextCell);
                prevCell = states[i];
            }
            states = temp;
        }

        return Arrays.stream(states).boxed().collect(Collectors.toList());

    }

    private int statesRule(int prevCell, int nextCell) {
        return (prevCell == nextCell) ? 0 : 1;
    }


    public static void main(String[] args) {
        System.out.print(Arrays.toString(new Colony().cellCompete(new int[]{1, 0, 0, 0, 0, 1, 0, 0}, 1).toArray()));
    }
}
