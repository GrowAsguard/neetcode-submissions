class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        
        int closeLeft = 0;
        int closeRight = 0;

        int n = arr.length;

        if (arr[n - 1] < x) {
            closeRight = n-1;
            closeLeft = n-2;
        }
        else if (arr[0] > x) {
            closeLeft = 0;
            closeRight = 1;
        }

        else {
            while (arr[closeRight] < x && closeRight < n-1) {
                closeRight++;
            }
            closeLeft = closeRight - 1;
        }

        for (int i=0; i<k; i++) {

            if (closeLeft < 0) {
                result.add(arr[closeRight]);
                closeRight++;
            }
            else if (closeRight == n) {
                result.add(0, arr[closeLeft]);
                closeLeft--;
            }
            else if (closeLeft >= 0 && Math.abs(arr[closeLeft] - x) < Math.abs(arr[closeRight] - x) ) {
                result.add(0, arr[closeLeft]);
                closeLeft--;
            } 
            else if (closeRight < n && Math.abs(arr[closeLeft] - x) > Math.abs(arr[closeRight] - x)) {
                result.add(arr[closeRight]);
                closeRight++;
            }
            else{
                result.add(0, arr[closeLeft]);
                closeLeft--;
            }
        }

        return result;
    }
}