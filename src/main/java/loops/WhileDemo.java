package loops;

public class WhileDemo {

    public static void main(String[] args) {
        int number = 1;

        while (number <= 10) {
            System.out.printf("Number is: %d%n", number);
            //System.out.print("\n");
            //System.out.println(String.format("Number is: %d", number));
            number++;
        }
        factorial(6);
    }

    public static void factorial(int n){
        int factorial = 1;

        while (n > 0){
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}
