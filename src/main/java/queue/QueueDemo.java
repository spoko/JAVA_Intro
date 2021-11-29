package queue;

import qa.course.Human;

import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Human> queue = null; //we cannot create instance of Interface
        Human person = new Human();
        person.setFirstName("Ivan");
        person.setAge(-123);

        queue.add(person);
    }
}
