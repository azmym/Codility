package sortColors;

/**
 * /**
 *  * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *  *
 *  * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *  *
 *  * Note: You are not suppose to use the library's sort function for this problem.
 *  *
 *  * Example:
 *  *
 *  * Input: [2,0,2,1,1,0]
 *  * Output: [0,0,1,1,2,2]
 *  */
public class SortColors {

    public void sortColors(int[] nums) {
        int p0 = 0;
        int current = 0;
        int p2 = nums.length - 1;
        int temp;
        while (current <= p2) {
            if (nums[current] == 0) {
                temp = nums[p0];
                nums[p0++] = nums[current];
                nums[current++] = temp;
            } else if (nums[current] == 2) {
                temp = nums[p2];
                nums[p2--] = nums[current];
                nums[current] = temp;
            } else {
                current++;
            }
        }
    }
}
