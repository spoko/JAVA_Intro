package demo.enums;

public class DemoEnums {

    public static void main(String[] args) {
        //calling static method directly:
        printDayOfTheWeek(WeekDays.FRI);

        //creating an object for calling it`s methods:
        DemoEnums enumDemo = new DemoEnums();
        //calling not static method using an object and saving the returned value in variable:
        double sum = enumDemo.sumTwoDoubles(4.5, 5);
        //print the stored value
        System.out.println(sum);

        //calling method with method as params:
        System.out.println(enumDemo.sumTwoDoubles(7.86, 5.34));
    }

    //This is a static method
    public static void printDayOfTheWeek(WeekDays days){
        switch (days){
            case MON -> System.out.println("Monday");
            case FRI -> System.out.println("Friday :)");
        }
    }

    //this is not static method with return type of double
    public double sumTwoDoubles(double a, double b){
        return a + b;
    }
}
