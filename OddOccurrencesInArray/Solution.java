import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().solution( new int []{9,3,9,3,9,7,9}));
	}

	public int solution(int[] A) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int a : A){
			if(map.containsKey(a)){
				map.put(a, map.get(a)+1);
			}else{
				map.put(a,1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    if(entry.getValue()%2 > 0) result=entry.getKey();
		}
		return result;
	}

}
