package exceptionsDemo;

public class MathProblems {

    public static int divide2Numbers(int a, int b){
        int result = -1;
        try{
            result = a / b;
        } catch (ArithmeticException e){
            System.out.println("It is not possible to " + e.getMessage() + "in this universe...");
        }
        return result;
    }
}
