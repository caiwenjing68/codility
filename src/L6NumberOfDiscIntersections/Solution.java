package L6NumberOfDiscIntersections;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        int max = 10000000;
        int len = A.length;
        if (len == 1) {
            return 0;
        }
        int[] left_list = new int[len];
        int[] right_list = new int[len];

        for (int i = 0; i < len; i++) {
            int temp = A[i];
            int left = i - temp;
            int right;
            if (Integer.MAX_VALUE - i < temp) {
                 right = Integer.MAX_VALUE;
            } else {
                right = i + temp;
            }

            left_list[i] = left;
            right_list[i] = right;
        }
        Arrays.sort(left_list);
        Arrays.sort(right_list);
        int open = 0;
        int intersection = 0;
        int left_index = 0;
        int right_index = 0;
        while (left_index < len) {
            int left = left_list[left_index];
            int right = right_list[right_index];
            if (left <= right) {
                intersection += open;
                if (intersection > max) {
                    return -1;
                }
                open++;
                left_index++;
            } else {
                open--;
                right_index++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] A = {1, 10, 100, 1};
        int res = solution(A);
        System.out.println(res);

    }
}
