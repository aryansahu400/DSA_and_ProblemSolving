//count the number of pairs in array which are equal to k



// brute force O(n2)

//logic O(log n): (only on sorted array)two pointer approach, if sum equal hai toh count increment i++ j-- if sum bada hai toh j-- else i++
import java.util.Scanner;
public class PairSum {
    public static int pairSumBruteForce(int[] arr, int k){ //O(n2)
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static int pairSumOptimum(int[] arr, int k){  //O(log n)
        int n=arr.length;
        int i=0, j=n-1;
        int count=0;
        while(i<j){
            if(arr[i]+arr[j]==k){
                ++i;--j;count++;

            }else if(arr[i]+arr[j]>k){
                --j;

            }else{
                ++i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(pairSumOptimum(arr,k));
    }

}
