
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

    public static boolean contains(ArrayList<Integer> one, ArrayList<Integer> two ){
        boolean[] arr=new boolean[5];
        for(int i=0;i<5;i++){
            arr[one.get(i)-1]=true;
            arr[two.get(i)-1]=true;
        }
        for(int i=0;i<5;i++){
            if(arr[i]==false)return false;
        }
        return true;
    }
    public static boolean isPos(ArrayList<ArrayList<Integer>> al){
        for(int i=0;i<al.size();i++){
            ArrayList<Integer> temp=al.get(i);
            for(int j=i+1;j<al.size();j++){
                ArrayList<Integer> temp2=al.get(j);
                if(contains(temp,temp2)==true)return true;
            }
        }
        return false;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int tt=1;tt<=t;tt++){
            int n=sc.nextInt();
            ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>(n);

            for(int test=1;test<=n;test++){
                int k=sc.nextInt();
                ArrayList<Integer> temp=new ArrayList<>(k);
                for(int j=0;j<k;j++){
                    temp.add(sc.nextInt());
                }
                al.add(temp);
            }
            if(isPos(al))System.out.println("YES");
            else System.out.println("NO");

        }
    }
}

