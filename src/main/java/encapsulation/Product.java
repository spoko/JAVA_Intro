package encapsulation;

public class Product {
    private String name;
    private double cost;
    private int barcode;

    public int getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("System: Name cannot be empty");
        }else{
            this.name = name;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0){
            this.cost = cost;
        }else {
            System.out.println("System: Money cannot be negative");
        }
    }

    protected Product(String name, double cost) {
        setName(name);
        setCost(cost);
        setBarcode(); //possible to be accessed because it is in the same class - private
    }

    private void setBarcode(){
        barcode = 34235345;
    }
}
