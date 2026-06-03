package in.kgcoding.Challenge79;

public class TestEmployee {
    static void main(String[] args) {
        Employee emp = new Employee("Raushan",20,250000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Jiva");
        System.out.println(emp.getEmployeeDetails());
    }
}
