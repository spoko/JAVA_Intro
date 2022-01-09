package exceptionsDemo;

import java.io.FileNotFoundException;

public class MathProblems {

    public static int divide2Numbers(int a, int b) throws MathException {
        int result = -1;
        try{
            result = a / b;
        } catch (ArithmeticException e){
            System.out.println("It is not possible to " + e.getMessage() + "in this universe...");
            throw new MathException("Not possible in this universe");
        }finally {
            System.out.println("I will be executed");
        }

        return result;
    }
}
