import java.util.Arrays;
import java.util.Scanner;
public class isSorted {
    private static boolean isSorted(int[] arr, int n){
        if(n==0){
            return true;
        }
        n--;
        if(isSorted(Arrays.copyOfRange(arr, 1, n),n)&&arr[0]<arr[1]){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(isSorted(arr,arr.length));
    }
}
