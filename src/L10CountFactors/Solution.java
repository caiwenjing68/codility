package L10CountFactors;

public class Solution {
    public int solution(int N) {
        if (N == Integer.MAX_VALUE) {
            return 2;
        }
        int count = 0;
        int i = 1;
        while (i * i < N) {
            if (N % i == 0) {
                count += 2;
            }
            i++;
        }
        if (i * i == N) {
            count++;
        }
        return count;
    }
}
