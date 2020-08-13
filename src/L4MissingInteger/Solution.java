package L4MissingInteger;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int solution(int[] A) {
        int len = A.length;
        int max = 0;
        for (int j : A) {
            if (j > max) {
                max = j;
            }
        }
        max = max + 1;
        int[] sort_list = new int[max];
        Arrays.fill(sort_list, 0);
        for (int i: A) {
            if (i < 0) {
                continue;
            }
            sort_list[i] += 1;
        }
        for (int i=1; i < max; i++) {
            if (sort_list[i] == 0) {
                return i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        int res = solution(A);
        System.out.println("res: ");
        System.out.print(res);

    }
}
