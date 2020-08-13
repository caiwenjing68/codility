package L4FrogRiverOne;

import java.util.HashMap;

public class Solution {
    public int solution(int X, int[] A){
        HashMap<Integer, Integer> lmap = new HashMap<Integer, Integer>();
        int len = A.length;
        int count = 0;
        for (int i=0; i<len; i++) {
            int current = A[i];
            if (lmap.containsKey(current) == false) {
                lmap.put(current, 1);
                count += 1;
                if (count == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}
