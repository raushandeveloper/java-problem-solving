public class Q1_array {
    static void main() {
//                   0 1 2 3 4 5 6 7 8 9 10 11 12
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6, 6, 7};
        System.out.println(binary(arr));

    }
    static int binary(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            if(mid%2 == 0){
                if(arr[mid] == arr[mid+1]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }else {
                if(arr[mid] == arr[mid+1]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return 0;
    }

}
