class Students {
    int roll;
    String name;

    // Constructor 1 (No parameter)
    Students() {
        roll = 0;
        name = "Not Assigned";
    }

    // Constructor 2 (One parameter)
    Students(int r) {
        roll = r;
        name = "Unknown";
    }

    // Constructor 3 (Two parameters)
    Students(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class ConstructorOverLOading {
    public static void main(String[] args) {

        Students s1 = new Students();               // Calls constructor 1
        Students s2 = new Students(101);            // Calls constructor 2
        Students s3 = new Students(102, "Rahul");   // Calls constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}
