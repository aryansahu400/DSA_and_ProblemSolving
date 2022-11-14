package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

// question, count distint elements in window of size k in an array of size n
public class DistinctEleInWindows {
    public static void main(String[] args) {
        int[] arr ={1,2,2,1,3,1,1,3};
        Scanner sc=new Scanner(System.in);
        int n=8;
        int k=sc.nextInt();
        for(int i=0;i<n-k+1;i++){
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int j=i;j<i+k;j++){
                hm.put(arr[j],1);
            }
            System.out.println(hm.size());
        }

    }
}
