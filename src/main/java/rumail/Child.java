package rumail;

public class Child extends Person {

    public Child(String name) {
        super(name);
    }


    public void sayHello() {
        System.out.println("Hello child");
    }

    @Override
    public String toString() {
        return "Child, " + super.toString();
    }
}
