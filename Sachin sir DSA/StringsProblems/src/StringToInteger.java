// https://leetcode.com/problems/string-to-integer-atoi/submissions/

import java.util.Scanner;

public class StringToInteger {
    private static int atoi(String s){
        s=s.trim();
        if(s.length()==0)return 0;
        long res=0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='-'){
            sign=-1;
            ++i;
        } else if (s.charAt(i)=='+') {
            ++i;
        }
        while(i<s.length()){
            char c=s.charAt(i);
            i++;
            if(c<'0' || c>'9'){
                break;
            }
            int digit=c-'0';
            res=(res*10)+digit;
            if (sign==-1){
                if(-res<=Integer.MIN_VALUE)return Integer.MIN_VALUE;
            } else if(res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

        }
        return (int)(sign*res);
    }

    public static void main(String[] args) {
        String s=(new Scanner(System.in)).nextLine();
        System.out.println(atoi(s));

    }
}
