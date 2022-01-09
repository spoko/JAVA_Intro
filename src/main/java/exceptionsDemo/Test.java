package exceptionsDemo;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileReader.readFile("testQA");
        System.out.println("Hello");
        System.out.println(MathProblems.divide2Numbers(2,0));
    }
}
