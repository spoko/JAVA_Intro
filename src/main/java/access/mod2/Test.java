package access.mod2;

import access.mod.*;
import encapsulation.Product;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog();
        frenchie.breed = "Some breed"; //possible because it is public
        frenchie.publicDogMethod();

        FreanchBulldog frBulldog = new FreanchBulldog();
        //frBulldog.sex = "female"; //not possible since it is protected for its package
        //frBulldog.protectedDogMethod(); //not possible since it is protected for its package

        frBulldog.publicDogMethod();
        //frBulldog.breed = "new fr"; // can`t be changed because it is final

        //Product coffee = new Product("Coffee", 5.5);// protected constructor
        CoffeProduct coffee2 = new CoffeProduct("Coffee from this package", 3.4);
        Cat cat = new Cat();
    }

}
