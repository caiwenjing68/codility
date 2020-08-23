package L9MaxSliceSum;

public class Solution {
    public int solution(int[] A) {
        int len = A.length;
        if (len == 1) {
            return A[0];
        }
        int max = A[0];
        int temp_max = A[0];
        for (int i = 1; i < len; i++) {
            temp_max = Math.max(A[i], temp_max+A[i]);
            max = Math.max(max, temp_max);
        }
        return max;
    }
}
