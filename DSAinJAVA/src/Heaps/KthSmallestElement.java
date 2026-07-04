package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public int kthSmallest(int[] arr, int k) {
        //maxheap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){ //nlogK
            pq.add(ele); // logK
            if(pq.size()>k) pq.remove(); // log
        }
        return pq.peek();
    }
}
