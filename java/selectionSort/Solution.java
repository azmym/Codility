package selectionSort;

/**
 * Time complicity: O(n2).
 * Space complicity: O(1).
 * in space algorithm.
 */
public class Solution {

    public static void main(String[] args) {
        int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

        System.out.println("User entered Array: ");
        printArray(array);

        selectionSort(array);

        System.out.println("\n\nAfter sorting: ");
        printArray(array);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimumIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minimumIndex]){
                    minimumIndex = j;
                }
            }
            if (minimumIndex != i) {
                int temp = array[i];
                array[i] = array[minimumIndex];
                array[minimumIndex] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
