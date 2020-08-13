package L5GenomicRangeQuery;

import java.util.HashMap;
import java.util.Map;

public class Solution {
//    public int getNum(char c) {
//        switch (c) {
//            case 'A':
//                return 1;
//            case 'C':
//                return 2;
//            case 'G':
//                return 3;
//            case 'T':
//                return 4;
//            default:
//                return 0;
//        }
//    }
//    public int[] solution(String S, int[] P, int[] Q) {
////        Map<Character, Integer> dna = new HashMap<>();
////        dna.put('A', 1);
////        dna.put('C', 2);
////        dna.put('G', 3);
////        dna.put('T', 4);
//        int s_len = S.length();
//        int len = P.length;
//        int[] res = new int[len];
//        int min = 5;
//        for (int i = 0; i < len; i++) {
//            int l = P[i];
//            int r = Q[i];
//            for (int j= l; j <= r; j++) {
//                char c = S.charAt(j);
////                int temp = dna.get(c);
//                int temp = getNum(c);
//                if (temp < min) {
//                    min = temp;
//                }
//            }
//            res[i] = min;
//            min = 5;
//        }
//        return res;
//    }

    public int[] solution(String S, int[] P, int[] Q) {
        int s_len = S.length();
        int len = P.length;
        int[] res = new int[len];
        int[] a_list = new int[s_len+ 1]; // 1, s_len
        int[] c_list = new int[s_len+ 1];
        int[] g_list = new int[s_len+ 1];
        int a = 0, c = 0, g = 0;

        for (int i = 0; i < s_len; i++) {
            if (S.charAt(i) == 'A') {
                a = 1;
            }
            if (S.charAt(i) == 'C') {
                c = 1;
            }
            if (S.charAt(i) == 'G') {
                g = 1;
            }
            a_list[i+1] = a_list[i] + a;
            c_list[i+1] = c_list[i] + c;
            g_list[i+1] = g_list[i] + g;
            a = 0;
            c = 0;
            g = 0;
        }

        for (int j = 0; j < len; j++) {
            int left = P[j];
            int right = Q[j]+1;
            if ( (a_list[right] - a_list[left]) > 0) {
                res[j] = 1;
            } else if ( (c_list[right] - c_list[left]) > 0) {
                res[j] = 2;
            } else if ( (g_list[right] - g_list[left]) > 0) {
                res[j] = 3;
            } else {
                res[j] = 4;
            }
        }
        return res;
    }
}
