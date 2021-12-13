package randomexamples;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
        print6_49();
        generatePass();
    }

    public static void print6_49(){
        Random random = new Random();

        for (int i = 1; i <= 6; i++) {
            System.out.print(random.nextInt(49) + 1 + "; ");
        }
    }

    //this method will generate password with a-z and 0-9
    public static void generatePass(){
        Random random = new Random();
        char[] letters = {'a', 'b', 'c', 'z'};
        char[] numbers = {'0','1', '2', '3'};
        char[] specials = {'@', '!', '#', '%'};

        String passwd = "";

        for (int i = 1; i < 6; i++) {
            passwd += letters[random.nextInt(letters.length)];
            passwd += numbers[random.nextInt(numbers.length)];
            passwd += specials[random.nextInt(specials.length )];
        }
        System.out.println("Password is: " + passwd);
    }
}
