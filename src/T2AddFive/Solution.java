package T2AddFive;

public class Solution {
    //return ans in String
    public static String solution2(int num){
        int pos = 0;
        String numStr = Integer.toString(num);
        int len = numStr.length();

        String ansStr;
        if (num < 0) {
            for (int i=0; i<len; i++) {
                if (numStr.charAt(i) > '5'){
                    pos = i;
                    break;
                }
                if (i == len -1) {
                    pos = len;
                }
            }
        } else {
            for (int i=0; i<len; i++) {
                if (numStr.charAt(i) < '5'){
                    pos = i;
                    break;
                }
                if (i == len -1) {
                    pos = len;
                }
            }
        }

        if (pos == 0) {
            ansStr = "5" + numStr;
        } else if (pos == len) {
            ansStr = numStr + "5";
        } else {
            ansStr = numStr.substring(0, pos) + "5" + numStr.substring(pos, len);
        }
        return ansStr;
    }

    //return ans in int
    public static int solution3(int num){
        int pos = 0;
        String numStr = Integer.toString(num);
        int len = numStr.length();

        String ansStr;
        if (num < 0) {
            for (int i=1; i<len; i++) {
                if (numStr.charAt(i) > '5'){
                    pos = i;
                    break;
                }
                if (i == len -1) {
                    pos = len;
                }
            }
        } else {
            for (int i=0; i<len; i++) {
                if (numStr.charAt(i) < '5'){
                    pos = i;
                    break;
                }
                if (i == len -1) {
                    pos = len;
                }
            }
        }

        if (pos == 0) {
            ansStr = "5" + numStr;
        } else if (pos == len) {
            ansStr = numStr + "5";
        } else {
            ansStr = numStr.substring(0, pos) + "5" + numStr.substring(pos, len); //before position
        }

        int ans = Integer.parseInt(ansStr);
        return ans;

    }
    public static int solution(int N){
        int pos = 0;
        String numStr = Integer.toString(N);
        int len = numStr.length();

        String ansStr = "";
        if (N < 0) {
            for (int i = 1; i < len; i++) {
                if (numStr.charAt(i) > '5'){
                    pos = i;
                    break;
                }
                if (i == len -1) {
                    pos = len;
                }
            }
        } else {
            for (int i = 0; i < len; i++) {
                if (numStr.charAt(i) < '5'){
                    pos = i;
                    break;
                }
                if (i == len -1) {
                    pos = len;
                }
            }
        }

        if (pos == 0) {
            ansStr = "5" + numStr;
        } else if (pos == len) {
            ansStr = numStr + "5";
        } else {
            ansStr = numStr.substring(0, pos) + "5" + numStr.substring(pos, len); //before position
        }

        int ans = Integer.parseInt(ansStr);
        return ans;
    }



    //return position 0, 1, ..., len-1, len before position
    public static int solution4(int num){
        String numStr = Integer.toString(num);
        int len = numStr.length();

        if (num < 0) {
            for (int i=1; i<len; i++) {
                if (numStr.charAt(i) > '5'){
                    return i;
                }
            }
            return len;
        } else {
            for (int i=0; i<len; i++) {
                if (numStr.charAt(i) < '5'){
                    return i; //insert 5 before position: i
                }
            }
            return len;
        }
    };

    public static void main(String[] args) {
        int num = -12; //-46545 -45654
        int pos = solution(num);
        String ansStr = solution2(num);
        int ans = solution3(num);
        System.out.println(pos);
        System.out.println(ans);
        System.out.println(ansStr);
    }

}
