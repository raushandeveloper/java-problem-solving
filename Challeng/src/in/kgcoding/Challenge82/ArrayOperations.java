package in.kgcoding.Challenge82;

public class ArrayOperations {
    private static int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{
        double mean(){
            double sum =0;
            for(int number : numbers){
                sum += 0;
            }
            return sum/numbers.length;
        }
        double median(){
            return 0;
        }
    }
}
