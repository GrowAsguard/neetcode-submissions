class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum*10 + (c-'0');
            }
            else if (c == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString);

                currentString = new StringBuilder();
                currentNum = 0;
            }
            else if (c == ']') {
                int count = countStack.pop();
                StringBuilder prev = stringStack.pop();
                
                for (int i=0; i<count; i++) {
                    prev.append(currentString);
                }
                currentString = prev;
            }
            else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}