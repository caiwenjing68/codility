package L1BinaryGap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

//    public static int solution1(int N) {
//        String binStr = Integer.toBinaryString(N);
//        int binLen = binStr.length();
//        int max = 0;
//        int start = 0;
//        int end = binLen - 1;
//        while (binStr.charAt(start) != '1' && start < binLen){
//            start++;
//        }
//        while (binStr.charAt(end) != '1' && end > start) {
//            end--;
//        }
//        if (start == end) {
//            return 0;
//        } else {
//            String newStr = binStr.substring(start, end);
//            for (String zeros: newStr.split("1")){
//                System.out.println(zeros);
//                int zerosLen = zeros.length();
//                if (max < zerosLen){
//                    max = zerosLen;
//                }
//            }
//            return max;
//        }
//    }

    public static int solution1(int[] A) {
        int arrayLen = A.length;
        int maxEle = 0;
        //find max element of input array
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
            if (array[j] % 2 == 1) {
                return j;
            }
        }
        return 0;
    }
    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int arrayLen = A.length;
        for (int i = 0; i < arrayLen; i++) {
            if (map.containsKey(A[i])) {
                int occur = map.get(A[i]);
                occur++;
                map.put(A[i], occur);
            } else {
                map.put(A[i], 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
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
