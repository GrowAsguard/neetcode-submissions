class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> myMap = new HashMap<>();

        myMap.put(')', '(');
        myMap.put(']', '[');
        myMap.put('}', '{');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (!stack.isEmpty() && stack.peek() == myMap.get(c)) stack.pop(); 
                else return false;
            }
        }

        return stack.isEmpty();
    }
}
