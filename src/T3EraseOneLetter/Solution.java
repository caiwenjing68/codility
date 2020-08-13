package T3EraseOneLetter;

public class Solution {
    static String solution(String S) {
        int len = S.length();
        String ans = "";

        for (int i = 0; i < len-1; i++) {
            //first element input[i] > input[i+1]
            if (S.charAt(i) > S.charAt(i + 1)) {
                //delete the i-th char
                if (i==0) {
                    ans = S.substring(1, len);
                } else {
                    ans = S.substring(0, i) + S.substring(i+1, len);
                }
                return ans;
            }
        }
        //delete the last char
        ans = S.substring(0, len-1);
        return ans;
    }


    static String smallest(String input) {
        int len = input.length();
        String ans = "";

        for (int i = 0; i < len-1; i++) {
            //first element input[i] > input[i+1]
            if (input.charAt(i) > input.charAt(i + 1)) {
                //delete the i-th char
                if (i==0) {
                    ans = input.substring(1, len);
                } else {
                    ans = input.substring(0, i) + input.substring(i+1, len);
                }
                return ans;
            }
        }
        //delete the last char
        ans = input.substring(0, len-1);
        return ans;
    }

    static String greatest(String input) {
        int len = input.length();
        String ans = "";

        for (int i = 0; i < len-1; i++) {
            //first element input[i] < input[i+1]
            if (input.charAt(i) < input.charAt(i + 1)) {
                //delete the i-th char
                if (i==0) {
                    ans = input.substring(1, len);
                } else {
                    ans = input.substring(0, i) + input.substring(i+1, len);
                }
                return ans;
            }
        }
        //delete the last char
        ans = input.substring(0, len-1);
        return ans;
    }


    public static void main(String[] args) {

        String s = "d";
        System.out.println(smallest(s));
        System.out.println(greatest(s));
    }
}
