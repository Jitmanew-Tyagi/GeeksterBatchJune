class Solution { // "(()())(())"
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(!st.isEmpty()) sb.append(c);
                st.push(c);
            } else {
                if(st.size() > 1) sb.append(c);
                st.pop();
            }
        }
        return sb.toString();
    }
}