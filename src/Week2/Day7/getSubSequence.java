package Week2.Day7;

import java.util.*;

public class getSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }

    private static ArrayList<String> solve(String s) {
        if(s.length() == 0) {
            ArrayList<String> sample = new ArrayList<>();
            sample.add("");
            return sample;
        }

        char ch = s.charAt(0);
        String str = s.substring(1);
        ArrayList<String> result = solve(str);
        ArrayList<String> resultnew = new ArrayList<>();
        for(String st : result) {
            resultnew.add(st);
            resultnew.add(ch + st);
        }

        return resultnew;
    }


}
