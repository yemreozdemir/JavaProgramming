package day27_WrapperClasses;

import java.util.Arrays;

import static day27_WrapperClasses.InsertElement_Task.insert;

public class SwapElement_Task {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(swap(arr,2,4)));

        double[] arr1= {10.5, 23.5, 44.6,76.3,25.5};

        System.out.println(Arrays.toString(swap(arr1,0,4)));

    }

    public static int[] swap(int[] array,int i,int j){

        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;

    }

    public static double[] swap(double[] array,int i,int j){

        double temp=array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;

    }

    public static char[] swap(char[] array,int i,int j){

        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;

    }

    public static String[] swap(String[] array,int i,int j){

        String temp=array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;

    }


}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps
	the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array



 */