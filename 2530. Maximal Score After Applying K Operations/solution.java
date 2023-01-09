class Solution {
    public long maxKelements(int[] nums, int k) {
        long maxSum = 0;
        int len = nums.length;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < len; i++) {
            q.add(nums[i]);
        }
        for (int j = 0; j < k; j++){
            int num = q.poll();
            maxSum += num;
            q.add((int) Math.ceil((double) num / 3));
        }
        return maxSum;
    }
}