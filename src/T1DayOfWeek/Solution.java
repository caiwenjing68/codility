package T1DayOfWeek;

import java.util.HashMap;

public class Solution {
    public static String solution1(String day, int K){
        String[] weekday_array = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        HashMap<String, Integer> weekday = new HashMap<String, Integer>() {
            {
                put("Mon", 1);
                put("Tue", 2);
                put("Wed", 3);
                put("Thu", 4);
                put("Fri", 5);
                put("Sat", 6);
                put("Sun", 7);
            }
        };
        int current = weekday.get(day);
        int next = (current + K) % 7;
        String ans = weekday_array[next];
        return ans;
    };

    public static String solution(String S, int K){
        String[] weekday_array = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        HashMap<String, Integer> weekday_map = new HashMap<String, Integer>() {
            {
                put("Sun", 0);
                put("Mon", 1);
                put("Tue", 2);
                put("Wed", 3);
                put("Thu", 4);
                put("Fri", 5);
                put("Sat", 6);
            }
        };

        int current = weekday_map.get(S);
        int next = (current + K) % 7;
        String ans = weekday_array[next];
        return ans;
    }


    public static void main(String[] args) {
        String[] weekday_array = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int K = 23;
        String ans = solution("Sat", K);
        System.out.println(K%7);
        System.out.print(ans);

//        int m = -1000;
//        String s = Integer.toString(m);
//        System.out.print(m);
//        System.out.print(s);
    }
}
