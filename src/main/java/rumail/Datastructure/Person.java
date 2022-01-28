package rumail.Datastructure;

import java.util.Objects;

public class Person { // implements Comparable<Person>
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        if (!(o instanceof Person)) {
//            return false;
//        }
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Person)) return  false;
//        Person another = (Person) o;
//
//        return name.equalsIgnoreCase(another.name)
//                && age == another.age;
//    }
//
//    @Override
//    public int hashCode() {
//        // (name.hashCode()*31 + age)*31 + f2;
//        return name.hashCode()*31 + age;
//    }
//
//    @Override
//    public int compareTo(Person person) {
//        int i = Integer.compare(age, person.age);
//        if(i!=0) return i;
//
//        return name.compareTo(person.name);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
