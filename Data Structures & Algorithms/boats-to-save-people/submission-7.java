class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        if (people[people.length - 1] > limit) return 0;

        int count = 0;
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            while (people[right] == limit) {
                count++; right--;
                if (right < 0) return count;
            }
            
            int sum = people[left] + people[right];
            if (left == right || sum == limit) {
                count++;
                left++;
                right--;
            }
            else if (sum > limit) {
                count++;
                right--;
            }
            else {
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}