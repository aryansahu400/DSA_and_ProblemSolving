/*
Question: check if the given two strings are permutation of one another..

Using sorting O(n log n): worst whe it comes to time complexity

Using an array of 256 character O(n): Increment the array using the curent eement as an index.
and for the nest string decerement the array using the current char as index
finally itrate over arr[256] if a value is found to be not zero return false

Using hashmaps O(n) but uses more space:
 */

import java.util.*;

public class CheckPermutation {
    private  static boolean isPermSort(String x, String y){

        int al=x.length();
        int bl=y.length();
        if(al==bl){
            char[] a=x.toCharArray();
            char[] b=y.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<al;i++){
                if(a[i]!=b[i])return false;
            }
            return true;
        }
        return  false;
    }
    private static boolean isPermArr(String a, String b){
        int[] arr=new int[256];
        int al=a.length();
        int bl=b.length();
        if(al==bl){
            for(int i=0;i<al;i++){
                arr[a.charAt(i)]++;
            }
            for(int i=0;i<bl;i++){
                arr[b.charAt(i)]--;
            }
            for(int i=0;i<256;i++){
                if(arr[i]!=0){
                    return false;
                }
            }
            return true;
        }
        return false;

    }
    private static boolean isPermHashMap(String a,String b ){
        int al=a.length();
        int bl=b.length();
        if(al!=bl){
            return false;
        }
        HashMap<Character,Integer> x=new HashMap<>();
        HashMap<Character,Integer> y = new HashMap<>();
        for(int i=0;i<al;i++){
            char temp=a.charAt(i);
            int count = x.containsKey(temp) ? x.get(a.charAt(i)) : 0;
            x.put(temp, count + 1);

            temp=b.charAt(i);
            count = y.containsKey(temp) ? y.get(a.charAt(i)) : 0;
            y.put(temp,count+1);
        }
        return x.equals(y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(isPermHashMap(s1, s2)) System.out.println("permutation");
        else System.out.println("not permutation");

        if(isPermArr(s1, s2)) System.out.println("permutation");
        else System.out.println("not permutation");

        if(isPermSort(s1, s2)) System.out.println("permutation");
        else System.out.println("not permutation");
    }
}
