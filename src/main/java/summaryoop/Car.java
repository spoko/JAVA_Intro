package summaryoop;

public class Car implements CarActions {
    String coupe;
    double volume;
    WheelsDrive wheelDrive;
    String color;
    Owner[] owner;


    public Car(String coupe, double volume, WheelsDrive wheelDrive, String color, Owner[] owner) {
        this.coupe = coupe;
        this.volume = volume;
        this.wheelDrive = wheelDrive;
        this.color = color;
        this.owner = owner;
    }

    public void printOwner(){
        try {
            switch (owner.length){
                case 0:
                    System.out.println("This car is owned by the company");
                    break;
                case 1:
                    System.out.println("This car is owned by " + owner[0].name);
                    break;
                default:
                    System.out.println("This car has many owners");
                    break;
            }
        }catch (NullPointerException e){
            System.out.println("This car is owned by the company");
        }
    }

//    @Override
//    public void accelerate() {
//        System.out.println("Acceleration in progress...");
//    }

    @Override
    public void breaks() {
        System.out.println("Stops...");
    }

    @Override
    public void turns() {
        System.out.println("Turning...");
    }

    @Override
    public void useHybridEngine() {

    }
}
