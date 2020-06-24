/**
 * Time complexity O(n2)
 * Space complexity O(1)
 * in space sort algorithem
 */
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 15, 5, 6};
        System.out.println("Array to be sorted...");
        printArray(arr);

        sort(arr);

        System.out.println("Sorted Array...");
        printArray(arr);
    }

    public static void sort(int[] list) {
        int length = list.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    list[j] = list[j] + list[j + 1];
                    list[j + 1] = list[j] - list[j + 1];
                    list[j] = list[j] - list[j + 1];
                }
            }
        }
    }

    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
