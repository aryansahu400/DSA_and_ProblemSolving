//find the sum of all the elements present in an array using recursion

//approach O(n): maintain a starting index, and in eac call
// return arr[startingIndex]+sum(arr, ++startingIndex)
// base condition: startingIndex==arr.length-1;


import java.util.Scanner;

public class SumUsingRecursion {
    private static long sum(int[] arr, int startingIndex){
        if(startingIndex==arr.length-1){
            return arr[startingIndex];
        }else if(startingIndex==0)return 0;

        return arr[startingIndex]+sum(arr,++startingIndex);
    }
    public static long arraySum(int[] arr){
        return sum(arr, 0);
    }

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in)
;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arraySum(arr));
    }
}
