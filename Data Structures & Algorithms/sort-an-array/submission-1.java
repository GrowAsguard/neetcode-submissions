class Solution {
    public int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        mergeSort(nums,l,r);
        return nums;
    }
    private static void mergeSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = l + (r-l)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    private static void merge(int[] nums, int l, int mid, int r) {
        int[] left = new int[mid-l+1];
        for (int x=0; x<left.length; x++) left[x] = nums[x+l];

        int[] right = new int[r-mid];
        for (int x=0; x<right.length; x++) right[x] = nums[mid+1+x];

        int i=0; int j=0; int k=l;
        while (i<left.length && j<right.length){
            nums[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i<left.length) nums[k++] = left[i++];
        while (j<right.length) nums[k++] = right[j++];
    }
}