package MultiDimensionalArrays;

public class rowsWisePrint {
    static void main(String[] args) {
        int[][] arr = {{4,5,3,2,},{9,7,6,5,},{7,4,5,2}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length+1; j++){
                System.out.print (arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
