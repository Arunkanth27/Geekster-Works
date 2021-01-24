package Week2.Day7;

import java.util.*;
public class getPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> list = new ArrayList<>();
        System.out.println(solve(s));
    }

    private static ArrayList<String> solve(String s) {
        if(s.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = s.charAt(0);
        String ros = s.substring(1);

        ArrayList<String> rr = solve(ros);
        ArrayList<String> mr = new ArrayList<>();
        for(String rs : rr) {
            for(int i = 0 ; i <= rs.length() ; i++) {
                String ms = rs.substring(0, i) + ch + rs.substring(i);
                mr.add(ms);
            }
        }
        return mr;
    }

}
