package L2OddOccurrencesInArray;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        int arrayLen = A.length;
        int maxEle = 0;
        for (int i = 0; i < arrayLen; i++) {
            if (A[i] > maxEle) {
                maxEle = A[i];
            }
        }
        int[] array  = new int[maxEle+1];
        Arrays.fill(array, 0);
        for (int i = 0; i < arrayLen; i++) {
            array[A[i]] += 1;
        }
        for (int j = 0; j <= maxEle; j++) {
            if (array[j] == 1) {
                return j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
//        int ans = solution();
//        System.out.println(ans);
        int[] test = {9, 3, 9, 3, 9, 7, 9};
        int ans = solution(test);
        System.out.println(ans);
    }
}
