package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<String>();

        kitchenDrawer.push("Grill pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);
        System.out.println(kitchenDrawer.pop());
        System.out.println(kitchenDrawer);

        kitchenDrawer.add(0,"Knife"); // not a "normal" stack operation - this is List operation

        System.out.println(kitchenDrawer);

    }
}
