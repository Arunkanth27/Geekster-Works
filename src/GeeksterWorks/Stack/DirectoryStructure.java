package GeeksterWorks.Stack;

import GeeksterWorks.FastScanner;

import java.io.IOException;
import java.util.*;

public class DirectoryStructure {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        String directory = fs.nextLine();
        System.out.println(solve(directory));
    }

    private static String solve(String directory) {
        Stack<String> stack = new Stack<String>();
        String[] strarray = directory.split("/");
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < strarray.length ; i++) {
            String s = strarray[i];
            if(s.equals("..")) {
                stack.pop();
            } else if(s.equals("")) {
                continue;
            } else {
                stack.push(s);
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop() + "/");
        }
        return sb.reverse().toString();
    }
}
