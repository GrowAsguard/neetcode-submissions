class Solution {
    public Map<Integer,Integer> myMap = new HashMap<>();
    public int climbStairs(int n) {
        if (n <= 2) return n;
        if (myMap.containsKey(n)) return myMap.get(n);
        else {
            int answer = climbStairs(n-1) + climbStairs(n-2);
            myMap.put(n, answer);
            return answer;
        }
    }
}
