package mathexamples;

public class MathDemo {
    public static void main(String[] args) {
        findMax(3,5,8);
        findMin(3,5,8);
        roundNumbers(Math.PI);
    }

    public static void findMax(int a, int b, int c){
        int max = Math.max(a, Math.max(b,c));
        System.out.println("Max is: " + max);
    }

    public static void findMin(int a, int b, int c){
        int min = Math.min(a, Math.min(b,c));
        System.out.println("Min is: " + min);
    }

    public static void roundNumbers(double number){
        System.out.println(Math.round(number));
    }
}
