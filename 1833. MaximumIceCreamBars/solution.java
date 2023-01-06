class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int len = costs.length;
        int i = 0;
        int bars = 0;
        while (len > i && coins > 0) {
            if (coins >= costs[i]) {
                coins = coins - costs[i]; 
                bars++;
                i++;
            } else {
                break;
            }
        }  
        return bars;
    }
}
