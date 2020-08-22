package L8Dominator;

public class Solution {
    public int solution(int[] A) {
        int len = A.length;
        int stack_size = 0;
        int value = 0;
        for (int i = 0; i < len; i++) {
            if (stack_size == 0) {
                stack_size++;
                value = A[i];
            } else {
                if (A[i] == value) {
                    stack_size++;
                } else {
                    stack_size--;
                }
            }
        }
        int candidate = -1;
        if (stack_size > 0) {
            candidate = value;
        }
        int res = -1;
        int count = 0;
        for (int j = 0; j < len; j++) {
            if (A[j] == candidate) {
                res = j;
                count++;
            }
        }
        if (count > len / 2) {
            return res;
        } else {
            return -1;
        }
    }
}
