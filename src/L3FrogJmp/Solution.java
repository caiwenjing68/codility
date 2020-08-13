package L3FrogJmp;

public class Solution {
    public static int solution(int X, int Y, int D){
        double dividend = Y - X;
        double divisor = D;
        double ans_double = dividend/divisor;
        int ans = (int) Math.ceil(ans_double);
        return ans;
    };

    public static void main(String[] args) {
        int ans = solution(10, 85, 30);
        System.out.println(ans);
    }
}
