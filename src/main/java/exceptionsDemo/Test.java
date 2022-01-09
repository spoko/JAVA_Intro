package exceptionsDemo;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileReader.readFile("testQA");
        System.out.println("Hello");
        try{
            System.out.println(MathProblems.divide2Numbers(2,2));
        }catch (MathException e){
            System.out.println(e.getMessage());
        }

        int[] a = new int[3];
        a[3] = 3;

    }
}
