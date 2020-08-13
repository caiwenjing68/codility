package L3PermMissingElem;

public class Solution {
    public static int Solution(int[] A) {
        int sum = 0;
        int len = A.length;
        // i+1: 1, len
        for (int i = 0; i < len; i++) {
            sum += i+1 - A[i];

        }
        int ans = sum + len + 1;
        return  ans;
    }
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        int ans = Solution(A);
        System.out.println(ans);
    }
}
