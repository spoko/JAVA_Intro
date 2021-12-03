package staticdemo;

public class StaticNoneDemo {
    private static String name;
    private double sum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void printData(){
        System.out.println("Name is: " + name);
        System.out.println("Sum si: " + sum);
    }

//    public static void printName(){
//        System.out.println("name is: " + name);
//    }
}
