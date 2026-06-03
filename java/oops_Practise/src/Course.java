import java.util.Arrays;

public class Course {
    static int maxCapacity=0;
    String courseName;
    int enrollments;

    String[] enrolledStudents;
    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudents(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }
    void unenrollStudent(String studentName){
        int k=0;
        for(int i=0; i < enrolledStudents.length; i++){
            if(enrolledStudents[i] == studentName){
                System.out.println("Student "+studentName+" is remove");
            }
            else{
                enrolledStudents[k] = enrolledStudents[i];
                k++;
            }
        }
        enrollments--;
    }
    public static void main() {
        setMaxCapacity(7);
        Course course = new Course("AI");
        course.enrollStudents("Ayush Kumar");
        course.enrollStudents("Khusi Kumari");
        course.enrollStudents("Radhe Radhe");
        course.enrollStudents("Suraj");
        course.enrollStudents("Sunny");
        course.enrollStudents("Sonu");
        System.out.println(Arrays.toString(course.enrolledStudents));

        course.unenrollStudent("Sonu");
        course.unenrollStudent("Sunny");
        System.out.println(Arrays.toString(course.enrolledStudents));
    }
}