package array.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Sofia");
        cities.add(0,"London");
        cities.add("Barcelona");
        System.out.println("Cities before Brexit: " + cities);

        System.out.println(cities.size());

        cities.remove("London");
        //cities.remove(1);

        System.out.println("Cities after Brexit " + cities);
        System.out.println(cities.size());


    }
}
