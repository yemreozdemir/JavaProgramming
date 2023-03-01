package day24_CustomMethod_Return;

import java.util.Arrays;

public class Merge_Task {

    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={4,5,6};

        int[] merge= merge(arr1,arr2);

        System.out.println(Arrays.toString(merge));

    }

    public static int[] merge(int[]arr1,int[]arr2){
        int[] result= new int[arr1.length + arr2.length];
        int i =0;

        for(int each : arr1){
            result[i++]=each;
        }
        for(int each :arr2){
            result[i++]=each;
        }
        return result;
    }
}
/*
7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

 */