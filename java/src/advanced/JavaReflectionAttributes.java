package advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by amit on 29-Aug-2020
 */
public class JavaReflectionAttributes {
    public static void main(String[] args) {
        Class student = Student.class; // uses class literal, not a function.
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anotherMethod() {
        System.out.println(id + " " + name + " " + email);
    }
}
