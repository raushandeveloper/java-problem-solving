package MultiDimensionalArrays;

public class OutputIn2DArray {
    static void main(String[] args) {
//        int[][] arr = new int[3][4];
        int[][] arr = {{6,7,8,4},{5,2,4,9},{5,7,1,5}};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
