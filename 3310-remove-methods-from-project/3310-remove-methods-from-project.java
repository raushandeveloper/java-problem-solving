import java.util.*;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        // Step 1: Build graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
        }

        // Step 2: Find suspicious methods using BFS
        boolean[] suspicious = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(k);
        suspicious[k] = true;
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int nei : graph.get(curr)) {
                if (!suspicious[nei]) {
                    suspicious[nei] = true;
                    q.offer(nei);
                }
            }
        }

        // Step 3: Check if removal is valid
        for (int[] edge : invocations) {
            int a = edge[0], b = edge[1];
            
            if (!suspicious[a] && suspicious[b]) {
                // outside → inside (invalid)
                List<Integer> res = new ArrayList<>();
                for (int i = 0; i < n; i++) res.add(i);
                return res;
            }
        }

        // Step 4: Return remaining (non-suspicious)
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) res.add(i);
        }
        
        return res;
    }
}