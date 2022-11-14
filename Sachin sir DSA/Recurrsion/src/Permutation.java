/*
Given an array of n integers, print all its permutations

Approach: In each recusrsive call swap the element at index with i,(for that, place each call in
a for loop starting from index to n-1.
 */

import java.util.*;

public class Permutation {

    private static void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    private static void solve(int[] nums, HashSet<ArrayList<Integer>> al, int index){
        if(index>=nums.length){
            ArrayList<Integer> temp=new ArrayList<>(nums.length);
            for(int i=0;i< nums.length;i++){
                temp.add(nums[i]);
            }
            al.add(temp);
            return;
        }

        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            solve(nums,al,index+1);
            swap(nums,i,index);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<ArrayList<Integer>> ans=new HashSet<>();
        solve(arr,ans,0);
        Iterator<ArrayList<Integer>> i=ans.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
