/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation. */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++){
            int a = 1;
            for (int j = 0; j < n; j++) {
                if (i == j){
                    continue;
                }
                else{
                    a = a * nums[j];
                }
            }
            ans[i] = a;
        }
        return ans;
    }
}  // not the best approach but it works, time complexity is O(n^2)

class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;

        // Left product
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Right product
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }
}  // best approach, time complexity is O(n) and space complexity is O(1) (excluding the output array)