import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RemoveNumbers
{
    public static void remover(int n,Object[] arr, HashSet<Integer> set){
        for(int i=0;i< arr.length;i++){
            int temp=(int)arr[i];
            if((temp%n)==0){
                set.remove(temp);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }

        for(int i=0;i<m;i++){
            int temp=sc.nextInt();
            Object[] arr = set.toArray();
            remover(temp,arr,set);
        }
        for (Integer i:set) {
            System.out.print(i+" ");
        }
    }
}