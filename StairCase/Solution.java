/* Staircase
Your teacher has given you the task to draw the structure of a staircase. Being an expert programmer, you decided to make a program for the same. You are given the height of the staircase. You need to print a staircase as shown in the example.
Input Format
You are given an integer N depicting the height of the staircase.
Constraints 
1≤ N ≤100
Output Format
Draw a staircase of height N in the format given below.
For example:
     #
    ##
   ###
  ####
 #####
######
Staircase of height 6, note that last line has 0 spaces before it.
*/
public class Solution {

	public static void main(String[] args) {
		new Solution().solution(6);
	}

	public void solution(int n) {
		String result = "";
		String temp = "";
		for(int i=0 ; i<n ; i++){
			temp +=" ";
		}
		for (int i=0 ; i<n ; i++){
			result+="#";
			temp = temp.substring(1);
			System.out.println(temp+result);
		}
	}
	
}
