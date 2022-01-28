package rumail.Datastructure;

import java.util.Objects;

public class SuperPerson extends Person{
    private final String lastName;

    public SuperPerson(String name, int age, String lastName) {
        super(name, age);
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuperPerson)) {
            return false;
        }
        if (!super.equals(o)) return false;
        SuperPerson that = (SuperPerson) o;
        return Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lastName);
    }
}
