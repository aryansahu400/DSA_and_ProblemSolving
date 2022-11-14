//impement binary serch for an array usinh recursion

/*
approach: O(log n)
array key, start, end are the arguments,
if(start>end) return false;
!!!!now check mid element!!!!
mid index=s+(end-start)/2;
if mid bada hai toh left array me jao or end ko mid -1 boldo
else right array me jao or strat ko mid +1 boldo
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {

    private static boolean isPresent(int[] arr,int key, int start, int end){

        if(start>end)return false;
        int mid=(start + end)/2;
        if(arr[mid]==key)return true;
        else if(key<arr[mid])return isPresent(arr,key,start,mid-1);
        else return isPresent(arr, key, mid+1, end);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int key=sc.nextInt();
        System.out.println(isPresent(arr,key,0,n-1));
    }
}
