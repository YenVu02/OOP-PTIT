/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

/**
 *
 * @author admin
 */
import java.util.*;

class Match {
    public String code, teamName;
    public long turnover;

    public Match(String code, String teamName, long turnover) {
        this.code = code;
        this.teamName = teamName;
        this.turnover = turnover;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", code, teamName, turnover);
    }
}

public class CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        HashMap<String, ArrayList<String>> myMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String code = sc.nextLine(), name = sc.nextLine(), ticketPrice = sc.nextLine();
            myMap.put(code, new ArrayList<>());
            myMap.get(code).add(name);
            myMap.get(code).add(ticketPrice);
        }
        int n = sc.nextInt();
        ArrayList<Match> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String code = sc.next();
            String tmp = code.substring(1, 3);
            long viewers = sc.nextLong();
            arr.add(new Match(code, myMap.get(tmp).get(0), viewers * Long.parseLong(myMap.get(tmp).get(1))));
        }
        arr.sort((x, y) -> {
            if (x.turnover != y.turnover) {
                if (x.turnover > y.turnover)
                    return -1;
                return 1;
            }
            return x.teamName.compareTo(y.teamName);
        });
        for (Match x : arr)
            System.out.println(x);
    }

}