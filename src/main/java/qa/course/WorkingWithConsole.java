package qa.course;

import java.util.Scanner;

public class WorkingWithConsole
{
    public static void main(String[] args)
    {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = consoleInput.nextLine();

        System.out.println("Please enter your age:");
        int age = consoleInput.nextInt();

        if (age < 18)
        {
           System.out.println(name + " can`t buy alcohol");
        }else {
            System.out.println(name + " can buy alcohol :)");
        }
    }
}
