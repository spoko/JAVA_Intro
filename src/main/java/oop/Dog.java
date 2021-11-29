package oop;

import javax.xml.stream.Location;

public class Dog extends Animal{
    private Breed breed = new Breed("French Bulldog"); //This is composition
    private Address location = new Address(); //this is aggregation

    @Override
    public String toString(){
        return breed.getBreedName();
    }

    public Dog(Breed breed, Address location){
        setBreed(breed);
        setLocation(location);
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null))
            this.breed = breed;
    }


}
