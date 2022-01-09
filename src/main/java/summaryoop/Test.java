package summaryoop;

public class Test {
    public static void main(String[] args) {
        Owner alex = new Owner("Alex", "Varna", 984372);
        Mercedes mrc1 = new Mercedes("cabrio", 3200, WheelsDrive.FOUR_WHEELS, "blue",
                new Owner[]{alex}, "4matic");


       // Mercedes mrc2 = new Mercedes("red");
       // Mercedes mrc3 = new Mercedes("cabrio", 2000.00, WheelsDrive.BACK, "white", alex);

       // System.out.println(mrc3.toString());

        mrc1.fillInPetrol();
        mrc1.fillInPetrol(4.56);

        Audi au1 = new Audi("sedan", 2500, WheelsDrive.FOUR_WHEELS, "pink",
                new Owner[]{new Owner("Petar", "Burgas", 989842)}, "quatro");

        Audi au2 = new Audi("sedan", 2500, WheelsDrive.FOUR_WHEELS, "pink",
                new Owner[]{new Owner("Petar", "Burgas", 989842),
                        new Owner("Pavel", "Varna", 94949)}, "quatro");

        Audi au3 = new Audi("sedan", 2500, WheelsDrive.FOUR_WHEELS, "pink",
                null
                , "quatro");

        Audi au4 = new Audi("sedan", 2500, WheelsDrive.FOUR_WHEELS, "pink",
                new Owner[]{}
                , "quatro");

        au1.printOwner();
        au2.printOwner();
        au3.printOwner();
        au4.printOwner();

        au1.accelerate();

        mrc1.breaks();

    }
}
