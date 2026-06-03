package Basic_Sorting;

public class BubbleSortDescendingOrder {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


    static void main(String[] args) {
        int[] arr={2,-3,6,8,2,7};
        print(arr);
        int n= arr.length;
//            for (int i = 0; i <= n - 1; i++) {
//                for (int j = 0; j < n - 1 - i; j++) {
//                    if (arr[j] < arr[j + 1]) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                }
//            }

        for (int i=0; i<=n-1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);
    }
}
