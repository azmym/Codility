package BucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        int arr[] = new int[100];

        //Generating 100 random numbers in the range of 0-100
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100) + 100;
        }

        System.out.println("Array before Sorting: ");
        printArray(arr);

        bucketSort(arr);

        System.out.println("\n\nArray after Sorting: ");

        printArray(arr);

    }

    private static void bucketSort(int[] arr) {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            maxValue = Math.max(value, maxValue);
        }
        //Create an array of buckets
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        for (int value : arr) {
            int bucketNumber = (int) Math.ceil((value * numberOfBuckets * 1.0) / maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println("\n\nPrinting buckets before Sorting...");
        printBucket(buckets);

        for(ArrayList<Integer> bucket: buckets) {
            Collections.sort(bucket);
        }

        System.out.println("\n\nPrinting buckets after Sorting...");
        printBucket(buckets);

        int index=0;
        for(ArrayList<Integer> bucket: buckets) {
            for(int value: bucket) {
                arr[index] = value;
                index++;
            }
        }
    }

    public static void printArray(int arr[]) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            tmp++;
            if (tmp == 20) {
                System.out.println();
                tmp = 0;
            }
        }
    }

    public static void printBucket(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#" + i + " :");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + "  ");
            }
        }
    }
}
