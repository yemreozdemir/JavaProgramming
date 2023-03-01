package day25_CustomMethods_Overloading;

public class MaxNumber {

    public static void main(String[] args) {


        int[] arr1={3,4,6,54,23,76,89,145,43};
        int maxNum=max(arr1);
        System.out.println("max = " + maxNum);

        double[] arr2={3.5,4.4,6.4,54.8,23.9,76.7,89.1,145.3,43.4};
        double maxNum1=max(arr2);
        System.out.println("max = " + maxNum1);







    }

    public static int max(int[] array){

        int max=array[0];

        for (int each : array) {
            if(each>max){
                max=each;
            }

        }

        return max;
    }

    public static double max(double[] array){

        double max=array[0];

        for (double each : array) {
            if(each>max){
                max=each;
            }

        }

        return max;
    }


    public static long max(long[] array){

        long max=array[0];

        for (long each : array) {
            if(each>max){
                max=each;
            }

        }

        return max;
    }

    public static short max(short[] array){

        short max=array[0];

        for (short each : array) {
            if(each>max){
                max=each;
            }

        }

        return max;
    }

    public static float max(float[] array){

        float max=array[0];

        for (float each : array) {
            if(each>max){
                max=each;
            }

        }

        return max;
    }

    public static byte max(byte[] array){

        byte max=array[0];

        for (byte each : array) {
            if(each>max){
                max=each;
            }

        }

        return max;
    }



}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */