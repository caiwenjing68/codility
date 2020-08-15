package L6Triangle;

import java.util.Arrays;

public class Solution {
    public static boolean is_triangle(int a, int b, int c) {
        if ((a > (c-b)) && (a > (b-c)) && (b> (a-c))) {
            return true;
        } else {
            return false;
        }
    }
    public static int solution(int[] A) {
        int len = A.length;
        int first = 0, second = 0, third = 0;
        Arrays.sort(A);
        for (int i = 0; i <= (len - 3); i++) {
            first = A[i];
            if (first <= 0) {
                continue;
            }
            for (int j = i + 1; j <= (len - 2); j++) {
                second = A[j];
                for (int k = j + 1; k <= (len - 1); k++) {
                    third = A[k];
                    if (is_triangle(first, second, third)) {
                        return 1;
                    }
                    if (first < third - second) {
                        break;
                    }
                }
//                if (first < second - third) {
//                    break;
//                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 3, 5};
        int res = solution(A);
        System.out.println(res);
    }
}
