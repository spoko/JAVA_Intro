package poly;

public class DeveloperEmp extends Employee implements Seniority{
    private static final String DEVELOPER_ENGINEER_DEPARTMENT = "Development";

    public DeveloperEmp(String name, String startDate, double salary) {
        super(name, startDate, DEVELOPER_ENGINEER_DEPARTMENT, salary);
    }

    @Override
    protected void calculateSalary(int workingHours, double wagePerHour) {
        double salary = workingHours * wagePerHour + 500;
        System.out.println(super.getName() + " has " + salary + " as salary.");
    }

    @Override
    public void giveFeedback() {
        System.out.println("This code is awesome!");
    }

    @Override
    public void giveSupport() {
        System.out.println("I can help you with that code.");
    }
}
