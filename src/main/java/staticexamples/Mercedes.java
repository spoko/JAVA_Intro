package staticexamples;

public class Mercedes extends Car {
    private String wheelPosition;

    public String getWheelPosition() {
        return wheelPosition;
    }

    public void setWheelPosition(String wheelPosition) {
        this.wheelPosition = wheelPosition;
    }

    public Mercedes(String color, String brand) {
        super(color, "Mercedes");
    }

//    @Override
//    public void printCarData(){
//        System.out.println("Wheel position is: " + this.wheelPosition);
//    }
}
