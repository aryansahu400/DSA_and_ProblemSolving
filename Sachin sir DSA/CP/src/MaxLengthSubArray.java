import java.util.Scanner;

public class MaxLengthSubArray {
    public static int max(int a, int b){
        return (a>b)?(0):(1);
    }
    public static int findLength(int[] arr, int[] brr) {
        int n=arr.length;
        int m=brr.length;
        int maxCount=0;
        for(int i=0;i<n;i++){

        }

        return maxCount;
    }
/*
[1,0,1,0,0,0,0,0,1,1]
[1,1,0,1,1,0,0,0,0,0]
 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] brr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        System.out.println(findLength(arr,brr));
    }
}
