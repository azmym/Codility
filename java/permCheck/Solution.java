package permCheck;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//A non-empty zero-indexed array A consisting of N integers is given.
//
//A permutation is a sequence containing each element from 1 to N once, and only once.
//
//For example, array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//is a permutation, but array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//is not a permutation, because value 2 is missing.
//
//The goal is to check whether array A is a permutation.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
//
//For example, given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//the function should return 1.
//
//Given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//the function should return 0.
//
//Assume that:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [1..1,000,000,000].
//Complexity:
//
//expected worst-case time complexity is O(N);
//expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments)

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int []{4,1,3,2}));
	}
	
	public int solution(int[] A) {
		Map<Integer, Integer> values = new HashMap<Integer, Integer>();
		int result = 1;
		for(int i=1 ; i<=A.length;i++){
			values.put(i, 0);
		}
		for(int i=0 ; i<A.length;i++){
			if(null !=values.get(A[i])) values.put(A[i], values.get(A[i])+1);
			else values.put(A[i],1);
		}
		for(Entry<Integer, Integer> val:values.entrySet()){
			if(val.getValue() != 1){
				result = 0;
				break;
			}
		}
		
		return result;
	}
	
}
