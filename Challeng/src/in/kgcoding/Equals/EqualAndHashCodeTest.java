package in.kgcoding.Equals;
import Challeng.src.in.kgcoding.Equals.Persion;

public class EqualAndHashCodeTest {
    static void main() {
       Persion person1 = new Persion("Raushan",17,"5678");
       Persion person2 = new Persion("Raushan",20,"5678");

       if(person1.equals(person2)){
           System.out.println("Equals");
       }
       else {
           System.out.println("Not Equals");
       }
    }
}
