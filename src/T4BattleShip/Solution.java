package T4BattleShip;


import java.util.HashMap;

class Solution {
    public static String solution(int N, String S, String T) {
        int sunkShips = 0;
        int hitShips = 0;
        //ships
        String[] allShips = S.split(",");
        int numShips = allShips.length;

        //hits
        String[] allHits = T.split(" ");
        int numHits = allHits.length;

        //ships' position
        HashMap<Integer, String> node1 = new HashMap<Integer, String>();
        HashMap<Integer, String> node2 = new HashMap<Integer, String>();
        for (int i = 0; i < numShips; i++) {
            String[] nodes = allShips[i].split(" ");
            node1.put(i, nodes[0]);
            node2.put(i, nodes[1]);
        }

        //count the number of hitShips and sunkShips
        for (int j = 0; j < numShips; j++) {
            int hitTimes = 0;
            String pos1 = node1.get(j);
            String pos2 = node2.get(j);
            int shipArea = (pos2.charAt(1) - pos1.charAt(1) + 1) * (pos2.charAt(0) - pos1.charAt(0) + 1);

            for (String oneHit : allHits) {
                boolean hitThisShip = hitThisShip(pos1, pos2, oneHit);
                if (hitThisShip) {
                    hitTimes++;
                }
            }
            if (hitTimes == shipArea) {
                sunkShips++;
            } else if (hitTimes < shipArea && hitTimes > 0) {
                hitShips++;
            }
        }
        return sunkShips + "," + hitShips;

    };

    public static boolean hitThisShip(String node1, String node2, String hitPoint){
        boolean lengthHit = false, widthHit = false;
        if (node1.charAt(0) <= hitPoint.charAt(0) && hitPoint.charAt(0) <= node2.charAt(0)){
            lengthHit = true;
        }
        if (node1.charAt(1) <= hitPoint.charAt(1) && hitPoint.charAt(1) <= node2.charAt(1)){
            widthHit = true;
        }
        return lengthHit && widthHit;
    };

    public static void main(String[] args) {
//        char ch = 'B';
//        int num = (int)(ch - 'A' + 1) ;
//        System.out.println(num);
//        String ans = solution(10, "1B 2C,2D 4D", "2B 2D 3D 4D 4A");
        // case 1
        int N = 4;
        String S = "1B 2C,2D 4D";
        String T = "2B 2D 3D 4D 4A";
        System.out.println(solution(N, S, T));

        N = 6;
        S = "1A 2B,3B 5B,6B 6D,4C 4D,1D 1D,3E 3E,4F 5F,6E 6E";
        T = "1B 3B 4B 5B 6C 4C 4D 1D 3E 4F";
        System.out.println(solution(N,S,T));

    }
}
