class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatching(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isMatching(char open, char close) {
        if (open == '(' && close == ')') {
            return true;
        }
        if (open == '{' && close == '}') {
            return true;
        }
        if (open == '[' && close == ']') {
            return true;
        }
        return false;
    }
}