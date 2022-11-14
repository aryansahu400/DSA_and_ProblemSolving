/*
Given an array of size n, find the element which is duplicate in array
 */

/*
brute force O(n2): her element ko her elemnt is compare kr valo
 */

/*
logic 1 O(n lon n) : Sir ka methond implemented via array,
sort the array, sliding window of size 2 leke check krlo if ith or i+1th ele same hai toh voh element return kr vado
 */



/*
logic 2 O(n) using hashSet : if element already exists in set toh print kr vado or bahaar aa jao
 varna usko set me daaldo
 */


import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateInArray {
    private static int bruteForce(int[] arr){
        System.out.println("via brute force");
        int result=Integer.MAX_VALUE;
        first:
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){ result=arr[i]; break first;}
            }
        }
        return result;
    }

    private static int logic1(int[] arr){ // O(n log n)
        System.out.println("Via sorting");
        Arrays.sort(arr);
        int result=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
               return arr[i];

            }
        }

        return result;
    }

    private static int logic2(int[] arr){ // O(n)
        System.out.println("via hashmap");

        HashSet hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                return arr[i];
            }else{
                hs.add(arr[i]);
            }
        }
        return  Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] arr={1,4,5,6,2,3,8,4,10};
        System.out.println(bruteForce(arr));
        System.out.println(logic1(arr));
        System.out.println(logic2(arr));
    }
}
