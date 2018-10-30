package model.component;

import model.basic.Date;
import model.basic.Location;

public class Person {
    private String name;
    private String surname;
    private int age;

    private Date birthday;
    private Location location;

    private Education[] educations;
    private Work[] works;
    private Technology[] technologies;

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

    public Person setAge(int age) {
        if(age < 0) return this;
        if(age > 150) return this;
        this.age = age;
        return this;
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

    public Education[] getEducations() {
        return educations;
    }

    public Person setEducations(Education[] educations) {
        this.educations = educations;
        return this;
    }

    public Work[] getWorks() {
        return works;
    }

    public Person setWorks(Work[] works) {
        this.works = works;
        return this;
    }

    public Technology[] getTechnologies() {
        return technologies;
    }

    public Person setTechnologies(Technology[] technologies) {
        this.technologies = technologies;
        return this;
    }

    @Override
    public String toString() {
        return name + " " + surname +
                "\n" + age +
                " years old from " + location;
    }
}
