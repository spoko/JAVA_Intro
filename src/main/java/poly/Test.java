package poly;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        QualityEngineerEmp qa1 = new QualityEngineerEmp("Ivo", "today", 2000);
        employees.add(qa1);
        DeveloperEmp dev1 = new DeveloperEmp("Petar", "WED", 2500);
        employees.add(dev1);

        qa1.giveFeedback();
        dev1.giveFeedback();

        qa1.calculateSalary(10, 25);
        dev1.calculateSalary(10, 25);
    }
}
