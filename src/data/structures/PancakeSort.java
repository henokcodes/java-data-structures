package data.structures;

import java.util.Arrays;

public class PancakeSort {

    public static void main(String[] args) {
        int[] a = {1,5,4,3,2};
        int[] b = {};
        System.out.println(Arrays.toString(pancakeSort(a)));
    }

    static int[] pancakeSort(int[] arr) {

        for (int curr_size = arr.length; curr_size > 1; --curr_size)
        {
            // Find index of the max element
            int mi = findMax(arr, curr_size);

            // Move the maximum element  to end of current array
            // if it's not already at the end
            if (mi != curr_size-1)
            {
                // first move maximum number to beginning
                flip(arr, mi);
                //  move the maximum number to end by reversing current array
                flip(arr, curr_size-1);
            }
        }
        return arr;
    }

    // Returns index of the maximum element in arr[0..n-1]
    static  int findMax(int[] arr, int n){
        int max,i;
        for( max = 0,i=0;i<n;i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    //Reverses the given array
    static void flip(int[] arr, int k) {
        int start = 0;
        int temp;
        while(start<k){
             temp = arr[start];
             arr[start] = arr[k];
             arr[k] = temp;

             k--;start++;
        }
    }

    //find the index of maximum element
    //flip arr with max element index + 1
    //flip to make max number at the end
    //repeat until sorted;


    }
