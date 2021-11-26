package arrays;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int [] myFirstArray = {4, 5, 10};
        String [] mySecondArray = {"Europe", "Africa", "America"};
        int [] myDefaultArray = new int[5];
        myDefaultArray[4] = 23;
        myDefaultArray[1] = 103;

        System.out.println("Print the array directly");
        System.out.println(Arrays.toString(myFirstArray));

        System.out.println("Print the elements using indexes manual");
        System.out.println(myFirstArray[0]);
        System.out.println(myFirstArray[1]);
        System.out.println(myFirstArray[2]);

        System.out.println("Print the elements using for loop");
        for (int i = 0; i < myFirstArray.length; i++){
            System.out.println(myFirstArray[i]);
        }
        System.out.println("Not Sorted:");
        for (int i = 0; i < mySecondArray.length; i++){
            System.out.println(mySecondArray[i]);
        }

        System.out.println("Sorted:");
        Arrays.sort(mySecondArray);
        for (int i = 0; i < mySecondArray.length; i++){
            System.out.println(mySecondArray[i]);
        }

        System.out.println("Default values of the array:");
        for (int i = 0; i < myDefaultArray.length; i++){
            System.out.println(myDefaultArray[i]);
        }
    }
}
