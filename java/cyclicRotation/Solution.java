package cyclicRotation;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().solution( new int []{3, 8, 9, 7, 6},1)));
	}

	 public int[] solution(int[] A, int K) {
	       if(K!=0&&A.length>0){
	    	   int first= A[A.length-1];
	    	   for(int i=A.length-1 ;i>0;i--){
	    		   A[i]= A[i-1];
	    		   if(i==1) A[i-1]=first;
	    	   }
	    	   return solution(A,--K);
	       }
	       return A;
	    }

}
