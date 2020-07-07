package insertionSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * sort list based on number of characters and consider the preserve original order
 * input  : [aa,Aa,AA,aA,a,bb,Bb,BB]
 * output : [aa,Aa,AA,aA,bb,Bb,BB,a]
 */
public class Example {

    public static void main(String[] args) {
        String[] list = {"aa", "Aa", "AA", "aA", "a", "bb", "Bb", "BB"};
        System.out.println(Arrays.toString(list));
        sort(list);
        System.out.println(Arrays.toString(list));
    }

    private static void sort(String[] list) {
        Map<String, Integer> playBook = new HashMap();
        for (String value : list) {
            String upperValue = value.toUpperCase();
            playBook.put(upperValue, playBook.getOrDefault(upperValue, 0) + 1);
        }
        for(int i=1; i<list.length; i++){
            int j = i;
            String temp = list[i];
            while(j >0 && (playBook.get(list[j-1].toUpperCase()) < playBook.get(temp.toUpperCase()))){
                list[j] = list[j-1];
                j--;
            }
            list[j] = temp;
        }
    }
}
