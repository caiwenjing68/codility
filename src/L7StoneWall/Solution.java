package L7StoneWall;

import java.util.Stack;

public class Solution {
    public int solution(int[] H) {
        int len = H.length;
        Stack<Integer> block = new Stack<>();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (block.empty()) {
                block.push(i);
                continue;
            } else {
                int hight = H[i];
                if (!block.empty() && (hight > H[block.peek()])) {
                    block.push(i);
                    continue;
                }
                while (!block.empty() && (hight < H[block.peek()])) {
                    count++;
                    block.pop();
                }
                if (!block.empty() && (hight == H[block.peek()])) {
                    block.pop();
                }
                block.push(i);
            }
        }
        return count+block.size();
    }
}
