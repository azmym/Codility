package oddOccurrencesInArray;

public class Solution2 {

	public static void main(String[] args) {
		System.out.println(new Solution2().solution( new int []{9,3,9,3,9,7,9}));
	}

	public int solution(int[] A) {
		if (A.length==1)
            return A[0];
        int result = 0;
        for (int i=0; i<A.length; i++)
        	result ^= A[i];
        return result;
	}

}
