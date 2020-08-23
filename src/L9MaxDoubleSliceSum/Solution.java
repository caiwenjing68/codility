package L9MaxDoubleSliceSum;

public class Solution {
    //O(n) = n**3
    public int solution1(int[] A) {
        int len = A.length;
        if (len == 3) {
            return 0;
        }
        int[] prev_sum = new int[len];
        prev_sum[0] = A[0];
        for (int i = 1; i < len; i++) {
            prev_sum[i] = prev_sum[i-1]+ A[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len-2; i++) {
            for (int j = i+2; j < len; j++) {
                for (int k = i+1; k < j; k++) {
                    int current = prev_sum[j-1] - prev_sum[i] - A[k];
                    if (current > max) {
                        max = current;
                    }
                }
            }
        }
        return max;
    }

    public int solution(int[] A) {
        int len = A.length;
        if (len == 3) {
            return 0;
        }
        int[] left_slice = new int[len-2];
        left_slice[0] = 0;
        for (int i = 1; i < len-2; i++) {
            left_slice[i] = Math.max(0, left_slice[i-1]+A[i]);
        }
        int right_slice = 0;
        int max_slice = 0;
        for (int j = len-1; j > 1; j--) {
            int left = j-2;
            if (j == len - 1) {
                right_slice = 0;
                max_slice = Math.max(max_slice, left_slice[left]+right_slice);
            } else {
                right_slice = Math.max(0, right_slice+A[j]);
                max_slice = Math.max(max_slice, left_slice[left]+right_slice);
            }
        }
        return max_slice;
    }
}
