package MultiDimensionalArrays;

public class ColumnWisePrint {
    static void main(String[] args) {
        int[][] arr = {{4,5,3,2,},{9,7,6,5,},{7,4,5,2}};
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print (arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
