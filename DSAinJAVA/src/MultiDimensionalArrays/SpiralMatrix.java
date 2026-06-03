package MultiDimensionalArrays;

import java.util.ArrayList;

public class SpiralMatrix {
    static void main(String[] args) {

    }
    public ArrayList<Integer> spirallyTraverse(int[][] arr){
      ArrayList<Integer> ans = new ArrayList<>();
      int m = arr.length, n = arr[0].length;
      int firstRow =0, lastRow = m-1, firstCol = 0, lastCol = n-1;
      int tne = m*n;

      while (ans.size()<tne) {
          // right
          for (int j = firstCol; j <= lastCol; j++)
              ans.add(arr[firstRow][j]);
          firstRow++;

          if(ans.size()==tne) break;
          // down
           for(int i=firstRow; i<=lastRow; i++){
               ans.add(arr[i][lastCol]);
           }
           lastRow--;

          if(ans.size()==tne) break;
          //left
          for(int j=lastCol; j>=firstCol; j--)
              ans.add(arr[lastRow][j]);
          lastRow--;

          if(ans.size()==tne) break;
          //up
          for(int i=lastRow; i>=firstRow; i--)
              ans.add(arr[i][firstCol]);
          firstCol++;

      }
      return ans;
    }
}
