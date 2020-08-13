package L6MaxProductOfThree;

public class Solution {
    public int solution(int[] A) {
        int len = A.length;
        int max1 = 0; // biggest max // > 0
        int max2 = 0;
        int max3 = 0;
        int min1 = 0; // smallest min // < 0
        int min2 = 0;
        int neg_max1 = Integer.MIN_VALUE;
        int neg_max2 = Integer.MIN_VALUE;
        int neg_max3 = Integer.MIN_VALUE;
        int res1 = 0, res2 = 0;
        if (len == 3) {
            return A[0]*A[1]*A[2];
        }
        for (int temp : A) {
            if (temp > 0) {
                if (temp > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = temp;
                } else if (temp <= max1 && temp > max2) {
                    max3 = max2;
                    max2 = temp;
                } else if (temp <= max2 && temp > max3) {
                    max3 = temp;
                }
            } else {
                if (temp < min1) {
                    min2 = min1;
                    min1 = temp;
                } else if (temp >= min1 && temp < min2) {
                    min2 = temp;
                }
                if (temp > neg_max1) {
                    neg_max3 = neg_max2;
                    neg_max2 = neg_max1;
                    neg_max1 = temp;
                } else if (temp <= neg_max1 && temp > neg_max2) {
                    neg_max3 = neg_max2;
                    neg_max2 = temp;
                } else if (temp <= neg_max2 && temp > neg_max3) {
                    neg_max3 = temp;
                }
            }
        }
        // System.out.println(max1);
        // System.out.println(max2);
        // System.out.println(max3);
        // System.out.println(min1);
        // System.out.println(min2);
        res1 = max1*min1*min2;
        res2 = max1*max2*max3;
        if (res1 == 0 && res2 == 0) {
            return neg_max3*neg_max2*neg_max1;
        } else {
            return Math.max(res1, res2);
        }

    }
}
