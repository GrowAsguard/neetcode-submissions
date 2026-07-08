class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<String> stringStack = new ArrayDeque<>();

        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum*10 + (c-'0');
            }
            else if (c == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString.toString());

                currentString = new StringBuilder();
                currentNum = 0;
            }
            else if (c == ']') {
                String temp = currentString.toString();
                currentString = new StringBuilder(stringStack.pop());

                int count = countStack.pop();
                for (int i=0; i<count; i++) {
                    currentString.append(temp);
                }
            }
            else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}