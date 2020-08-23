package L9MaxProfit;

public class Solution {
    // O(n) = n**2
    public int solution1(int[] A) {
        int len = A.length;
        int max = 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                max = Math.max(max, A[j] - A[i]);
            }
        }
        return max;
    }

    public int solution(int[] A) {
        int len = A.length;
        if (len == 0 || A == null) {
            return 0;
        }
        int max_profit = 0;
        int min_price = A[0];
        for (int i = 1; i < len; i++) {
            int temp_profit = Math.max(0, A[i]-min_price);
            min_price = Math.min(A[i], min_price);
            max_profit = Math.max(temp_profit, max_profit);
        }
        return max_profit;
    }
}
