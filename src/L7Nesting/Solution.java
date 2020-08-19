package L7Nesting;

import java.util.Stack;

public class Solution {
    public int solution(String S) {
        int len = S.length();
        Stack<Character> left_stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == '(') {
                left_stack.push('(');
            } else {
                if (left_stack.empty()) {
                    return 0;
                } else {
                    left_stack.pop();
                }
            }
        }
        if (left_stack.empty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
