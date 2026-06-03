package Challeng.src.in.kgcoding.Equals;

import in.kgcoding.Equals.EqualAndHashCodeTest;

import java.util.Objects;

public class Persion {
    private String name;
    private int age;
    private String id;

    public Persion(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persion persion = (Persion) o;
        return age == persion.age && Objects.equals(name, persion.name) && Objects.equals(id, persion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
