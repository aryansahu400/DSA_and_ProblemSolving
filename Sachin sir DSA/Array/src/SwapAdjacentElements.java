//swap adjacent elements of an array

//logic: do it while taking input

import java.util.Scanner;

public class SwapAdjacentElements {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i+=2) {
            if(i==n-1){
                arr[i]=sc.nextInt();
                continue;
            }

            arr[i+1]=sc.nextInt();
            arr[i]=sc.nextInt();
        }
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
