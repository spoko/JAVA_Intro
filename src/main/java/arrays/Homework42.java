package arrays;

public class Homework42 {
    public static void main(String[] args) {
        int [] arrayInt = {5,6,2,7,2,7,8,3,35,1,78};
        printSumOfArrayElements(arrayInt);
    }

    public static void printSumOfArrayElements(int [] array){
        printArraySumOdd(array);
        printArraySumEven(array);
    }

    private static void printArraySumOdd(int [] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                sum += array[i];
            }
        }
        System.out.println("The sum of Odd numbers in the array is: " + sum);
    }

    private static  void printArraySumEven(int [] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("The sum of Even numbers in the array is: " + sum);
    }
}
