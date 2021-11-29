package oop;

public class Breed {
    private String breedName;

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public Breed (String breed){
        setBreedName(breed);
    }
}
