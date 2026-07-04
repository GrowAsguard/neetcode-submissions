class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(']', '[');
        brackets.put(')', '(');
        brackets.put('}', '{');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.isEmpty() || stack.peek() != brackets.get(c)) return false;
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return false;
        else return true;
    }
}
