package rumail.Test;

public class People {
    private final String name;
    private final Gender gender;
    private People spouse;

    public People getSpouse() {
        return spouse;
    }

    public People(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public boolean marry(People another) {
        //разный пол, не женаты между собой
        //расвести
        //поженить
        return false;
    }

    public void divorce() {

    }
}
