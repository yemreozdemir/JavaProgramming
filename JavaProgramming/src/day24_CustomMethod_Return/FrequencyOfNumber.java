package day24_CustomMethod_Return;

public class FrequencyOfNumber {
    public static void main(String[] args) {

        int[] array1={1,1,1,1,1,2,2};
        int frequency= frequencyOfNumber(array1,1);
        System.out.println(frequency);

    }

    public static int frequencyOfNumber(int[]array,int number){
        int count =0;
        for(int each : array){
            if(each==number){
                count++;
            }
        }
        return count;
    }
}
/*
5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */