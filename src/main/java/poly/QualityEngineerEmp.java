package poly;

public class QualityEngineerEmp extends Employee implements Seniority{
    private static final String QUALITY_ENGINEER_DEPARTMENT = "Testing";


    //constructor for this class
    public QualityEngineerEmp(String name, String startDate, double salary) {
        //calling Employee constructor - can`t be changed!
        super(name, startDate, QUALITY_ENGINEER_DEPARTMENT, salary);
    }

    @Override
    protected void calculateSalary(int workingHours, double wagePerHour) {
        double salary = workingHours * wagePerHour;
        //calling Employee`s get name method
        System.out.println(super.getName() + " has " + salary);
    }

    @Override
    public void giveFeedback() {
        System.out.println("This test is awesome!");
    }

    @Override
    public void giveSupport() {
        System.out.println("I can help you with this test.");
    }
}
