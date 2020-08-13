package L4PermCheck;

public class Solution {
    public static int Solution(int[] A) {
        int len = A.length; //1 ~ len (position: 0 ~ len-1)
        int[] sorted_array = new int[len+1]; // 0 ～ len

        for (int i = 0; i < len; i++) {
            int current = A[i];
            if (current > len) {
                return 0;
            } else {
                if (sorted_array[current] >= 1) {
                    return 0;
                } else {
                    sorted_array[current] += 1;
                }
            }
        }
        for (int j=1; j <= len; j++) {
            int current = sorted_array[j];
            if (current == 0 || current > 1) {
                return 0;
            }
        }
        return 1;
        
//        int len = A.length;
//        int max = 0, min = 1000000001;
//        for (int i = 0; i < len; i++) {
//            int current = A[i];
//            if (max < A[i]) {
//                max = A[i];
//                if (max > len) {
//                    return 0;
//                }
//            }
//            if (min > A[i]) {
//                min = A[i];
//            }
//        }
//        if (min != 1 || max != len) {
//            return 0;
//        } else {
//            int diff = max - min + 1;
//            if (diff == len) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }

    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 2};
        int ans = Solution(A);
        System.out.println(ans);
    }
}
