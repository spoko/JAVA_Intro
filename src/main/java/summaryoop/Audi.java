package summaryoop;

public class Audi extends Car{
    final String Brand_Name = "Audi";
    String nameOfFourWheelDrive;

    public Audi(String coupe, double volume, WheelsDrive wheelDrive, String color, Owner[] owner, String nameOfFourWheelDrive) {
        super(coupe, volume, wheelDrive, color, owner);
        this.nameOfFourWheelDrive = nameOfFourWheelDrive;
    }
}
