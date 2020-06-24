package binaryGap;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().solution( 328));
	}

	public int solution(int N) {
		int result = 0;
		String binaryValue = Integer.toBinaryString(N);
		if (binaryValue.contains("0")){
			char[] charArray = binaryValue.toCharArray();
			StringBuffer temp = new StringBuffer();
			int indecator = 0;
			for(int i=0 ; i<charArray.length;i++){
				if(charArray[i]=='1'){
					if(indecator == 1){
						temp.append(charArray[i]);
						result = (temp.length()-2 >result)? temp.length()-2:result;
						temp = new StringBuffer();
						temp.append('1');
						indecator = 1;
					}else{
						
						temp.append(charArray[i]);
						indecator = 1;
					}
				}else{
					if(indecator == 1){
						temp.append(charArray[i]);
					}
				}
			}
		}
		return result;
	}

}
