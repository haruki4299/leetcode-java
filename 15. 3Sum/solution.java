class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        int prev1 = 1000000;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) break;
            if (prev1 != nums[i]) {
                int prev2 = 1000000;
                for (int j = i + 1; j < len - 1; j++) {
                    if (prev2 != nums[j]) {
                        if (nums[i] + nums[j] >= -100000) {
                            int prev3 = 1000000;
                            for (int k = j + 1; k < len; k++) {
                                if (prev3 != nums[k]) {
                                    if (nums[i] + nums[j] + nums[k] == 0) {
                                        List<Integer> part = Arrays.asList(nums[i], nums[j], nums[k]);
                                        ans.add(part);
                                    }
                                    if (nums[i] + nums[j] + nums[k] > 0) {
                                        break;
                                    }
                                }
                                prev3 = nums[k];
                            }
                        }
                    }
                    prev2 = nums[j];
                }
            }
            prev1 = nums[i];
        }
        return ans;
    }
}
