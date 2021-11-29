package linked.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add(0,"Audi");

        System.out.println("Before remove: " + cars);

        cars.remove("BMW"); //нямаме зимни гуми :)

        System.out.println("After remove " + cars);
    }
}
