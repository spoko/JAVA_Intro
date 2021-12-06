package encapsulation;

import java.util.Scanner;
//Next time :)
//an easy option of this program:
//Ask the user for numbers of persons
//Ask the user for each person data
//Ask the user for number of Products
//Ask the user for each product data
//Ask the user for command: person - buys what
public class Test {
    public static void main(String[] args) {
        //testing the initial logic:
        Person elena = new Person("Elena", 11.00);
        Person alex = new Person("Alex", 4.00);
        Product coffee = new Product("Coffee", 10.00);
        Product tea = new Product("Tea", 2.00);

        elena.buy(coffee);
        alex.buy(tea);
        alex.buy(tea);
        elena.buy(tea);
        elena.printItemsInBag();
        alex.printItemsInBag();
        System.out.println("-----------------");

        Person mimi = new Person("Mimi", 0);
        Product juice = new Product("Juice", 2);

        mimi.buy(juice);
        mimi.printItemsInBag();

        System.out.println("-----------------");

        Person peter = new Person("Peter", -3);
        Product bread = new Product("Bread", 1);

        peter.buy(bread);
        //end testing the initial logic

        Scanner scanner = new Scanner(System.in);

        String people = scanner.nextLine();

    }

    private String [] parsePeoplesNames(String input){
        if (input.contains(";")){
            String [] peoples = input.split(";");
            String [] names = new String[peoples.length];
            String [] values = new String[peoples.length];

            for (int i = 0; i <peoples.length ; i++) {
                int index = peoples[i].indexOf("=");
                names[i] = peoples[i].substring(0, index);
            }
            return names;
        }else {
            int index = input.indexOf("=");
            String [] name = new String[1];
            name[0] = input.substring(0, index);
            //String value = input.substring(index, input.length() - 1);
            return name;
        }
    }

    private String [] parsePeopleValues(String input){
        if (input.contains(";")){
            String [] peoples = input.split(";");
            String [] names = new String[peoples.length];
            String [] values = new String[peoples.length];

            for (int i = 0; i <peoples.length ; i++) {
                int index = peoples[i].indexOf("=");
                values[i] = peoples[i].substring(index, peoples.length - 1);
            }
            return names;
        }else {
            int index = input.indexOf("=");
            String [] value = new String[1];
            value[0] = input.substring(index, input.length() - 1);
            return value;
        }
    }

}
