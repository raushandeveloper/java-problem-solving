public class OverloadingDemo {
      void add(int a, int b){
          System.out.println("Sum of 2 integers: "+(a+b));
      }
      void add(int a, int b, int c){
          System.out.println("Sum of 3 integers: "+(a+b+c));
      }
      void add(int a,int b,int c, int d){
          System.out.print("sum of 4 integers: "+(a+b+c+d));
      }


    static void main() {
        OverloadingDemo obj = new OverloadingDemo();
        obj.add(5,6);
        obj.add(6,4,3);
        obj.add(8,4,3,2);
    }
}
