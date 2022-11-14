/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class addToSubsequence
{
    public static void change(int[] arr, int start, int end, int[] max){
        int times=0;
        for(int i=start;i<=end;i++){
            if(arr[i]>max[0]){
                max[0]=arr[i];
            }
            arr[i]+=max[0];

        }
        max[0]=arr[end];
    }
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] max=new int[1];
            max[0]=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>max[0]){
                    max[0]=arr[i];
                }
            }

            int count=0;
            for(int i=0;i<n-1;i++){
                boolean found=false;
                int index=0;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        found=true;
                        index=j;
                        count++;
                        break;
                    }
                }
                if(found){
                    change(arr, index,n-1,max);
                }

            }

            System.out.println(count);
        }
    }
}
