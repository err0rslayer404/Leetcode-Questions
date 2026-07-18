class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0, n = nums.length; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}