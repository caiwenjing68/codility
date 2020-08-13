package L5PassingCars;

public class Solution {
//    int max = 1000000000;
//    public int count_right_one(int next, int[] A) {
//        int len = A.length;
//        int res = 0;
//        for (int i = next; i < len; i++) {
//            int temp = A[i];
//            if (temp == 1) {
//                res++;
//            }
//        }
//        return res;
//    }
//
//    public int solution(int[] A) {
//        int res = 0;
//        int len = A.length;
//        for (int i = 0; i < len; i++) {
//            int temp = A[i];
//            if (temp == 0) {
//                res += count_right_one(i+1, A);
//                if (res > max) {
//                    return -1;
//                }
//            }
//        }
//        return res;
//    }

    public int solution(int[] A) {
        int max = 1000000000;
        int res = 0;
        int len = A.length;
        int[] right_one = new int[len];
        int is_one = 0;
        if (A[len-1] == 1) {
            right_one[len - 1] = 1;
        }
        for (int j = len - 2; j >= 0; j--) {
            if (A[j] == 1) {
                is_one = 1;
            }
            right_one[j] = right_one[j+1] + is_one;
            is_one = 0;
        }
        for (int i = 0; i < len; i++) {
            int temp = A[i];
            if (temp == 0) {
                res += right_one[i];
                if (res > max) {
                    return -1;
                }
            }
        }
        return res;
    }
}
