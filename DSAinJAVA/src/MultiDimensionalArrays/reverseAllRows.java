package MultiDimensionalArrays;

public class reverseAllRows {
    public static void main(String[] args) {
        int[][] arr = {{4,5,3,2},{9,7,6,5},{7,4,5,2}};

        // Reverse rows + columns (180 rotation)
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = arr[i].length - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}