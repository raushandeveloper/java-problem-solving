
class Solution {
    int[] newParent;
    int[] last;
    int[] ans;
    ArrayList<Integer>[] tree;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        newParent = parent.clone();
        last = new int[26];
        Arrays.fill(last, -1);

        tree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }

        dfs(0, s);

        ArrayList<Integer>[] newTree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            newTree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            newTree[newParent[i]].add(i);
        }

        ans = new int[n];
        calculate(0, newTree);

        return ans;
    }

    void dfs(int node, String s) {
        int ch = s.charAt(node) - 'a';

        int previous = last[ch];

        if (previous != -1) {
            newParent[node] = previous;
        }

        last[ch] = node;

        for (int child : tree[node]) {
            dfs(child, s);
        }

        last[ch] = previous;
    }

    int calculate(int node, ArrayList<Integer>[] newTree) {
        int size = 1;

        for (int child : newTree[node]) {
            size += calculate(child, newTree);
        }

        ans[node] = size;
        return size;
    }
}
