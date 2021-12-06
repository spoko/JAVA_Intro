package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private double money;
    private LinkedList<Product> bag = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("System: Name cannot be empty");
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money >= 0){
            this.money = money;
        }else {
            System.out.println("System: Money cannot be negative");
        }
    }

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
    }

    public void buy(Product product){
        if (this.getMoney() >= product.getCost()){
            bag.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.println(this.getName() + " has bought " + product.getName());
        }else {
            System.out.println(this.getName() + " can't afford " + product.getName());
        }
    }

    public void printItemsInBag(){
        if (bag.size() == 0){
            System.out.println(this.getName()+ " - Nothing bought");
            return;
        }

        String bagItems = "";
        for (Product product : bag){
            if (bag.size() > 1){
                bagItems += product.getName() + ", ";
            }else {
                bagItems += product.getName();
            }
        }
        System.out.println(this.getName() + "- " + bagItems);
    }
}
