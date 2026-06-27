class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int can1 = 0, votes1 = 0;
        int can2 = 0, votes2 = 0;

        for (int num : nums) {
            if (num == can1) votes1++;
            else if (num == can2) votes2++;

            else if (votes1 == 0) {
                can1 = num;
                votes1 = 1;
            }
            else if (votes2 == 0) {
                can2 = num;
                votes2 = 1;
            }
            else {
                votes1--; votes2--;
            }

        }

        votes1 = 0; votes2 = 0;

        for (int num : nums) {
            if (num == can1) votes1++;
            else if (num == can2) votes2++;
        }

        if (votes1 > nums.length / 3) result.add(can1);
        if (votes2 > nums.length / 3) result.add(can2);

        return result;
    }
}