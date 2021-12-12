package access.mod;

public class Dog {
    public String breed; // can be access from anywhere
    String name; //here is used default access modifier - can be access from the current package only
    protected String sex; //can be accessed from the child class in different package
    private int age; //internal for the class only

    public final void publicDogMethod(){
        System.out.println("This method can be accessed from anywhere!");
    }

    void defaultDogMethod(){
        System.out.println("This method can be accessed from the current package only");
    }

    protected void protectedDogMethod(){
        System.out.println("This method can be accessed from the child class in different package");
    }

    private void privateDogMethod(){
        System.out.println("This is internal method");
    }
}
