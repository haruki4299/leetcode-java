class Solution {
    public int maximumCount(int[] nums) {
        int len = nums.length;
        int i = 0;
        int negcount = 0;
        int zeros = len;
        boolean set = false;
        while (i < len) {
            if (nums[i] >= 0 && set == false) {
                negcount = i;
                set = true;
            }
            if (nums[i] > 0) {
                zeros = i;
                break;
            }
            i++;
        }
        return Math.max(len - zeros, negcount);
    }
}