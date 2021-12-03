package staticdemo;

public class Test {
    public static void main(String[] args) {

        //StaticNoneDemo.printName();

        StaticNoneDemo noneStaticObject = new StaticNoneDemo();
        StaticNoneDemo secondObject = new StaticNoneDemo();
        noneStaticObject.setName("noname");
        secondObject.setName("Ibro");

    }
}
