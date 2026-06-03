public class Main {
    static void main() {
//        1. abs(): Absolute value.
//        2. cell(): Rounds up.
//        3. floor(): Rounds down.
//        4. round(): Rounds to nearest integer.
//        5. max(), min(): Maximum and minimum of two numbers.
//        6. Pow(): power calculation.
//        7. sqrt(): Square root.
//        8. random(): Random number generation.
//        9. exp(), log() : Exponential and logarithmic functions.
//        10. Trigonometric functions: sin(), cos()

        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.17));
        System.out.println(Math.max(5,7));
        System.out.println(Math.min(4,3));
        System.out.println(Math.PI);
        System.out.println(Math.random());

        for (int i= 0; i < 5; i++) {
            int num =(int) Math.round(Math.random()*10);
            System.out.println(num);
        }
    }
}
