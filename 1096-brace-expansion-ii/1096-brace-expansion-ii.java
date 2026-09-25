class Solution {

    private String s;
    private int idx;

    public List<String> braceExpansionII(String expression) {
        s = expression;
        idx = 0;

        Set<String> result = parseExpression();

        List<String> ans = new ArrayList<>(result);
        Collections.sort(ans);

        return ans;
    }

    // Handles union: e1,e2,e3
    private Set<String> parseExpression() {
        Set<String> result = new HashSet<>();

        while (idx < s.length() && s.charAt(idx) != '}') {

            Set<String> part = parseTerm();

            result.addAll(part);

            if (idx < s.length() && s.charAt(idx) == ',') {
                idx++;
            }
        }

        return result;
    }

    // Handles concatenation: ab, {a,b}c, etc.
    private Set<String> parseTerm() {
        Set<String> result = new HashSet<>();
        result.add("");

        while (idx < s.length()
                && s.charAt(idx) != ','
                && s.charAt(idx) != '}') {

            Set<String> next;

            if (s.charAt(idx) == '{') {
                idx++; // skip {

                next = parseExpression();

                idx++; // skip }
            } else {
                next = new HashSet<>();
                next.add(String.valueOf(s.charAt(idx)));
                idx++;
            }

            result = concatenate(result, next);
        }

        return result;
    }

    private Set<String> concatenate(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>();

        for (String x : a) {
            for (String y : b) {
                result.add(x + y);
            }
        }

        return result;
    }
}