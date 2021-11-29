package oop;

public abstract class Animal {
    private String sex;

    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        if (!sex.isEmpty())
            this.sex = sex;
    }

    public void eat(String food){
        System.out.println("Preferred food is: " + food);
    }

    public  void eat(){
        System.out.println("This is method overloading example");
    }

    //method overloading example 2
    public void eat(int quantity){
        System.out.println("This dog can eat: " + quantity);
    }
}
