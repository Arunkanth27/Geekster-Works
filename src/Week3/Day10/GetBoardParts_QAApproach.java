package Week3.Day10;

import java.util.*;

public class GetBoardParts_QAApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }

    public static void solve(int n) {
        solve(0, n, "");
    }

    private static void solve(int current, int end, String s) {
        if(current == end) {
            System.out.println(s);
            return;
        }

        if(current > end) {
            return;
        }

        for(int dice = 1 ; dice <= 6 ; dice++) {
            if(current + dice <= end)   //Proactive Condition to avoid
                solve(current + dice, end, s + dice);
        }

    }


}
