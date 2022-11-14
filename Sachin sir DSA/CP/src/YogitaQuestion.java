import java.util.Scanner;

public class YogitaQuestion {
    public static int max(int[] arr, int start, int end){

        int max=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        k--;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-k;i++){
            System.out.print(max(arr,i,i+k)+" ");
        }
    }
}
