class Solution {
    public int findMinArrowShots(int[][] points) {
        int len = points.length;
        Arrays.sort(points, (a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int popped = 0;
        int arrows = 0;
        while (len > popped) {
            int end = points[popped][1];
            int start = points[popped][0];
            while (popped < len && points[popped][1] >= start && points[popped][0] <= end) {
                if (start < points[popped][0]) {
                    start = points[popped][0];
                }
                if (end > points[popped][1]) {
                    end = points[popped][1];
                }
                popped++;
            }
            arrows++;
        }
        return arrows;
    }
    /** private int[][] sortByFirst(int[][] points) {
        int len = points.length;
        int sorted = 0;
        while (sorted < len) {
            int min = sorted;
            for (int i = sorted+1; i < len; i++) {
                if (points[min][0] > points[i][0]){
                    min = i;
                }
            }
            int[] temp = points[sorted];
            points[sorted] = points[min];
            points[min] = temp;
            sorted++;
        }
        return points;
    }
    */
}