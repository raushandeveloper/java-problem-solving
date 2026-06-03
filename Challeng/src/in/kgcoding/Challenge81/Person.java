package in.kgcoding.Challenge81;

import java.util.Objects;

public class Person {
    private String Name;
    private int age;

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, age);
    }
}


