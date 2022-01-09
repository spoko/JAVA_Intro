package summaryoop;

public class Mercedes extends Car {
    final String Brand_Name = "Mercedes";
    String nameOfFourWheelDrive;

    public Mercedes(String coupe, double volume, WheelsDrive wheelDrive, String color, Owner[] owner, String nameOfFourWheelDrive) {
        super(coupe, volume, wheelDrive, color, owner);
        this.nameOfFourWheelDrive = nameOfFourWheelDrive;
    }


    public void fillInPetrol(){
        System.out.println("Pour me petrol");
    }

    public void fillInPetrol(double quantity){
        System.out.println("Pour me " + quantity + " petrol");
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "coupe='" + coupe + '\'' +
                ", volume=" + volume +
                ", wheelDrive=" + wheelDrive +
                ", color='" + color + '\'' +
                //", owner=" + owner.name +
                '}';
    }
}
