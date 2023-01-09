// Better Runtime Solution
// 

class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = a.length;
        Arrays.sort(a);
      
        // Same till here
      
        for (int i=0;i<n-2;i++) {
            int n1 = a[i];
          
            // Different Approach from here
            
            int j = i+1, k = n-1;
            while (j<k) {
                int n2 = a[j], n3 = a[k];
                int sum = n1+n2+n3;
                if (sum==0) {
                    ans.add(Arrays.asList(n1,n2,n3));
                    while(j<k && n2==a[j])
                        j++;
                    while(j<k && n3==a[k])
                        k--;
                } else {
                    if (sum>0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
          
            // Skipping same num as I did
            while (i<n-2 && a[i]==a[i+1])
                i++;
        }
        return ans;
    }
}
