package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

       int[] arr1={10,20,30};
       int[] arr2={20,30,40};

       int[] merge=merge(arr1,arr2);

        System.out.println(Arrays.toString(merge));

        double[] arr3={10.5,20.5,30.5};
        double[] arr4={20.5,30.5,40.5};

        double[] merge1=merge(arr3,arr4);
        System.out.println(Arrays.toString(merge1));



    }

    public static int[] merge(int[] arr1,int[] arr2){

        int[] result= new int[arr1.length+ arr2.length];
        int i=0;

        for (int each : arr1) {
            result[i++]=each;
        }
        for (int each : arr2) {
            result[i++]=each;
        }
        return result;
    }

    public static double[] merge(double[] arr1,double[] arr2){

        double[] result= new double[arr1.length+ arr2.length];
        int i=0;

        for (double each : arr1) {
            result[i++]=each;
        }
        for (double each : arr2) {
            result[i++]=each;
        }
        return result;
    }


    public static char[] merge(char[] arr1,char[] arr2){

        char[] result= new char[arr1.length+ arr2.length];
        int i=0;

        for (char each : arr1) {
            result[i++]=each;
        }
        for (char each : arr2) {
            result[i++]=each;
        }
        return result;
    }

    public static String[] merge(String[] arr1,String[] arr2){

        String[] result= new String[arr1.length+ arr2.length];
        int i=0;

        for (String each : arr1) {
            result[i++]=each;
        }
        for (String each : arr2) {
            result[i++]=each;
        }
        return result;
    }


}



/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
 */