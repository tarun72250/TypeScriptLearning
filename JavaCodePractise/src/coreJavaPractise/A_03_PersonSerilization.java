package coreJavaPractise;
import java.io.Serializable;

public class A_03_PersonSerilization implements Serializable
{
    private static final long serialVersionUID = 1L; // For version control
    String name;
    int age;

    public A_03_PersonSerilization(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
