package L7Brackets;

import java.util.Stack;

public class Solution {
    public int solution(String S) {
        int len = S.length();
        Stack<Character> left_stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            Character c = S.charAt(i);
            if ((c == '{') || (c == '[') || (c == '(')) {
                left_stack.push(c);
            } else if ((c == '}') || (c == ']') || (c == ')')) {
                if (left_stack.empty()) {
                    return 0;
                }
                Character left = left_stack.pop();
                if ((c-left) != 2 && (c-left) !=1) {
                    return 0;
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
