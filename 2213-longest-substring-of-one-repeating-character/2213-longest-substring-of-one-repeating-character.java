class SegmentTree {

    class Node {
        char leftChar;
        char rightChar;

        int prefix;
        int suffix;
        int best;
        int len;

        Node() {}

        Node(char c) {
            leftChar = c;
            rightChar = c;
            prefix = 1;
            suffix = 1;
            best = 1;
            len = 1;
        }
    }

    Node[] tree;
    char[] s;

    SegmentTree(char[] s) {
        this.s = s;
        tree = new Node[4 * s.length];
        build(1, 0, s.length - 1);
    }

    void build(int node, int start, int end) {

        if (start == end) {
            tree[node] = new Node(s[start]);
            return;
        }

        int mid = start + (end - start) / 2;

        build(2 * node, start, mid);
        build(2 * node + 1, mid + 1, end);

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    Node merge(Node a, Node b) {

        if (a == null) return b;
        if (b == null) return a;

        Node res = new Node();

        res.len = a.len + b.len;

        res.leftChar = a.leftChar;
        res.rightChar = b.rightChar;

        // Prefix
        res.prefix = a.prefix;

        if (a.prefix == a.len && a.rightChar == b.leftChar) {
            res.prefix = a.len + b.prefix;
        }

        // Suffix
        res.suffix = b.suffix;

        if (b.suffix == b.len && a.rightChar == b.leftChar) {
            res.suffix = b.len + a.suffix;
        }

        // Best
        res.best = Math.max(a.best, b.best);

        // Join suffix of left + prefix of right
        if (a.rightChar == b.leftChar) {
            res.best = Math.max(
                res.best,
                a.suffix + b.prefix
            );
        }

        return res;
    }

    void update(int node, int start, int end, int index, char c) {

        if (start == end) {
            tree[node] = new Node(c);
            return;
        }

        int mid = start + (end - start) / 2;

        if (index <= mid) {
            update(2 * node, start, mid, index, c);
        } else {
            update(2 * node + 1, mid + 1, end, index, c);
        }

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    void update(int index, char c) {
        update(1, 0, s.length - 1, index, c);
    }

    int getBest() {
        return tree[1].best;
    }
}

class Solution {

    public int[] longestRepeating(
        String s,
        String queryCharacters,
        int[] queryIndices
    ) {

        int k = queryCharacters.length();

        int[] ans = new int[k];

        char[] chars = s.toCharArray();

        SegmentTree st = new SegmentTree(chars);

        for (int i = 0; i < k; i++) {

            int index = queryIndices[i];
            char c = queryCharacters.charAt(i);

            // Update character
            chars[index] = c;
            st.update(index, c);

            // Longest repeating substring
            ans[i] = st.getBest();
        }

        return ans;
    }
}