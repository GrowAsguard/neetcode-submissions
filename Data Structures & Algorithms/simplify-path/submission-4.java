class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();

        for (String s : path.split("/")) {
            switch(s) {
                case "": 
                case ".": {
                    break;
                }

                case "..": {
                    if (!stack.isEmpty()) stack.pop();
                    break;
                }
                default: {
                    stack.push(s);
                }
            }
            
        }

        if (stack.isEmpty()) {
            return "/";
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }
        return sb.toString();
    }
}