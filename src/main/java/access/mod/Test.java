package access.mod;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog();

        frenchie.name = "Some Name"; //this is possible because name is default - i.e. accessible within the package
        frenchie.breed = "Some bulldog"; //thi si possible because breed is public
        frenchie.sex = "male"; //Protected i.e. accessible within the package
        //frenchie.age = 10; //can`t access variable that is private

        frenchie.defaultDogMethod();//this is possible because name is default - i.e. accessible within the package
        frenchie.protectedDogMethod(); //Protected i.e. accessible within the package
        frenchie.publicDogMethod(); // //thi si possible because breed is public

    }
}
