package com.opensource.dada.dsa.problems;

public class SumPresentInSortedArray {
    /** Problem:
    list1 = [1,2,3,4,5,6,7] is sorted,
     find any 2 element's sum in array  should be 8  ;
     create validate method
     boolean checksum(list, sum){  }
     if we find such combination return true else false;
     list1 should validate as true
    list2 = [1,2,3,4,8,9]   should validate as false
    **/
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] list2 = {1, 2, 3, 4, 8, 9};
        int sum = 8;
        boolean result = checkSum(list1, sum);
        System.out.println("list1 Result: " + result);

        result = checkSum(list2, sum);
        System.out.println("list2 Result: " + result);
    }

    public static boolean checkSum(int[] list, int sum) {
        int startIndex = 0;
        int endIndex = list.length - 1;
        while (startIndex < endIndex) {
            int tempSum = list[startIndex] + list[endIndex];
            if (tempSum == sum) {
                return true;
            }
            if (tempSum < sum) {
                startIndex++;
            } else {
                endIndex--;
            }
        }

        return false;
    }
}
