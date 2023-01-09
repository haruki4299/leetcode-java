class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int len = arr.length;
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (nums.containsKey(arr[i])){
                nums.replace(arr[i], 1 + nums.get(arr[i]));
            } else {
                nums.put(arr[i], 1);
            }
        }
        int j = 0;
        while (!nums.isEmpty()) {
            int key = arr[j];
            
            if (nums.containsKey(key)){
                int value = nums.get(key);
                nums.remove(key);
                if (nums.containsValue(value)){
                    return false;
                }
            }
            j++;
        }
        return true;
    }
}

// Idea combination of hashtable and priority queue to sort the number of occurences.
// Or some other way to find duplicate occurences
