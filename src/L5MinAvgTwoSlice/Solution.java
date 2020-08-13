package L5MinAvgTwoSlice;

public class Solution {
    public int solution(int[] A) {
        int len = A.length;
        double min_avg = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < len - 2; i++) {
            int sum2 = A[i] + A[i+1];
            double avg1 = sum2 / 2.0d;
            if (avg1 < min_avg) {
                min_avg = avg1;
                index = i;
            }
            int sum3 = sum2 + A[i+2];
            double avg2 = sum3 / 3.0d;
            if (avg2 < min_avg) {
                min_avg = avg2;
                index = i;
            }
        }
        int sum = A[len-2] + A[len-1];
        double avg3 = sum / 2.0d;
        if (avg3 < min_avg) {
            min_avg = avg3;
            index = len - 2;
        }
        return index;
    }
}
