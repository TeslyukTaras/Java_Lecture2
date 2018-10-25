package model.component;

import model.basic.Date;
import model.basic.Location;

public class Person {
    private String name;
    private String surname;
    private int age;

    private Date birthday;
    private Location location;

    public Person(String name, String surname, int age, Date birthday, Location location) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthday = birthday;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name + " " + surname +
                "\n" + age +
                " years old from " + location;
    }
}
