package L7Fish;

import java.util.Stack;

public class Solution {
    public static int solution(int[] A, int[] B) {
        Stack<Integer> fish = new Stack<>();
        int len = A.length;
        for (int i = 0; i < len; i++) {
            int size = A[i];
            int direction = B[i];
            if (fish.empty()) {
                fish.push(i);
            } else {
                while (!fish.empty() && (direction - B[fish.peek()] == -1) && (size > A[fish.peek()]) ) {
                    fish.pop();
                }
                if (fish.empty()) {
                    fish.push(i);
                } else {
                    if (direction - B[fish.peek()] != -1) {
                        fish.push(i);
                    }
                }
            }
        }
        return fish.size();
    }
    public static void main(String[] args) {
        int[] A = {0, 1};
        int[] B = {0, 1};
        int res = solution(A, B);
        System.out.println(res);
    }
}
