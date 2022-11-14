/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static int max(int a, int b){
        return (a>b)?(a):(b);
    }
    public static int min(int a, int b){
        return (a<b)?(a):(b);
    }
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            int c=0;
            int x=sc.nextInt(), y=sc.nextInt();
            System.out.println(min(3*x-2*y,y)+" "+y+" "+max(3*x-2*y,y));

        }

    }
}
