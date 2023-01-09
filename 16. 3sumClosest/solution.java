class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestSum = 30000;
        int bestDiff = Math.abs(bestSum - target);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int left = 0;
            int right = len - 1;
            while (i != left && i != right){
                int curSum = nums[left] + nums[right] + nums[i];
                int curDiff = Math.abs(curSum - target);
                if (curSum == target) {
                    return curSum;
                } else {
                    if (curDiff < bestDiff) {
                        bestDiff = curDiff;
                        bestSum = curSum;
                    }
                    if (curSum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return bestSum;
    }
}
