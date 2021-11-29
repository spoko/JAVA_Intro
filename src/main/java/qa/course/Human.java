package qa.course;

import java.util.ArrayList;

public class Human {
    private int age;
    private String firstName;

    public String getFirstName() {
        //has access?
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isEmpty())
            this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }
}
