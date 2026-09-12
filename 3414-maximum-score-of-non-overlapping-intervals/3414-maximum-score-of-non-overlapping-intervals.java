import java.util.*;

class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] arr = new int[n][4]; // l, r, w, origIndex
        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }
        // sort by r ascending
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        
        int[] rSorted = new int[n];
        for (int i = 0; i < n; i++) rSorted[i] = arr[i][1];
        
        long[][] score = new long[n + 1][5];
        List<Integer>[][] chosen = new List[n + 1][5];
        
        for (int k = 0; k <= 4; k++) {
            score[0][k] = 0;
            chosen[0][k] = new ArrayList<>();
        }
        
        for (int i = 1; i <= n; i++) {
            int[] cur = arr[i - 1];
            int l = cur[0], w = cur[2], origIdx = cur[3];
            
            // binary search: count of intervals among first (i-1) with r < l
            int left = 0, right = i - 1, p = 0;
            while (left < right) {
                int mid = (left + right) / 2;
                if (rSorted[mid] < l) {
                    p = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            
            score[i][0] = 0;
            chosen[i][0] = new ArrayList<>();
            
            for (int k = 1; k <= 4; k++) {
                long scoreA = score[i - 1][k];
                List<Integer> listA = chosen[i - 1][k];
                
                long scoreB = score[p][k - 1] + w;
                List<Integer> listB = new ArrayList<>(chosen[p][k - 1]);
                int pos = Collections.binarySearch(listB, origIdx);
                if (pos < 0) pos = -pos - 1;
                listB.add(pos, origIdx);
                
                if (scoreA > scoreB) {
                    score[i][k] = scoreA;
                    chosen[i][k] = listA;
                } else if (scoreB > scoreA) {
                    score[i][k] = scoreB;
                    chosen[i][k] = listB;
                } else {
                    score[i][k] = scoreA;
                    chosen[i][k] = (compareLists(listA, listB) <= 0) ? listA : listB;
                }
            }
        }
        
        List<Integer> ans = chosen[n][4];
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) result[i] = ans.get(i);
        return result;
    }
    
    private int compareLists(List<Integer> a, List<Integer> b) {
        int n = Math.min(a.size(), b.size());
        for (int i = 0; i < n; i++) {
            int cmp = a.get(i) - b.get(i);
            if (cmp != 0) return cmp;
        }
        return a.size() - b.size();
    }
}