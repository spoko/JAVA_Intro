package oop;

public class Test {
    public static void main(String[] args) {

        Breed frenchBulldog = new Breed("French Bulldog"); // създаваме обект от тип порода (нужен за сетва на конкретната порода за нашия обект куче
        //frenchBulldog.setBreedName("French Bulldog"); //сетваме порода за породата
        Address location = new Address();

        Dog frenchie = new Dog(frenchBulldog, location); //създаваме обект от тип куче


        frenchie.eat("Anything"); // казваме какво може да яде :) (извикваме метод от клас животно - родителския клас)
        frenchie.setBreed(frenchBulldog);// сетваме породата за нашия обект със горесъздадената
        frenchie.setSex("Male");
        //frenchie.setLocation(); //Todo create location and set it here

        System.out.println(frenchie.toString());
    }
}
