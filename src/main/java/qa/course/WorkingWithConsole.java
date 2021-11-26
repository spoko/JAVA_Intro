package qa.course;

import java.util.Scanner;

public class WorkingWithConsole
{
    String email = "Ibraim2.0@gmail.com";
    public static void main(String[] args)
    {
        String firstInput;
        String SecondInput;

        Scanner input = new Scanner(System.in);

        firstInput = input.nextLine();
        SecondInput = input.nextLine();
        input.close();


        if (firstInput.equals(SecondInput)){
            System.out.println("The stings are equal!!");
        }
        else {
            System.out.println("We can not compare the two words as they are different.");
        }
    }

    public static void compare(int a, int b){
        System.out.println(a > b ? "First number is greater" : "Might be equal or second number is greater");
    }

    public static void printMonth(int month){
        String result = "Not valid month!";

        if (month == 1){
            result = "Jan";

        } else if (month == 2){
            result = "Feb";
        }
        System.out.println(result);
    }

    public static void compareWithIf(int a, int b){
        if (a == b){
            System.out.println("The numbers are equal");
        } else if(a > b){
            System.out.println("First number is greater");
        }else{
            System.out.println("Second number is greater");
        }
    }

    public static void printMonthSwitch(int month){
        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            default:
                System.out.println("Invalid month!");
                break;
        }
    }

    public static void leapYearChecker(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}
