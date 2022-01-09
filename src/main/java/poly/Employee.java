package poly;

public abstract class Employee {
    private String name;
    private String startDate;
    private double salary;
    private String department;

    public Employee(String name, String startDate, String department, double salary) {
        setName(name);
        setStartDate(startDate);
        setDepartment(department);
        setSalary(salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //abstract method - therefore the class shall be abstract as well
    protected abstract void calculateSalary(int workingHours, double wagePerHour);

    //not abstract method in abstract class
    protected void setBonus(double bonus){
        System.out.println(this.name + " has " + bonus + ". and salary is: " + this.salary);
        System.out.println("Total wage is: " + salary + bonus);
    }
}
