package Homework.String;

import java.io.*;

import FastScanner.FastScanner;

public class WildCardProblem {
	public static void main(String[] args) throws IOException{
        FastScanner fs = new FastScanner();
		String text = fs.nextLine();
		String pattern = fs.nextLine();
		System.out.println(solve(text, pattern));
    }

	public static boolean solve(String s, String p) {
		if(s.length()==0 && p.length()==0) {
			return true;
		}
		if(p.length()==0 && s.length()!=0) {
			return false;
		}
		if(s.length()==0 && p.length()!=0) {
			if(p.charAt(0)=='*') {
				return solve(s, p.substring(1));
			}
			return false;
		}
		// check 1
		if(p.charAt(0)=='*') {
			boolean ans1 , ans2;
			// i'm taking * as empty here 
			ans1= solve(s,p.substring(1));
			// i'm taking  * as a squence
			ans2= solve(s.substring(1), p);
			return ans1 || ans2;
		}else {
			if(s.charAt(0)!=p.charAt(0) && p.charAt(0)!='?') {
				return false;
			}
			return solve(s.substring(1), p.substring(1));
		}
	}
}

/*

? -> Replace with single character
* -> Replace with null or single or sequence of character

text = baaabab

pattern = *****ba*****ab



pattern = ba*a?



pattern = a*ab




*/