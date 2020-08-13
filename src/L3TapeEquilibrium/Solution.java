package L3TapeEquilibrium;

public class Solution {
    public static int Solution(int[] A) {
        int len = A.length;
        int med = (len-1)/2;
        int left_sum = 0, right_sum = 0;
        int min_abs = 0, current_abs = 0, current_diff = 0;
        // 0 ~ med
        for (int i = 0; i <= med; i++) {
             left_sum += A[i];
        }
        //med+1 ~ len - 1
        for (int j = len - 1; j > med; j--) {
            right_sum += A[j];
        }
        current_diff = left_sum - right_sum;
        min_abs = current_abs = Math.abs(current_diff);
        int med_diff = current_diff;
        int med_abs = current_abs;
        //left
        for (int k = med; k > 0; k--) {
            current_diff -= 2*A[k];
            current_abs = Math.abs(current_diff);
            if (min_abs > current_abs) {
                min_abs = current_abs;
            }
        }
        current_abs = med_abs;
        current_diff = med_diff;
        for (int g= med+1; g < len - 1; g++) {
            current_diff += 2*A[g];
            current_abs = Math.abs(current_diff);
            if (min_abs > current_abs) {
                min_abs = current_abs;
            }
        }
        return min_abs;
    }
    public static void main(String[] args) {
        int[] A = {-1000, 1000};
        int ans = Solution(A);
        System.out.println(ans);
    }
}
