package L6Distinct;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solution(int[] A) {
        int len = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int temp = A[i];
            if ( !map.containsKey(temp) ) {
                map.put(temp, 1);
                continue;
            }
        }
        return map.size();
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 3, 3, 4, 4, 5, 5, 1};
        int res = solution(A);
        System.out.println(res);
    }
}
