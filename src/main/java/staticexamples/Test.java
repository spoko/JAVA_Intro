package staticexamples;

public class Test extends AbstractDemo {

    public static void main(String[] args) {
        System.out.println("Before creating any cars the car number is: " + Car.getCounter());
        Car car1 = new Car("Red", "BMW");
        System.out.println("After creating the first object the counter is: " + Car.getCounter());
        Car car2 = new Car("White", "Mercedes");
        System.out.println("After creating the seconds object the counter is: " + Car.getCounter());

        Mercedes mrc = new Mercedes("Black", "blah");
        mrc.setWheelPosition("Right");
        mrc.printCarData();

//        System.out.println("Car1 brand is: " + car1.getBrand());
//        System.out.println("Car1 color is: " + car1.getColor());
//        System.out.println("Car2 brand is: " + car2.getBrand());
//        System.out.println("Car2 color is: " + car2.getColor());

        car1.printCarData();
        car2.printCarData();

        System.out.println("This plant is building " + Car.GAS_TYPE + " engines");


    }

    @Override
    public void sum(int a, int b, int c) {
        System.out.println("Sum is: " + (a+b+c));
    }
}
