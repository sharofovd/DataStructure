package rumail;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name,10);
    }

    public void sayHello() {
        System.out.println("Hello, I am "+name);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ", " + age;
    }
}
