import java.util.Scanner;
import java.util.Stack;

public class WeirdSubArrays {
    public static void print(int[] arr, int s, int e){
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean isOk(int arr[], int s, int e){
        for(int i=s;i<=e-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkfirst(int[] arr, int s, int e){
        for(int i=s;i<=e-1;i++){
            if(arr[i]<arr[i+1]){
                if(!isOk(arr,s,e))return false;
                return true;
            }
        }
        return true;
    }
    // public static boolean isDec(int arr[], int s, int e){
    //     for(int i=s;i<=e-1;i++){
    //         if(arr[i]<arr[i+1]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean isAsc(int[] arr, int s, int e){
        for(int i=s;i<=e-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(--t>=0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(checkfirst(arr,i,j) || isAsc(arr,i,j)){
//                        print(arr,i,j);
                        ans++;

                    }
                }
            }
            System.out.println(ans);

        }
    }
}
