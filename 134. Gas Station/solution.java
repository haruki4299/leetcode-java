class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int lowestindex = 0;
        int lowestgas = gas[0];
        int gastank = 0;
        for (int i = 0; i < len; i++) {
            gastank += gas[i];
            gastank -= cost[i];
            if (lowestgas > gastank) {
                lowestgas = gastank;
                lowestindex = (i + 1) % len;
            }
        }
        int index = lowestindex;
        gastank = 0;
        do {
            gastank += gas[index];
            gastank -= cost[index];
            if (gastank < 0) {
                return -1;
            }
            index = (index + 1) % len;
        } while (index%len != lowestindex);

        return lowestindex;
    }
}