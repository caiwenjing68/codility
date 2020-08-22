package L8EquiLeader;

public class Solution {
    //result 1 times out
    public int find_leader(int[] A) {
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
        int count = 0;
        for (int j = 0; j < len; j++) {
            if (A[j] == candidate) {
                count++;
            }
        }
        if (count > len / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
    public int same_leader(int[] A, int left, int right, int leader) {
        int count = 0;
        int num = (right - left + 1) / 2;
        for (int i = left; i <= right; i++) {
            if (A[i] == leader) {
                count++;
            }
        }
        if (count > num) {
            return 1;
        } else {
            return 0;
        }
    }

    public int solution1(int[] A) {
        int len = A.length;
        if (len == 1) {
            return 0;
        }
        int leader = find_leader(A);
        int res = 0;
        if (leader != -1) {
            res = 1;
        } else {
            res = 0;
        }

        for (int i = 1; i < len-1; i++) {
            int left_res = same_leader(A, 0, i, leader);
            int right_res = same_leader(A, i+1, len-1, leader);
            if (left_res == 1 && right_res == 1) {
                res++;
            }
        }
        return res;
    }

    // final result
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
        int count = 0;
        for (int j = 0; j < len; j++) {
            if (A[j] == candidate) {
                count++;
            }
        }
        if (count <= len / 2) {
            return 0;
        }
        int res = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < len-1; i++) {
            if (A[i] == candidate) {
                left++;
            }
            right = count - left;
            if ((left > (i+1)/2) && (right > (len-i-1)/2)) {
                res++;
            }
        }
        return res;
    }
}
