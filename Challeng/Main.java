class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(52, "Raushan");
        s1.display();
    }
}
