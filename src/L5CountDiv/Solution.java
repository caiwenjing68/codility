package L5CountDiv;

public class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int n1 = A/K;
        int x1 = A%K;
        int n2 = B/K;
        int res = n2 - n1;
        if (x1 == 0) {
            return res + 1;
        } else {
            return res;
        }
    }
}
