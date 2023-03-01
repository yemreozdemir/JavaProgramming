package day21_ForEachLoop;

import java.util.Arrays;

public class EvenAndOdd_Task {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int even = 0, odd = 0;

        for (int each : arr) {
            if (each % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(Arrays.toString(arr)+" even numbers has " + even + " and odd number has " + odd);
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */