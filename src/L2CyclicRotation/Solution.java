package L2CyclicRotation;

public class Solution {
    public static int[] solution(int[] A, int K) {
        int arrayLen = A.length;
        if (arrayLen == K) {
            return A;
        } else {
            int[] ans = new int[arrayLen];
            for (int i = 0; i < arrayLen; i++) {
                int pos = (i+K) % arrayLen;
                ans[pos] = A[i];
            }
            return ans;
        }
    };

    public static void main(String[] args) {
        int[] test = {9, 3, 9, 3, 9, 7, 9};
        int[] ans = solution(test, 1);
        for (int j = 0; j < test.length; j++) {
            System.out.println(ans[j]);
        }

    }

}
