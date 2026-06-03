class College {
    int roll;
    String name;

    // Student() {
    //     roll = 36;
    //     name = "Raushan";
    // }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }
}

public class WithOutParameter {
    public static void main(String[] args) {
        College s1 = new College();
        s1.display();
    }
}
