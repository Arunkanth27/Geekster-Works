package Week3.Day10;

import java.util.*;

public class GetMazePaths_QAApporach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc.nextInt(), sc.nextInt());
    }

    private static void solve(int endrow, int endcolumn) {
        solve(0, 0, endrow, endcolumn, "");
    }

    private static void solve(int cr, int cc, int er, int ec, String s) {

    }
}
